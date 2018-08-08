import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int x = 350;
        final Color myC = new Color(((255)), (255), (255));
        drawSquare(graphics, x, myC);
    }

    public static void drawSquare(Graphics graphics, int x, final Color myC){
        int a = -25;
        int b = -25;
        int c = 50;
        for (int i = 1; i <=13 ; i++) {
            final Color col = new Color(((100/i)), (255 / i), (150));
            graphics.setColor(col);
            graphics.fillRect(a + 25 * i, b + 25 * i, x - c * i, x - c * i);
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