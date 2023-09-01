import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

public class BetterLogin
{
    //creating a 2d string array containing usernames and passwords for 5 users
    private static final String[][] users = {
            {"admin", "Password"},
            {"bruce", "Wayne"},
            {"selina", "Kyle"},
            {"tim", "Drake"},
            {"dick", "Grayson"}};

    public static void main(String[] args)
    {
        //Scanner package for input
        Scanner input = new Scanner(System.in);

        //byte for attempts as the number of attempts is low and require less memory
        byte attempts = 0;
        //Try catch to catch any errors
        do
        {
            try
            {
                //Menu | Using .trim() to remove whitespace
                System.out.print("Enter your username: ");
                String username = input.nextLine().trim().toLowerCase();

                System.out.print("Enter your password: ");
                String password = input.nextLine().trim();

                //attempts increase
                attempts++;

                //put for loop in if else because this will stop calling the loop if the pass is empty
                //rather than still going through the loop when it is empty
                if(password.isEmpty())
                {
                    System.out.println("Password is Empty!");
                }
                else
                {
                        //Must match the username and password in array (username not case-sensitive)
                        //with no whitespace before or after
                        if(login(username, password))
                            return;
                }
            }
            catch (Exception e)
            {
                //error message for exception
                System.err.println("""
                        ACCESS DENIED!
                        Invalid Credentials
                        Password is case sensitive""");
            }
        } while (attempts < 3);
        System.err.println("Too many attempts");
    }

    public static boolean login(String username, String password)
    {
        for (String[] accounts: users)
        {
            if (accounts[0].equals(username) && accounts[1].equals(password))
            {
                System.out.println("Welcome : " + accounts[0]);
                //ends the program
                return true;
            }
        }
        return false;
    }
}
