package codes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Entity{
	
	private int xd, yd;
	private Dodge instance;
	
	private Rectangle hitbox;
	
	private int life = 3; //number of life or time we can retry the game
	
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
		g.setColor(Color.orange);
		g.fillOval(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
		g.setColor(Color.WHITE);
		g.drawString("Life: "+life, 20, 20);
	}
	
//	by calling this method the xd and yd value will change
//	this ensures smooth movement
	private void move() {
		if(!instance.getStage().isCollided(hitbox)) {
			yd = 1;
		} else yd = 0;
		hitbox.x += xd;
		hitbox.y += yd;
		
		
//		this detects whether the player is hitting the 
//		enemy so we created a instance on the dodge class 
//		enemyManager and calling it from here so that we can detect the 
//		collision
		if(instance.getEnemyManager().isColliding(hitbox)) {
			if(life > 0) {
				life--;
				hitbox.x = 800 / 2 - w / 2; //when we die we reset our location
				y = 390;
			}else {
				instance.setGameOver(true);
			}
		}
	}
	
	public void setXD(int value) {
		xd = value;
	}
	
	public void setYD(int value) {
		yd = value;
	}
}
