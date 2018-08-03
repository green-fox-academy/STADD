import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Type in two numbers");
        int userIn = sc.nextInt();
        int userIn2 = sc.nextInt();

        if(userIn > userIn2){
            System.out.println("The second number should be bigger");
        }else{
            for (int a = userIn; a < userIn2; a++){
                System.out.println(a);
            }
        }
    }
}
