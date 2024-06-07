package OpenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaunchPage implements ActionListener{
	
	private JFrame frame = new JFrame();
	private JButton myButton = new JButton("New Window");
	
	
	public LaunchPage() {
		
		myButton.setBounds(300, 300, 200, 100);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(myButton);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == myButton) {
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}
	}
}
