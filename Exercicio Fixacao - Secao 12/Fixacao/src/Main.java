import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdt.parse(sc.next());
        Client c1 = new Client(name, email, birthDate);

        System.out.print("Enter order status: ");
        String statusInput = sc.next();

        ArrayList<OrderItem> orderItems = new ArrayList<>();
        Date today = new Date();
        Order order = new Order(today, status.valueOf(statusInput), orderItems); // ← status.valueOf()

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String namep = sc.next();
            System.out.print("Product price: ");
            double pricep = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityp = sc.nextInt();

            Product product = new Product(namep, pricep);
            OrderItem item = new OrderItem(quantityp, pricep, product); // ← Product direto, não ArrayList
            order.addItem(item);
        }


        System.out.println("\nORDER SUMMARY:");
        System.out.println("Order moment: " + sdt2.format(today));
        System.out.println("Order status: " + order.getOrderStatus());
        System.out.println("Client: " + c1.getName() + " (" + sdt.format(c1.getBirthDate()) + ") - " + c1.getEmail());
        System.out.println("Order items:");
        for (OrderItem item : order.getOrders()) {
            System.out.printf("- %s, $%.2f, Quantity: %d, Subtotal: $%.2f%n",
                    item.getProduct().getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.subTotal());
        }
        System.out.printf("Total price: $%.2f%n", order.total());
    }
}