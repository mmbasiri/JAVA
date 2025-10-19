import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    private static final OrderService orderService = new OrderService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            try {
                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        handleCreateOrder();
                        break;
                    case 2:
                        handleViewOrder();
                        break;
                    case 3:
                        handleUpdateOrder();
                        break;
                    case 4:
                        handleDeleteOrder();
                        break;
                    case 5:
                        System.out.println("Exit.");
                        return;
                    default:
                        System.out.println("Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter only numbers.");
                sc.nextLine();
            }
            System.out.println("\nPress Enter to continue...");
            sc.nextLine();
        }
    }

    private static void showMenu() {
        System.out.println("=====================================");
        System.out.println("       Food Ordering System        ");
        System.out.println("=====================================");
        System.out.println("1. Create a new order");
        System.out.println("2. View an order");
        System.out.println("3. Update an order");
        System.out.println("4. Delete an order");
        System.out.println("5. Exit");
        System.out.print("Please select an option: ");
    }

    private static void handleCreateOrder() {
        System.out.print("Is this a takeout order? (yes/no): ");
        String takeoutInput = sc.nextLine().trim();
        boolean isTakeout = takeoutInput.equalsIgnoreCase("yes");

        String address = null;
        if (isTakeout) {
            System.out.print("Please enter the full address: ");
            address = sc.nextLine();
            if (address.trim().isEmpty()) {
                System.out.println("Error: Address is required for takeout orders.");
                return;
            }
        }
        orderService.createOrder(isTakeout, address);
    }

    private static void handleViewOrder() {
        System.out.print("Enter the ID of the order you want to view: ");
        int orderId = sc.nextInt();
        sc.nextLine();

        orderService.findOrderById(orderId)
                .ifPresentOrElse(
                        System.out::println, // If the order is found, print it
                        () -> System.out.println("Order with ID " + orderId + " not found.") // If not found
                );
    }

    private static void handleUpdateOrder() {
        System.out.print("Enter the ID of the order you want to update: ");
        int orderId = sc.nextInt();
        sc.nextLine();

        if (orderService.findOrderById(orderId).isEmpty()) {
            System.out.println("An order with this ID does not exist.");
            return;
        }

        System.out.print("Is this a takeout order? (yes/no): ");
        boolean isTakeout = sc.nextLine().trim().equalsIgnoreCase("yes");

        String address = null;
        if (isTakeout) {
            System.out.print("Please enter the new address: ");
            address = sc.nextLine();
        }

        orderService.updateOrder(orderId, isTakeout, address);
    }

    private static void handleDeleteOrder() {
        System.out.print("Enter the ID of the order you want to delete: ");
        int orderId = sc.nextInt();
        sc.nextLine();
        orderService.deleteOrder(orderId);
    }
}

