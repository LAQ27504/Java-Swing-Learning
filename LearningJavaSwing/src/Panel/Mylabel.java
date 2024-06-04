package Panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Mylabel extends JLabel{
	public Mylabel() {
		ImageIcon image1 = new ImageIcon("src/Main/Hi.png");
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		this.setText("Hello world");
		this.setIcon(image1);	
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.TOP);
		this.setForeground(Color.green);
		this.setFont(new Font("MV Boli", Font.BOLD, 50));
		this.setIconTextGap(-10);
		this.setBackground(Color.black);
		//Display background color
		this.setOpaque(true);
		//Set border
		this.setBorder(border);
		//Set vertical position of all within this
		this.setVerticalAlignment(JLabel.CENTER);
		//Set Horizontal position of all within this
		this.setHorizontalAlignment(JLabel.CENTER);
		//Set position in frame 
		//this.setBounds(100, 100, 750, 750);
	}
}
