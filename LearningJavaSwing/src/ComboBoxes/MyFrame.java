package ComboBoxes;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	public MyFrame() {
		String[] animalStrings = {"Dog", "Cat", "Chicken"};
		
		comboBox = new JComboBox(animalStrings);
		comboBox.addActionListener(this);
		//comboBox.setEditable(true);
		//comboBox.addItem("Horse");
		comboBox.insertItemAt("Pig", 0);
		comboBox.setSelectedIndex(0);
		comboBox.removeItem("Cat");
		//comboBox.removeIndex(0);
		//comboBox.removeAllItems();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		//comboBox.setBounds(50, 50, 100, 100);;
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.add(comboBox);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}

}
