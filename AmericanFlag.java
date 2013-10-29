import java.awt.*;
import java.applet.*;

public class AmericanFlag{
	private Rectangle union;
	private Rectangle[] stripes;
	private Point topLeft;
	private int width = 190, height = 100;
	private double scale;

	public AmericanFlag(int x, int y, double scale) {
		this.topLeft = new Point(x,y);
		this.scale = scale;
		this.width *= scale;
		this.height *= scale;

		int stripeHeight = (int) (this.height / 13);
		int unionWidth = (int) (this.width * 2.0/5.0);
		int unionHeight = 7 * stripeHeight;

		union = new Rectangle(x,y,unionWidth,unionHeight,Color.blue);

		stripes = new Rectangle[13];
		for (int i = 0; i<stripes.length ; i++) {
			Color color = Color.red;
			if (i % 2 ==1) {
				color = Color.white;
			}
			Rectangle stripe = new Rectangle(x,y+i*stripeHeight, width, height, color);
		}
	}
	public void draw(Graphics g) {		
		for (Rectangle stripe:stripes ) {
			stripe.draw(g);
		}
		union.draw(g);
	}
}

