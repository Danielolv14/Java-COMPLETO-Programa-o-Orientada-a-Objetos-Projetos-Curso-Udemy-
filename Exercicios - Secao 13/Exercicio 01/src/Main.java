import entities.OutsourcedEmployee;

import entities.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> employees = new ArrayList<>();
            for(int i = 0;i<n;i++){
                char t = sc.nextLine().charAt(0);

                if(t == 'y') {
                    String name = sc.nextLine();
                    int hours = sc.nextInt();
                    Double valuePerHours = sc.nextDouble();
                    sc.nextLine();
                    Double additionalCharge = sc.nextDouble();
                    sc.nextLine();
                    employees.add(new OutsourcedEmployee(name, hours, valuePerHours,additionalCharge));
                } else if (t == 'n') {
                    String name = sc.nextLine();
                    int hours = sc.nextInt();
                    Double valuePerHours = sc.nextDouble();
                    sc.nextLine();
                    employees.add(new Employee(name, hours, valuePerHours));
                }
            }

            for (Employee d : employees){
                System.out.println(d.toString());
            }
    }
}
