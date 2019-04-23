package codes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Stage {
	
	private Rectangle platform = new Rectangle();
	
	public Stage() {
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 540, 800, 20);
	}
}
