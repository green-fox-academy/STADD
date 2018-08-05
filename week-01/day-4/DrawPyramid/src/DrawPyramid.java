import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number");
        int userIn = sc.nextInt();

        for(int i=0;i<userIn;i++){

            for(int j=0;j<userIn-i-1;j++){
                System.out.print(" ");
            }
            for(int k=userIn-i;k<=userIn;k++){
                System.out.print("*");
            }
            for(int k=userIn-i;k<userIn;k++){
                System.out.print("*");
            }
            for(int j=0;j<userIn-i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
