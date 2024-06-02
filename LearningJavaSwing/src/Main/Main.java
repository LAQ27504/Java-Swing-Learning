package Main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {		
		ImageIcon image1 = new ImageIcon("src/Main/Hi.png");
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(image1);
		label.setText("Hello world");
		label.setIcon(image1);	
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli", Font.BOLD, 50));
		label.setIconTextGap(-10);
		label.setBackground(Color.black);
		//Display background color
		label.setOpaque(true);
		//Set border
		label.setBorder(border);
		//Set vertical position of all within label
		label.setVerticalAlignment(JLabel.CENTER);
		//Set Horizontal position of all within label
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		MyFrame myFrame = new MyFrame();
		myFrame.add(label);

	}
}
