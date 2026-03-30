package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double anuallIncome, int numberOfEmployees) {
        super(name, anuallIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public double tax() {
        if (numberOfEmployees > 10) {
            return anuallIncome * 0.14;
        } else return anuallIncome * 0.16;
    }
}
