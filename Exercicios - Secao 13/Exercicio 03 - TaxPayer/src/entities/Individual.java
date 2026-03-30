package entities;

public final class Individual extends TaxPayer{
    private double healthExpenditures;

    public Individual(String name, double anuallIncome, double healthExpenditures) {
        super(name, anuallIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax(){
        if(anuallIncome < 20000){
            return anuallIncome*0.15 - healthExpenditures*0.50;
        } else {
            return anuallIncome*0.25 - healthExpenditures*0.50;
        }
    }
}
