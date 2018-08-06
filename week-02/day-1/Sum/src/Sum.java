public class Sum {
    public static void main(String[] args){

        int a = 5;
        int sum = sum(a);
        System.out.println(sum);
    }

    public static int sum(int a){

        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
