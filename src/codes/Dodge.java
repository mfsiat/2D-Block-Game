package codes;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Dodge extends JPanel implements KeyListener {
	
	public Dodge() {
		setSize(800, 600);
		setPreferredSize(new Dimension(800, 600));
		setFocusable(true); // Focus on actual key pressed
		addKeyListener(this);
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
		
		g.dispose();
		repaint();
	}
	
//	What will happen when we press any key
	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_W) {
		}
		if(c == KeyEvent.VK_S) {
		}
		if(c == KeyEvent.VK_A) {
		}
		if(c == KeyEvent.VK_D) {
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
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
