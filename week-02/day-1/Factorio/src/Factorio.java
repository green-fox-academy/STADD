public class Factorio {
    public static void main(String[] args){

        int a = 5;
        int factorial = factorio(a);
        System.out.println(factorial);
    }

    public static int factorio(int a){
        int factorial = a;
        for (int i =(a -1); i > 1 ; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
