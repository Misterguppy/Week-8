/** Emet Park */
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        boolean counted = false;
        int numCount = 1;
        int Count = 1;
        while(!counted){
            System.out.println(numCount);
            numCount += 1;
            Count += numCount;
            if(numCount == num)
            counted = true;
        }
        System.out.println("The factorial of " +num + " is "+count);
        
    }

}