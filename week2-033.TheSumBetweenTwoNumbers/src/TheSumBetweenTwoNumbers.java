
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int upper = Integer.parseInt(reader.nextLine());
            
        int sum = 0;
        
        while (lower <= upper) {
            sum += lower;
            lower++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
