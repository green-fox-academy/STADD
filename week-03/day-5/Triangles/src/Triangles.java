import javax.swing.*;
import java.awt.*;

public class Triangles extends JComponent {

    private static int MAX_DEPTH = 5;
    static int width = 4;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x0 = 500;
        int y0 = 500;
        int size = 300;

        Graphics2D graphics = (Graphics2D) g;
        int strokeWidth = 2;

        drawTriangle(graphics, x0, y0, size, 0, strokeWidth);
    }

    private void drawTriangle(Graphics2D g, int x0, int y0, int size, int depth, float strokeWidth) {
        if (depth > MAX_DEPTH) {
            return;
        }

        g.setStroke(new BasicStroke(strokeWidth));

        Polygon poly = new Polygon();
        poly.addPoint(x0, y0 - size / 2);
        poly.addPoint(x0 - size / 2, y0 + size / 2);
        poly.addPoint(x0 + size / 2, y0 + size / 2);


        drawTriangle(g, x0 - size / 2, y0 - size / 4, size / 2, depth + 1, strokeWidth);
        drawTriangle(g, x0 + size / 2, y0 - size / 4, size / 2, depth + 1, strokeWidth);
        drawTriangle(g, x0, y0 + size / 2 + size / 4, size / 2, depth + 1, strokeWidth);

        g.drawPolygon(poly);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Triangles main = new Triangles();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);

        frame.pack();
        frame.setVisible(true);
    }
}