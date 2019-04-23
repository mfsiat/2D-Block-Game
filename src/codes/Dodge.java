package codes;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Dodge extends JPanel implements KeyListener {
	
	private Player player; // created a player instance
	private Stage stage;
	
	public Dodge() {
		setSize(800, 600);
		setPreferredSize(new Dimension(800, 600));
		setFocusable(true); // Focus on actual key pressed
		addKeyListener(this);
		
		stage = new Stage();
		player = new Player(this, 200, 200);
	}
	
//	for preventing flicker 
//	built in method update buffers g to stop flickering
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	// built in method that takes graphics g as perameter
	// it helps to draw
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		stage.draw(g);
		player.draw(g);
		
		g.dispose();
		repaint();
	}
	
//	What will happen when we press any key
	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_W) {
//			player.setYD(-1);
		}
		if(c == KeyEvent.VK_A) {
			player.setXD(-1);
		}
		if(c == KeyEvent.VK_S) {
//			player.setYD(1);
		}
		if(c == KeyEvent.VK_D) {
			player.setXD(1);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		player.setXD(0);
		player.setYD(0);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
	}
	
	public Stage getStage() {
		return stage;
	}
	
	public static void main(String [] args) {
		Dodge game = new Dodge();
		
		JFrame frame = new JFrame();
		frame.setTitle("Dodge the Rectangles");
		frame.add(game);
		frame.pack();
		frame.setResizable(false);   
		frame.setSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // centers the frame in the middle of the screen
		frame.setVisible(true);
	}


}	
