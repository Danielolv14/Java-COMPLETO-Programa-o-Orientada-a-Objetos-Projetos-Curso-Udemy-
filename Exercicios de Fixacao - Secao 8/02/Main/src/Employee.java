public class Employee {
    private String Name;
    private double GrossSalary;
    private double Tax;

    Employee(String Name, double GrossSalary, double Tax){
        this.Name = Name;
        this.GrossSalary = GrossSalary;
        this.Tax = Tax;
    }

    public void IncreaseSalary(double porcr){
        double porc = this.GrossSalary / porcr;
        this.GrossSalary = this.GrossSalary + porc;
    }

    public void NetSalary(){
        this.GrossSalary = this.GrossSalary - this.Tax;
    }
@Override
    public String toString(){
        return "Name: \n"
                + this.Name
                + "\n"
                + "Gross salary: "
                + this.GrossSalary
                + "\n"
                + "Tax: "
                + this.Tax;
}

public void Updated(){
        System.out.println("Update data: " + toString());
    }
}
