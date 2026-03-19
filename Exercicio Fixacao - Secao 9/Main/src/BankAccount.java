public class BankAccount {
    private static String nAccount;
    private String Name;
    private double InitialDeposit;
    private double balance;

    public BankAccount(String name,String nAccount, double InitialDeposit) {
        Name = name;
        this.nAccount = nAccount;
        this.InitialDeposit = InitialDeposit;
        this.balance = InitialDeposit;
    }

    public BankAccount(String name,String nAccount) {
        Name = name;
        this.nAccount = nAccount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public void deposit(double value){
        this.balance = balance + value;
    }

    public void withdraw(double value){
        this.balance = balance - value - 5;
    }

    @Override
    public String toString() {
        return "Account data:\n" +
                "Account " + this.nAccount + ", Holder: " + this.Name + ", Balance: $ " + this.balance;

    }
}
