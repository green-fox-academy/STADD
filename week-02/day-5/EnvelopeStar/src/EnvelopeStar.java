import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int x = 150;
        int y = 147;
        graphics.setColor(Color.green);
        firstHalf(graphics, x, y);
        secondHalf(graphics, x, y);
    }

    public static void firstHalf(Graphics graphics, int x, int y){
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(x + 10 * i, y, x, 0 + 10 * i);
        }
        for (int j = 0; j < 15; j++) {
            graphics.drawLine(x + 10 * j, y, x, 295 - 10 * j);
        }
    }

    public  static void secondHalf(Graphics graphics, int x, int y){
        for (int j = 0; j < 15; j++) {
            graphics.drawLine(x - 10 * j, y, x, 0 + 10 * j);
        }
        for (int j = 0; j < 15; j++) {
            graphics.drawLine(x - 10 * j, y, x, 295 - 10 * j);
        }
    }

    // Don't touch the code below
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