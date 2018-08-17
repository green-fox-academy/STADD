import javax.swing.*;
import java.awt.*;

public class Circles extends JComponent {

    private static int MAX_DEPTH = 4;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 500;
        int y = 500;
        int r = 400;
        int size = 400;

        Graphics2D graphics = (Graphics2D) g;

        drawCircles(graphics, x, y, r, size, 0);
    }

    private void drawCircles(Graphics2D g, int x, int y, int r, int size, int depth) {
        if (depth > MAX_DEPTH) {
            return;
        }


        g.drawOval(x - size / 2, y - size / 2, r, r);

        drawCircles(g, x, y - size / 4, r - size / 2, size / 2, depth + 1);
        drawCircles(g, x + size / 5, y + size / 7, r - size / 2, size / 2, depth + 1);
        drawCircles(g, x - size / 5, y + size / 7, r - size / 2, size / 2, depth + 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Circles main = new Circles();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);

        frame.pack();
        frame.setVisible(true);
    }
}