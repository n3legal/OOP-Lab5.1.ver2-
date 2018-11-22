import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String;
public class Main extends JFrame {
    Shape[] shapes = new Shape[20];

    Main() {
        super("Фигуры");
        setBackground(Color.WHITE);
        setLayout(null);
        setSize(1300, 900);
        createShapes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createShapes() {
        for(int i = 0; i < 20; i++) {
            int rand = (int) (Math.random() * 2.1);
            switch(rand) {
                case 0: shapes[i] = new Oval();
                    shapes[i] = createOvalPos(shapes[i]); break;
                case 1: shapes[i] = new Rectangle();
                    shapes[i] = createRectPos(shapes[i]); break;
                case 2: shapes[i] = new Polygon();
                    shapes[i] = createPolyPos(shapes[i]); break;
                default: break;
            }
            shapes[i].setColor();
            add(shapes[i]);
            shapes[i].setBounds(0, 0, 1200, 800);
        }
    }

    public Oval createOvalPos(Shape shape) {
        Oval oval = (Oval) shape;
        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 700);
        int length = (int) (Math.random() * 150);
        int height = (int) (Math.random() * 150);
        oval.setPosition(x, y, length, height);
        return oval;
    }

    public Rectangle createRectPos(Shape shape) {
        Rectangle rectangle = (Rectangle) shape;
        int x = (int) (Math.random() * 1200);
        int y = (int) (Math.random() * 800);
        int length = (int) (Math.random() * 150);
        int height = (int) (Math.random() * 150);
        rectangle.setPosition(x, y, length, height);
        return rectangle;
    }

    public Polygon createPolyPos(Shape shape) {
        Polygon polygon = (Polygon) shape;
        int[] x = new int[5];
        int[] y = new int[5];
        for(int i = 0; i < 5; i++) {
            x[i] = (int) (Math.random() * 150);
            y[i] = (int) (Math.random() * 150);
        }
        polygon.setPosition(x, y);
        return polygon;
    }

    public static void main(String[] args) {
        new Main();
    }

}
