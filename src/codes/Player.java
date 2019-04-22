package codes;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity{
	
	private int xd, yd;
	
	public Player(int x, int y) {
		super(x,y);
		w = 16; 
		h = 16;
	}
	
//	draw orange sphere
	public void draw(Graphics g) {
		move();
		
		g.setColor(Color.orange);
		g.fillOval(x, y, w, h);
	}
	
	private void move() {
		
	}
	
	public void setXD(int value) {
		xd = value;
	}
	
	public void setYD(int value) {
		yd = value;
	}
}
