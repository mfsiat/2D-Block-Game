package codes;

import java.awt.*;
import javax.swing.*;


public class Dodge extends JPanel {
	 
	public Dodge() {
		setSize(new Dimension(500, 400));
		setPreferredSize(new Dimension(500, 400));
		setBackground(Color.BLACK);
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
