public class AppendAFunc {
    public static void main(String[] args){

        String typo = "Chinchill";
        String a = appendAFunc(typo);
        System.out.println(a);
    }

    public static String appendAFunc(String a){
        return a + "a";
    }
}
