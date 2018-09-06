import java.util.Scanner;
import java.lang.Math;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        if (a == b) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number: " + Math.max(a, b));
        }
    }
}
