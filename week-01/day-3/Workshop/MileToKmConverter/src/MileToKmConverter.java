import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args){

        System.out.println("Type in the distance in km");

        Scanner sc = new Scanner(System.in);
        int userIn = sc.nextInt();
        userIn *= 0.62137119;
        System.out.println(userIn);


    }
}
