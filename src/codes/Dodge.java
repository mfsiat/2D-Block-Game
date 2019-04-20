package codes;

import java.awt.*;
import javax.swing.*;


public class Dodge extends JPanel {
	 
	private int x = 5, y = 5;
	
	public Dodge() {
		setSize(new Dimension(500, 400));
		setPreferredSize(new Dimension(500, 400)); 
	}
	
	// built in method that takes graphics g as perameter
	// it helps to draw
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 20, 20);
		repaint();
	}
	
	public static void main(String [] args) {
		Dodge game = new Dodge();
		
		JFrame frame = new JFrame();
		frame.setTitle("Dodge the Rectangles");
		frame.add(game);
		frame.pack();
		frame.setResizable(false);   
		frame.setSize(new Dimension(500, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // centers the frame in the middle of the screen
		frame.setVisible(true);
	}
}	
