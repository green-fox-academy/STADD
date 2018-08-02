import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int userIn = sc.nextInt();

        if(userIn <= 0){
            System.out.println("Not enough");
        }else if(userIn == 1){
            System.out.println("One");
        }else if(userIn == 2){
            System.out.println("Two");
        }else
            System.out.println("A lot");

    }
}
