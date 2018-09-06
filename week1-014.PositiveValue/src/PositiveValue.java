
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("The number is ");
        if (a > 0) {
            System.out.println("positive");
        } else {
            System.out.println("not positive");
        }
        // Type your program here:
    }
}
