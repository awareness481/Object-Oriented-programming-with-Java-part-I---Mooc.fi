
import java.util.Scanner;
import java.lang.Math;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      
        // Program your solution here
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        System.out.println("Circumference of the circle: " + (radius * 2 * Math.PI));
    }
}
