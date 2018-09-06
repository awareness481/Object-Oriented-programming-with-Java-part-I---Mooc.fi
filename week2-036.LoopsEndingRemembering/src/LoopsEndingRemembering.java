import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers: ");
        int sum = 0;
        int i = 0;
        int even = 0;
        int odd = 0;
        
        while(true) {
            int num = Integer.parseInt(reader.nextLine());
            
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("the sum is " + sum);
                System.out.println("How many numbers: " + i);
                System.out.println("Average: " + (double)sum / i);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
            
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            sum += num;
            i++;
        }
    }
}
