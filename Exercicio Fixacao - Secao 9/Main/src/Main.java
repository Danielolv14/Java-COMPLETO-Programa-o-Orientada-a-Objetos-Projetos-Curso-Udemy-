import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount Acc;

        System.out.println("Enter account number: ");
        String nAccount = sc.nextLine();
        System.out.println("Enter account holder: ");
        String Name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        Character b = sc.next().charAt(0);
        if (b == 'y') {
            System.out.println("Enter initial deposit value: ");
            double InitialDeposit = sc.nextDouble();
            Acc = new BankAccount(Name, nAccount, InitialDeposit);
        } else {
            Acc = new BankAccount(Name, nAccount);
        }
        System.out.println(Acc.toString());
        System.out.println("Enter a deposit value: ");
        double value = sc.nextDouble();
        Acc.deposit(value);
        System.out.println(Acc.toString());

        System.out.println("Enter a withdraw value: ");
        double value2 = sc.nextDouble();
        Acc.withdraw(value2);
        System.out.println(Acc.toString());
    }}




