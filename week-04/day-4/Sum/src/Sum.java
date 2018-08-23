import java.util.ArrayList;
import java.util.List;

public class Sum {
    private List<Integer> sum;

    public Sum() {
        this.sum = new ArrayList<>();
        sum.add(1);
        sum.add(2);
        sum.add(3);
    }

    public int getSum() {
        int sumAll = 0;
        for (int i = 0; i < sum.size(); i++) {
            sumAll += sum.get(i);
        }
        return sumAll;
    }
}
