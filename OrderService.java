import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;


public class OrderService {
    // We use a Map to store orders. The key is the order ID.
    private final Map<Integer, Order> orders = new HashMap<>();
    // To generate a unique ID for each order
    private final AtomicInteger orderIdCounter = new AtomicInteger(1);

    public Order createOrder(boolean isTakeout, String address) {
        int newId = orderIdCounter.getAndIncrement();
        Order newOrder = new Order(newId, isTakeout, address);
        orders.put(newId, newOrder);
        System.out.println("Order with ID " + newId + " was successfully created.");
        return newOrder;
    }

    public Optional<Order> findOrderById(int orderId) {
        return Optional.ofNullable(orders.get(orderId));
    }

    public boolean updateOrder(int orderId, boolean isTakeout, String newAddress) {
        Optional<Order> orderOptional = findOrderById(orderId);

        if (orderOptional.isEmpty()) {
            System.out.println("Error: Order with ID " + orderId + " not found.");
            return false;
        }

        Order order = orderOptional.get();

        // Check the 10-minute condition
        LocalDateTime now = LocalDateTime.now();
        long minutesPassed = Duration.between(order.getOrderDateTime(), now).toMinutes();

        if (minutesPassed > 10) {
            System.out.println("Error: More than 10 minutes have passed since the order was placed. It cannot be updated.");
            return false;
        }

        // If it's a takeout order, address is required
        if (isTakeout && (newAddress == null || newAddress.trim().isEmpty())) {
            System.out.println("Error: Address is required for takeout orders.");
            return false;
        }

        order.setTakeout(isTakeout);
        order.setAddress(isTakeout ? newAddress : null); // If it becomes dine-in, clear the address

        System.out.println("Order with ID " + orderId + " was successfully updated.");
        return true;
    }

    public boolean deleteOrder(int orderId) {
        if (orders.containsKey(orderId)) {
            orders.remove(orderId);
            System.out.println("Order with ID " + orderId + " was successfully deleted.");
            return true;
        } else {
            System.out.println("Error: Order with ID " + orderId + " not found.");
            return false;
        }
    }
}

