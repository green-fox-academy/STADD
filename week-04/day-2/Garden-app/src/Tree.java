public class Tree extends Plant {
    Tree(String color) {
        this.setColor(color);
    }

    Tree() {
        this.setWater(0);
    }

    public void waterNeed() {
        if (getWater() <= 10) {
            System.out.println("The " + getColor() + " Tree" + " needs water");
        } else {
            System.out.println("The " + getColor() + " Tree" + " doesnt need water");
        }
    }
}
