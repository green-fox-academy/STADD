public class Flower extends Plant {
    Flower(String color) {
        this.setColor(color);
    }

    Flower() {
        this.setWater(0);
    }

    public void waterNeed() {
        if (getWater() <= 5) {
            System.out.println("The " + getColor() + " Flower" + " needs water");
        } else {
            System.out.println("The " + getColor() + " Flower" + " doesnt need water");
        }
    }

}


