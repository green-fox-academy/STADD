import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userIn = sc.nextInt();
        divideTen(userIn);
    }

    public static int divideTen(int userIn) {
        int result = userIn / 10;
        if (result == 0) {
            System.out.println("fail");
        } else {
            System.out.println(result);
        }
        return userIn;
    }
}
