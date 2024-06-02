package Main;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {		
		ImageIcon image1 = new ImageIcon("src/Main/Hi.png");
		
		JLabel label = new JLabel(image1);
		label.setText("Hello world");
		label.setIcon(image1);	
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.green);
		
		
		MyFrame myFrame = new MyFrame();
		myFrame.add(label);

	}
}
