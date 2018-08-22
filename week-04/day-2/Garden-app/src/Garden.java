import java.util.ArrayList;
import java.util.List;

public class Garden extends Plant{
    private ArrayList<Flower> flowers;
    private ArrayList<Tree> trees;

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

    public double watering(double waterAmount, Flower flower) {
        System.out.println();
        System.out.println("Watering with: " + waterAmount);
        //double a = waterAmount / flowers.size();
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getWater() < 5){

            }
        }
        return flower.getWater() + waterAmount / flowers.size();
    }
}
