import java.awt.*;
import java.applet.*;
public class Rectangle {

	private Point topLeft;
	private int width,height;

	public void Rectange(int width, int height) {
		this.topleft = new Point(x,y);
		this.width = width;
		this.height = height;
	}
	public void draw(Graphics g) {
		Color originalColor = g.getColor();
		g.setColor(color);
		g.fillRect(topLeft.getX(), topLeft.getY(), width, height, color;
		g.setColor(originalColor);
	}
}