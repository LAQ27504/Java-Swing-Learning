package RadioButton;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton = new JRadioButton("Pizza");
	JRadioButton hamburgurButton = new JRadioButton("Hamburger");
	JRadioButton hotdogButton = new JRadioButton("Hot dog");
	
	public MyFrame() {
		
		pizzaButton = new JRadioButton("Pizza");
		pizzaButton.addActionListener(this);
		
		hamburgurButton = new JRadioButton("Hamburger");
		hamburgurButton.addActionListener(this);
		
		hotdogButton = new JRadioButton("Hot dog");
		hotdogButton.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgurButton);
		group.add(hotdogButton);
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(pizzaButton);
		this.add(hamburgurButton);
		this.add(hotdogButton);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == pizzaButton) {
			System.out.println("You have ordered a pizza");
		}
		else if (e.getSource() == hamburgurButton) {
			System.out.println("You have ordered a hamburger");
		}
		else if (e.getSource() == hotdogButton) {
			System.out.println("You have ordered a hotdog");
		}
	}
}
