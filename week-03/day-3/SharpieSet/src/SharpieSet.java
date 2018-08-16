import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    int sum = 0;
    List<Sharpie> sharpies = new ArrayList<>();

    void countUsable(Sharpie sharpie) {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpie.inkAmount > 0) {
                sum++;
            }
        }
    }

    void removeTrash(Sharpie sharpie) {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpie.inkAmount == 0) {
                sharpies.remove(sharpie);
            }
        }
    }
}
