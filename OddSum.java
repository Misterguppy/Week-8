/**Emet Park */
import java.util.*;
public class OddSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        boolean counted = false;
        int numCount = 1;
        int count = 1;
        while(!counted){
            System.out.println(numCount);
            numCount += 2;
            count += numCount;
            if(numCount == num)
            counted = true;
        }
        System.out.println("The sum of the odd numbers of " +num + " is "+ count);
    }
}
