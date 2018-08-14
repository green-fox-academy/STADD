import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userIn = sc.nextInt();
        divideTen(userIn);
    }

    public static void divideTen(int userIn) {
        try {
            int result = 10 / userIn;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        }
    }
}
