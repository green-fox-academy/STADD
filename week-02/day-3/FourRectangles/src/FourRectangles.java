import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 30;
        int y = 30;
        Random rand = new Random();
        rectangles(graphics, x, y);
    }

    public static void rectangles(Graphics graphics, int x, int y){

        for (int i = 1; i <= 4; i++) {
            final Color myC = new Color(((255 / i)), (255 / i), (255 / i));
            graphics.setColor(myC);
            graphics.fillRect(x * i, y * i, 10 * i, 10 * i);
        }
    }

    public

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}