import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)



        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, 320, 343);
        for (int j = 0; j < 15; j++) {
            Random rand = new Random();
            float r = rand.nextFloat();
            stars(graphics, r);
            Color randomColor = new Color(r, r, r);
            graphics.setColor(randomColor);
        }

    }

    public static void stars(Graphics graphics, float r){
        for (int i = 0; i < 6; i++) {
            Random rn = new Random();
            int range = 300 - 0 + 1;
            int c =  rn.nextInt(range) + 0;

            int ra = 300 - 0 + 1;
            int d =  rn.nextInt(ra) + 0;
            graphics.fillRect(c, d, 5, 5);



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