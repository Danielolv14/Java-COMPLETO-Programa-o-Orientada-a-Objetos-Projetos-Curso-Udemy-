import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        ArrayList<TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); // limpar buffer
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Individual(name, income, health));

            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Company(name, income, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}