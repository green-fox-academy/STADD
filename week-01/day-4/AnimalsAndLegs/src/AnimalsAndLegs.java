import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of chickens");
        int userIn1 = sc.nextInt();
        System.out.println("Now the number of pigs");
        int userIn2 = sc.nextInt();

        System.out.println(userIn1 * 2 + userIn2 * 4);
    }
}
