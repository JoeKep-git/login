import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Scanner package for input
        Scanner input = new Scanner(System.in);

        //Menu | Using .trim() to remove whitespace
        System.out.print("Enter your username: ");
        String username = input.nextLine().trim();

        System.out.print("Enter your password: ");
        String password = input.nextLine().trim();

        //Try catch to catch any errors
        try
        {
            //Must match exactly Admin and Password with no whitespace before or after and case sensitive
            if (username.equals("Admin") && password.equals("Password"))
            {
                System.out.println("Welcome " + username);
            }
            else
            {
                throw new Exception("Incorrect username or password");
            }
        }
        catch (Exception e)
        {
            System.err.println("""
                    ACCESS DENIED!
                    Invalid Credentials
                    The login is case sensitive""");
        }
    }
}
