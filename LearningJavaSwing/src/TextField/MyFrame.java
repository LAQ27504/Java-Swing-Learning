package TextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JTextField textField;
	
	
	public MyFrame() {
		button = new JButton();
		textField = new JTextField();
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button.addActionListener(this);
		button.setText("Submit");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		
		
		textField.setPreferredSize(new Dimension(500, 80));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		
		this.add(textField);
		this.add(button);
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.button) {
			String nameString = textField.getText();
			System.out.print(nameString);
		}
		
	}

}
