package Panel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame{
	JButton button;
	
	public MyFrame(){
		
		//Set title 
		this.setTitle("Learning java swing");
		//Set to close operation 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Prevent resize
		this.setResizable(true);
		//set size 
		this.setSize(1000, 1000);
		//Set visible to true
		this.setVisible(true);
		
		//set icon however I am using ubuntu so it not appear logo at all
		ImageIcon image = new ImageIcon("Logo.jpg");
		this.setIconImage(image.getImage());
		this.setLayout(null);
		//Set the background color
		//this.getContentPane().setBackground(Color.green);
		//this.getContentPane().setBackground(new Color(255, 255, 0));
	}
}
