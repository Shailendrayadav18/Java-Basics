
import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 -> System.err.println("hello");
            case 2 -> System.out.println("Namste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid button");         
        }
    }
}
