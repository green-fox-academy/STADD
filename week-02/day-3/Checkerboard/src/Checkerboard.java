import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;
        int a = 37;

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, 38 * 8, 38 * 8);
        row(graphics, x, y, a);

    }

    public static void row(Graphics graphics, int x, int y, int a) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                graphics.setColor(Color.black);
                graphics.fillRect(x + a * j * 2, y + a * i * 2, a, a);
                graphics.fillRect(x + a + a * j * 2, a + a * i * 2 , a, a);
            }

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
            Checkerboard.mainDraw(graphics);
        }
    }
}