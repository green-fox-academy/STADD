import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter five numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a + b + c + d + e;
        double ave =  (a + b + c + d + e) / 5;

        System.out.println("Sum: " + sum + ", Average: " + ave);
    }
}
