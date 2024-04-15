/** Emet Park */
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int num2 = num;
        input.close();
        int counted = 1;
        for(num = num2; num> 0; num += 1){
            counted = counted * num;
        }
        System.out.println("The factorial of " +num2 + " is "+counted);
        
    }

}