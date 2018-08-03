import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.println("Type in a number");
      int userIn = sc.nextInt();

      for (int a = 1; a <= 10; a++){
            int b = a * userIn;
          System.out.println(a + " * " + userIn + " = " + b);
      }
    }
}
