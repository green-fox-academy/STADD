import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Type in two numbers:");

        int userIn1 = sc.nextInt();
        int userIn2 = sc.nextInt();

        if (userIn1 > userIn2){
            System.out.println(userIn1);
        }else{
            System.out.println(userIn2 + " is the bigger one");
        }
    }
}
