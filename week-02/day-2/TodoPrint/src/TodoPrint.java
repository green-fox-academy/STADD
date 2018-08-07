public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        StringBuffer a = new StringBuffer(todoText);
        int index = 0;
        a.insert(index, "My todo:\n");
        int index2 = 21;
        a.insert(index2," - Download games\n");
        int index3 = 39;
        a.insert(index3, "     - Diablo\n");

        System.out.println(a);
    }
}