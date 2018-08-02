import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        /*
        int intNum = 0;
        intNum++;
        intNum += 5;        // *= , /=
        double dub = 1.5;
        boolean bool = true;


        System.out.println("Hello World");
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Írd be a neved");
        String név = sc.nextLine();
        System.out.println("Hello " + név +"!");

    }
}