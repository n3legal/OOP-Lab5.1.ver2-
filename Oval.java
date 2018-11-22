import java.awt.Graphics;
public class Oval extends Shape {
    private int x;
    private int y;
    private int length;
    private int height;
    
    Oval() {}
    Oval(int r, int g, int b, int x, int y, int length, int height) {
        super(r, g, b);
        this.x = x;
        this.y = y;
        this.height = height;
        this.length = length;
    }
    
    public void setPosition(int x, int y, int length, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.length = length;
    }

    @Override
    public void paint(Graphics g) {
      g.setColor(color);
      g.fillOval(x, y, length, height);
      g.drawOval(x, y, length, height);
    }

}