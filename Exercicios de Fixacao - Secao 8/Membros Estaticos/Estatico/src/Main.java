package Estatico;
import java.util.Scanner;
import Estatico.CurrencyConverter;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceDollar = sc.nextDouble();
        double quantity = sc.nextDouble();
        System.out.println("Price: " + CurrencyConverter.Price(quantity, priceDollar));


    }
}
