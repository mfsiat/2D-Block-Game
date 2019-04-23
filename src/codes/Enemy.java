package codes;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends Entity{
	
	private Rectangle hitbox;
	private int ix, iy;
	private boolean dead;
	private Dodge instance;
	
	public Enemy(Dodge instance, int x, int y) {
		super(x, y);
		hitbox = new Rectangle(x, y, 64, 64);
	}
	
	public void move() {
		
	}
	
	public void draw(Graphics g) {
		move();
		g.setColor(Color.CYAN);
		g.fillRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
	}
	
}
