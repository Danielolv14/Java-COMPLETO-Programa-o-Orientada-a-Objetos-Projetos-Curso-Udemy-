package entities;
import entities.Employee;

public class OutsourcedEmployee extends Employee {
        private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return (hours*valuePerHour) + additionalCharge;
    }

    @Override
    public String toString() {
        return "Employeed: " + Name + "\n" +
                "Payment: " + payment() + "\n";
    }
}
