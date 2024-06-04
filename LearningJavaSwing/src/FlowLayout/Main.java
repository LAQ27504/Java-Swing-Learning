package FlowLayout;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		/*
		 * Flow layout = Place component in a row, sized at the preferred size.
		 *  			 if the horizontal space in the container is too small
		 *  			 the FlowLayout class uses the next available row.
		 */
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.add(new Button("1"));
		
		frame.setVisible(true);
	}
}
