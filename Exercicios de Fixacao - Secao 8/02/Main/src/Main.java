import java.util.Scanner;

public class Main{
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee Employed = new Employee("Ricardo",5000,1000);

        System.out.println(Employed);
        Employed.NetSalary();
        Employed.IncreaseSalary(3000);

        Employed.Updated();
    }
}
