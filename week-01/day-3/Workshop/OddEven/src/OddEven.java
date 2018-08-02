import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number to see if its even or odd:");
      int userIn = sc.nextInt();

      if ((userIn % 2) == 0){
          System.out.println("Even");
      }else{
          System.out.println("Odd");
      }
    }
}
