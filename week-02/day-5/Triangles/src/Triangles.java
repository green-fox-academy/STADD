import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        triangle(graphics);

    }

    public static void triangle(Graphics graphics) {
        int x = 0;
        int y = 295;

        drawLines(graphics, x, y);
    }

    public static void drawLines(Graphics graphics, int x, int y) {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21 - i; j++) {
                Polygon poly = new Polygon();
                poly.addPoint(x + 10 * j + i * 5, y - 10 * i);
                poly.addPoint(x + 10 + 10 * j + i * 5, y - 10 * i);
                poly.addPoint(x + 5 + 10 * j + 5 * i, y - 10 - 10 * i);
                graphics.drawPolygon(poly);
            }
        }

    }

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}