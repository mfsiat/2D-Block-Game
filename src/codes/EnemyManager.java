package codes;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyManager {
	
//	we need to create a  lot of enemies so we create an 
//	arraylist which is abstract 
	private int amount;
	private List<Enemy> enemies = new ArrayList<Enemy>();
	private Dodge instance;
	
	public EnemyManager(Dodge instance, int a) {
		this.amount = a;
		this.instance = instance;
		spawn();
	}
	
	private void spawn() {
		Random random = new Random(); // generate random numbers
		int ss = enemies.size();
		if(ss < amount) {
			for (int i = 0; i < amount - ss; i++) {
				enemies.add(new Enemy(instance, random.nextInt(778), random.nextInt(100) + 1));
			}
		} else if(ss > amount) {
			for (int i = 0; i < ss - amount; i++) {
				enemies.get(0);
			}
		}
	}
	
	public void draw(Graphics g) {
		update();
		for (Enemy e : enemies) e.draw(g);
	}
	
	private void update() {
		boolean re = false;
		for(int i = 0; i < enemies.size(); i++) {
			if(enemies.get(i).isDead()) {
				enemies.remove(i);
				re = true;
			}
		}
		if(re) {
			spawn();
		}
	}
	
	public boolean isColliding(Rectangle hitbox) {
		boolean c = false;
		for(int i = 0; i < enemies.size(); i++) {
			if(hitbox.intersects(enemies.get(i).getHitbox()))
				c = true;
		}
		return c;
	}
}
