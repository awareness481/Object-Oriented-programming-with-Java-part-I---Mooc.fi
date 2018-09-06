
import java.util.Scanner;
import java.lang.Math;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        // x^0 added
        int powers = 1;
        int i = 1;
        
        while (i <= limit) {
            powers += Math.pow(2, i);
            i++;
        }
        System.out.println("The result is " + powers);
    }
}
