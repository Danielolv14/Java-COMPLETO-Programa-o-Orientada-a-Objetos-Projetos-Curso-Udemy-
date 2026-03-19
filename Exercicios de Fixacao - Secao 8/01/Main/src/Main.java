import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Retangulo r1 = new Retangulo(width,height);

        System.out.println(r1);
    }
}
