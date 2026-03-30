package entities;

public class Employee {
    protected String Name;
    protected Integer hours;
    protected double valuePerHour;

    public Employee(String name, Integer hours, double valuePerHour) {
        Name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return valuePerHour*hours;
    }
    @Override
    public String toString() {
        return "Employeed: " + Name + "\n" +
                "Payment: " + payment() + "\n";
    }

}
