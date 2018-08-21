import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List flowers;
    private List trees;

    Garden() {
        this.flowers = new ArrayList();
        this.trees = new ArrayList();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void watering(int waterAmount) {
        System.out.println();
        System.out.println("Watering with: " + waterAmount);


    }
}
