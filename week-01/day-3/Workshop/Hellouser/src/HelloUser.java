import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Enter your name:");

        Scanner sc = new Scanner(System.in);
        String userIn = sc.nextLine();

        System.out.println("Hello, " + userIn);
    }
}