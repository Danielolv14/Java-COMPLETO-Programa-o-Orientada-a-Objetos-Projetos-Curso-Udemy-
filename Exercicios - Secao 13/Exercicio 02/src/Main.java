import entities.ImportedProduct;
import entities.UsedProduct;
import entities.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<Product> products = new ArrayList<>();
    for (int i = 0; i < n; i++){
        System.out.println("Product #" + (i+1) +" data:");
        System.out.print("Common, used or imported (c/u/i)?");
        char y = sc.nextLine().charAt(0);
        System.out.println("Name: ");
            String name = sc.nextLine();
        System.out.println("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if(y == 'c'){
                products.add(new Product(name,price));
            } else if (y == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                DateTimeFormatter sgt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(sc.nextLine(),sgt);
                products.add(new UsedProduct(name,price,date));
            } else if (y == 'i') {
                System.out.print("Customs fee: ");
                double customfee = sc.nextDouble();
                sc.nextLine();
                    products.add(new ImportedProduct(name,price,customfee));
            }}

        System.out.println("PRICE TAGS:");
            for(Product p : products){
                System.out.println(p.priceTag());
            }
    }
}
