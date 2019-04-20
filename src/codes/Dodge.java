package codes;

import java.awt.*;
import javax.swing.JFrame;


public class Dodge {
	
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Dodge the Rectangles");
		frame.setSize(new Dimension(500, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // centers the frame in the middle of the screen
		frame.setVisible(true);
	}
}	
