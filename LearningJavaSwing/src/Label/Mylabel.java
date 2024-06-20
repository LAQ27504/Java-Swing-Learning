package Label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Mylabel extends JLabel{
	public Mylabel() {
		ImageIcon image1 = new ImageIcon("src/DragDrop/troll1.png");
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		this.setText("Xin Chào Thế Giới");
		this.setIcon(image1);	
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.TOP);
		this.setForeground(Color.green);
		this.setFont(new Font("Times New Roman", Font.BOLD, 50));
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
