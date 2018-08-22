public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree = new Tree("purple");
        Tree tree2 = new Tree("orange");
        Garden garden = new Garden();

        //Fill up the garden
        garden.addFlower(flower);
        garden.addFlower(flower2);
        garden.addTree(tree);
        garden.addTree(tree2);

        //Print the water need
        flower.waterNeed();
        flower2.waterNeed();
        tree.waterNeed();
        tree2.waterNeed();

        //Water plants
        garden.watering(40, flower);
        garden.watering(40, flower2);


        flower.waterNeed();
        flower2.waterNeed();
        tree.waterNeed();
        tree2.waterNeed();
    }
}
