package ColorChooser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	public MyFrame() {
		
		button = new JButton("Pick a color");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		button.addActionListener(this);
		
		label = new JLabel();	
		label.setBackground(Color.white);
		label.setText("This is some text");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label.setOpaque(true);

		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
		this.add(label);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			label.setForeground(color);
		}
	}

}
