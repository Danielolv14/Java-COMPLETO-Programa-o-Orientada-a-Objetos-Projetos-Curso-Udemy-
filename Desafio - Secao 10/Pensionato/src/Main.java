import entities.Room;
import java.util.Scanner;


public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];

        int n = sc.nextInt();
            for(int i =0; i < n;i++){
                System.out.println("Choose your Room: ");
                    int c = sc.nextInt();
                    sc.nextLine();
                System.out.println("Your Name: ");
                    String name = sc.nextLine();
                System.out.println("Your Email: ");
                    String email = sc.nextLine();
                    rooms[c] = new Room(name, email);
            }
        for(int i =0; i < rooms.length;i++){
            if(rooms[i] != null) {
                System.out.println("Room " + i + ": " + rooms[i].toString());
            } else {
                System.out.println("Room " + i + ": vacant");
            }
        }
        sc.close();
    }
}

