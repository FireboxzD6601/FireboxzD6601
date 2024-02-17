//import scanner
import java.util.Scanner;

public class Main { // Make sure the class name is same as the filename
    public static void main(String[ ] args) {
        // Print Out Message With Line Created
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name:  ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
