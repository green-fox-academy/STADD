import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number:");

        int userIn = sc.nextInt();
        int a = 0;
        String s = "";

        while(a < userIn){
            a++;
            s += "*";
            System.out.println(s);
        }
    }
}
