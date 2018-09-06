
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int upper = Integer.parseInt(reader.nextLine());
        
        while(lower<=upper) {
            System.out.println(lower);
            lower++;
        }
    }
}
