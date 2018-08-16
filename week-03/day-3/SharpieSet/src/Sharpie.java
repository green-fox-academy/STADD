public class Sharpie {
    String color;
    float width;
    float inkAmount;

    Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    void use() {
        inkAmount -= (Math.random() * 100.0 - 1.0) + 1.0;
    }
}