import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int x = 300;
        int y = 295;
        graphics.setColor(Color.magenta);
        drawLine1(graphics, x, y);
        graphics.setColor(Color.green);
        drawLine2(graphics, x, y);
    }

    public static void drawLine1(Graphics graphics, int x, int y){
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(x - 20 * i, 0, x, y - 20 * i);
        }
    }

    public  static void drawLine2(Graphics graphics, int x, int y){
        for (int j = 0; j < 15; j++) {
            graphics.drawLine(0, y - 20 * j, x - 20 * j, y);
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