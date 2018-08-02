import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("First type the number of girls, then the boys who comes to the party!");

        int userIn1 = sc.nextInt();
        int userIn2 = sc.nextInt();

        if(userIn1 == userIn2 && userIn1 + userIn2 >= 20){
            System.out.println("The party is excellent!");
        }else if(userIn1 + userIn2 >= 20 && userIn1 != userIn2){
            System.out.println("Quite cool party!");
        }else if(userIn1 + userIn2 < 20){
            System.out.println("Average party...");
        }else if(userIn1 == 0){
            System.out.println("Sausage party");
        }
    }
}
