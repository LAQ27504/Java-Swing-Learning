package Label;
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
		
		
		Mylabel label = new Mylabel();
		
		MyFrame myFrame = new MyFrame();
		myFrame.add(label);
		
	}
}
