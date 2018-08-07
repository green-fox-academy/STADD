import java.util.ArrayList;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Now enter " + number + " number");
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int i = 0; i < number; i++) {
           int d = sc.nextInt();
           sum.add(d);
        }
        int summ = 0;
        for (int i = 0; i < sum.size(); i++) {
            summ += sum.get(i);
        }
        double ave = summ/sum.size();

        System.out.println("Sum: " + summ + ", Average: " + ave);

        //double ave =  (a + b + c + d + e) / 5;

        //System.out.println("Sum: " + sum + ", Average: " + ave);
    }
}
