import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int userIn = sc.nextInt();

        String s = "";

        for (int i = 1; i <= userIn; i++) {
            for (int j = 1; j <= userIn; j++) {
                if(i == 1 || i == userIn){
                    System.out.print("%");
                }else if(j == 1 || j == userIn){
                    System.out.print("%");
                }else if (j > i){
                    System.out.print(" ");
                }else if(j == i){
                    System.out.print(s + "%");
                    s += " ";
                }
            }
            System.out.println();
        }

    }
}