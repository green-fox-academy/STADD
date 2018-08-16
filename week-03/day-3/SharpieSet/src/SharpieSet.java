public class SharpieSet {
    static int sum;


    static void countUsable(Sharpie sharpie) {
        if (sharpie.inkAmount > 0) {
            sum ++;
        }
    }

    static void removeTrash(Sharpie sharpie) {
        if (sharpie.inkAmount == 0) {
        }
    }
}
