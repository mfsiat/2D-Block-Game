package codes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Entity{
	
	private int xd, yd;
	private Dodge instance;
	
	private Rectangle hitbox;
	
	public Player(Dodge instance, int x, int y) {
		super(x,y);
		this.instance = instance;
		w = 16; 
		h = 16;
		
		hitbox = new Rectangle(x, y, w, h);
	}
	
//	draw orange sphere
	public void draw(Graphics g) {
		move();
		if(!instance.getStage().isCollided(hitbox)) {
			yd = 1;
		} else yd = 0;
		g.setColor(Color.orange);
		g.fillOval(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
	}
	
//	by calling this method the xd and yd value will change
//	this ensures smooth movement
	private void move() {
		hitbox.x += xd;
		hitbox.y += yd;
	}
	
	public void setXD(int value) {
		xd = value;
	}
	
	public void setYD(int value) {
		yd = value;
	}
}
