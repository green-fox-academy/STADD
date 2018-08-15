public class Sharpie {
    String color;
    float width;
    int inkAmount = 100;

    Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount -= 1;
    }
}
