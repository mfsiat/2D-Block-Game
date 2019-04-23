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
		this.instance = instance;
		hitbox = new Rectangle(x, y, 32, 32);
		
		
//		the rectangles will always come to downward
		ix = 0;
		iy = 1;
	}
	
	public void move() {
		if(instance.getStage().isCollided(hitbox)) {
			iy = 0;
			dead = true;
		}
		hitbox.x += ix;
		hitbox.y += iy;
	}
	
	public boolean isDead() {
		return dead;
	}
	
	public void draw(Graphics g) {
		move();
		g.setColor(Color.CYAN);
		g.fillRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
	}
	
}
