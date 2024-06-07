package OpenNewWindow;

import java.awt.Font;

import javax.swing.*;

public class NewWindow {
	
	private JFrame frame = new JFrame();
	private JLabel label = new JLabel("Hello world");
	
	public NewWindow() {
		label.setBounds(0, 0, 400, 100);
		label.setFont(new Font(null, Font.PLAIN, 50));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
	}
}
