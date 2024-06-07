package LayeredPane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * JLayeredPane = Swing container that provides a 
		 * 			 	  third dimension for positioning 
		 *     			  components. Ex: depth, Z-index
		 */
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(100, 100, 400, 400);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(200, 200, 400, 400);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(300, 300, 400, 400);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1000, 1000);
		
		//There is 2 ways to set up the layer pane 
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		
		
		
		JFrame frame = new JFrame();
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1000, 1000));
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
