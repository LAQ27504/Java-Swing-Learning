package FlowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		/*
		 * Flow layout = Place component in a row, sized at the preferred size.
		 *  			 if the horizontal space in the container is too small
		 *  			 the FlowLayout class uses the next available row.
		 *  We could apply it on frame, panel
		 */
		
		
		
		//Create button
		JButton button = new JButton(); 
		//Set button position and size
		button.setSize(200, 100);
		//Add a action listener
		button.setText("Hi");
		button.setFont(new Font("MV Boli", Font.BOLD ,50));
		button.setFocusable(false);
		
		JButton button1 = new JButton(); 
		//Set button position and size
		button1.setSize(200, 100);
		//Add a action listener
		button1.setText("Hi");
		button1.setFont(new Font("MV Boli", Font.BOLD ,50));
		button1.setFocusable(false);

		JButton button2 = new JButton(); 
		//Set button position and size
		button2.setSize(200, 100);
		//Add a action listener
		button2.setText("Hi");
		button2.setFont(new Font("MV Boli", Font.BOLD ,50));
		button2.setFocusable(false);
		
		JButton button3 = new JButton(); 
		//Set button position and size
		button3.setSize(200, 100);
		//Add a action listener
		button3.setText("Hi");
		button3.setFont(new Font("MV Boli", Font.BOLD ,50));
		button3.setFocusable(false);
		
		JButton button4 = new JButton(); 
		//Set button position and size
		button4.setSize(200, 100);
		//Add a action listener
		button4.setText("Hi");
		button4.setFont(new Font("MV Boli", Font.BOLD ,50));
		button4.setFocusable(false);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		
		
		
		frame.setVisible(true);
	}
}
