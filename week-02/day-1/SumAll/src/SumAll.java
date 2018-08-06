import java.util.stream.*;

public class SumAll {
    public static void main(String[] args){

        int[] ai = new int[]{3, 4, 5, 6, 7};
        int sum = IntStream.of(ai).sum();
        System.out.println(sum);

    }
}
