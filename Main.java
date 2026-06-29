import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registration ===");

        System.out.print("Enter Username: ");
        String regUser = sc.nextLine();

        System.out.print("Enter Password: ");
        String regPass = sc.nextLine();

        if(regPass.length() < 8)
        {
            System.out.println("Password must contain at least 8 characters");
            return;
        }

        System.out.println("\nRegistration Successful!");

        System.out.println("\n=== Login ===");

        System.out.print("Enter Username: ");
        String loginUser = sc.nextLine();

        System.out.print("Enter Password: ");
        String loginPass = sc.nextLine();

        boolean loggedIn = false;

        if(regUser.equals(loginUser) && regPass.equals(loginPass))
        {
            loggedIn = true;
            System.out.println("Login Successful");
            System.out.println("Session Created");
        }
        else
        {
            System.out.println("Invalid Username or Password");
        }

        if(loggedIn)
        {
            System.out.println("\nType LOGOUT to exit:");
            String logout = sc.nextLine();

            if(logout.equalsIgnoreCase("LOGOUT"))
            {
                loggedIn = false;
                System.out.println("Session Destroyed");
                System.out.println("Logged Out Successfully");
            }
        }

        sc.close();
    }
}