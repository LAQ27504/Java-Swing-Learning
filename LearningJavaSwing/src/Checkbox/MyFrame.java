package Checkbox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{	
	
	private JCheckBox checkBox;
	private JButton button;
	
	
	public MyFrame() {
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("Are you a robot ?");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 50));	
		//Set the icon of the check box
		//checkBox.setIcon(null);
		//checkBox.setSelectedIcon(null);
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(checkBox);
		this.add(button);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.button) {
			System.out.println(checkBox.isSelected());
		}
	}

}
