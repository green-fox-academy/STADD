public class Plant {
    private String color;
    private int waterLevel;

    Plant(String color, int waterLevel) {
        this.setColor(color);
        this.setWater(waterLevel);
    }

    Plant() {
        this.setWater(0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWater() {
        return waterLevel;
    }

    public void setWater(int water) {
        this.waterLevel = water;
    }
}
