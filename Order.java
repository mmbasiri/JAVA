import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Order {
    private final int orderId;
    private final LocalDateTime orderDateTime;
    private boolean isTakeout;
    private String address;

    // create a new order
    public Order(int orderId, boolean isTakeout, String address) {
        this.orderId = orderId;
        this.orderDateTime = LocalDateTime.now();
        this.isTakeout = isTakeout;

        // If the order is a takeout, an address must be provided
        if (isTakeout && (address == null || address.trim().isEmpty())) {
            throw new IllegalArgumentException("Address is required for takeout orders.");
        }
        this.address = address;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public boolean isTakeout() {
        return isTakeout;
    }

    public String getAddress() {
        return address;
    }

    public void setTakeout(boolean takeout) {
        isTakeout = takeout;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = orderDateTime.format(formatter);

        StringBuilder sb = new StringBuilder();
        sb.append("Order Details:\n");
        sb.append("===============\n");
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Date and Time: ").append(formattedDateTime).append("\n");
        sb.append("Order Type: ").append(isTakeout ? "Takeout" : "Dine-in").append("\n");
        if (isTakeout) {
            sb.append("Address: ").append(address).append("\n");
        }
        sb.append("===============\n");
        return sb.toString();
    }
}

