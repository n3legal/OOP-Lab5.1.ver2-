import java.awt.Graphics;
public class Polygon extends Shape{
    public int[] x;
    public int[] y;
    Polygon() {}
    Polygon(int r, int g, int b, int[] x, int[] y) {
        super(r, g, b);
        this.x = x;
        this.y = y;
    }
    
    public void setPosition(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void paint(Graphics g) {
      g.setColor(color);
      g.fillPolygon(x, y, 5);
      g.drawPolygon(x, y, 5);
    }
    
}