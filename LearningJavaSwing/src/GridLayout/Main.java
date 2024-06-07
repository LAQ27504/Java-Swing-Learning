package GridLayout;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		/*
		 * Grid layout = Place component in a grid of cell 
		 * 				 Each component takes all the available space within its cell, 
		 * 				 and each cell have the same size.
		 */
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		
		frame.setLayout(new GridLayout(3, 3, 30, 30));
		
		frame.add(createButton("1"));
		frame.add(createButton("2"));
		frame.add(createButton("3"));
		frame.add(createButton("4"));
		frame.add(createButton("5"));
		frame.add(createButton("6"));
		frame.add(createButton("7"));
		frame.add(createButton("8"));
		frame.add(createButton("9"));
		frame.add(createButton("10"));
		
		frame.setVisible(true);
		
		
	}
	
	public static JButton createButton(String a) {
		JButton button = new JButton();
		button.setText(a);
		button.setFont(new Font("MV Boli", Font.BOLD ,50));
		return button;
	}
}
