import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();

        List<Employee> Employees = new ArrayList<>();
            for(int i =0; i < n;i++){
                int id = sc.nextInt();
                sc.nextLine();
                int finalId = id;
                while(Employees.stream().anyMatch(u -> u.getId() == finalId)){
                    System.out.println("Id Repetido, Digite outro:");
                    id = sc.nextInt(); //
                }
                String name = sc.nextLine();
                double salary = sc.nextDouble();
                Employees.add(new Employee(id,name,salary));
            }
        System.out.println("Enter the employee id that will have salary increase:");
            int id = sc.nextInt();
        boolean jaExiste = Employees.stream()
                .anyMatch(e -> e.getId() == id);
        if (!jaExiste) {
            System.out.println("This id does not exist!");
        } else {
        System.out.println("Enter the percentage:");
            double x = sc.nextDouble();
                for(Employee y : Employees){
                    if(y.getId().equals(id)){
                        y.BonusSalary(x);
                        break;
                    }
                }
                int i = 1;
        for(Employee h : Employees){
            System.out.println(h.toString(h,i));
            i++;
        }
    }
}}
