// Emet Park 
import java.util.*; // for Scanner

public class Banking
{
    public static void main(String[] args)
    {
        String secretPassword = "letmein";
        // create a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        boolean authorized = true; // assume password check successful
        if (password.equals(secretPassword)==false)
        {
            System.out.print("Incorrect: enter your password:");
            password = input.nextLine();
        }
        if (password.equals(secretPassword)==false)
        {
            System.out.print("Access Denied");
            authorized = false;
        }
        // STUDENT CODE HERE to verify user password


        if (authorized)        
        {
            
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Deposit $20");
            System.out.println("2. Withdraw $20");
            System.out.println("3. See balance");
            int option = input.nextInt();

            input.close();  // done with scanner
            switch(option)
            {
                case 1:
                    System.out.println("We have added $20 to your account");
                    break;
                case 2:
                    System.out.println("We have removed $20 from your account");
                    break;
                case 3:
                    System.out.println("Your balance is $100");
                    break;
                default:
                    System.out.println("Unrecognized option");
            }
        }
        System.out.println("Thank you for banking with us");
    }
} 