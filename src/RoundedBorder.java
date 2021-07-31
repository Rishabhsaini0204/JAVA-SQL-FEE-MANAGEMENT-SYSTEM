import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class RoundedBorder implements Border {

	private int radius;
	RoundedBorder(int radius)
	{this.radius=radius;}
	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		 g.drawRoundRect(x, y, width-2, height-2, radius, radius);

	}

	@Override
	public Insets getBorderInsets(Component c) {
		// TODO Auto-generated method stub
		return new Insets(this.radius+1, this.radius+1, this.radius+1, this.radius);
	}

	@Override
	public boolean isBorderOpaque() {
		// TODO Auto-generated method stub
		return true;
	}

}
