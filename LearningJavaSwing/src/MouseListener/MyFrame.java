package MouseListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	public MyFrame() {
		
		label = new JLabel();
		label.setBounds(0, 0, 200, 200);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// mouseClicked = Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("You click the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// mousePressed = Invoked when the mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// mouseReleased = Invoked when the mouse button has been released on a component
		System.out.println("You release the mouse");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You enter the component");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exists a component
		System.out.println("You exit the component");
	}


}
