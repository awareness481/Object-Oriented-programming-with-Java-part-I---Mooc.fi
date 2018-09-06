import java.util.ArrayList;
import java.lang.Math;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int i : list) {
            sum += i;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double totalSum = 0;
        double avg = average(list);
        for (int i : list) {
            totalSum += Math.pow(i - avg, 2);
        }
        
        return totalSum / (list.size() - 1.0);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
