import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
	
	private AmericanFlag flag1,flag2,flag3;
	public void init() {
		flag1 = new AmericanFlag(50, 50, 1.0);
		flag2 = new AmericanFlag(50, 250, 2.0);
		flag3 = new AmericanFlag(50, 550, 3.0);

	}

	public void paint(Graphics g) {
		flag1.draw(g);
		flag2.draw(g);
		flag3.draw(g);
	}

}