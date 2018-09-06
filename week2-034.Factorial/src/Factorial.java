import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        int factorial = 1;
        int i = 1;
        while (i <= limit) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
