//import scanner
import java.util.Scanner;

public class JavaTakingInput { 
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name:  ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
