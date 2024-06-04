package Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {		
		//JPanel is a GUI component that functions as a container to hold other component
		
		
		//Mylabel label = new Mylabel();
		
		JLabel label = new JLabel();
		label.setText("troll ha ha hahahahahahaahahahahahahaa");
		label.setFont(new Font("MV Boli", Font.BOLD ,50));
		label.setBounds(0, 0, 500, 200);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
		
		MyPanel redPanel = new MyPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 350, 350);
		redPanel.setLayout(null);
		
		MyPanel bluePanel = new MyPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(350, 0, 350, 350);
		
		MyPanel greenPanel = new MyPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 350, 700, 350);
		
		MyFrame myFrame = new MyFrame();
		myFrame.setLayout(null);
		myFrame.add(redPanel);
		myFrame.add(bluePanel);
		myFrame.add(greenPanel);
		redPanel.add(label);
		//myFrame.add(label);
		//set the size of the app to fit all the label in the app that we have add before
		//myFrame.pack();
		
	}
}
