package KeyListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	
	public MyFrame() {
		
		label = new JLabel();
		label.setBounds(0, 0, 200, 200);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is typed. Used KeyChar, char output
		switch (e.getKeyChar()) {
			case 'a': {
				label.setLocation(label.getX() - 5, label.getY());
				break;
			}
			case 's': {
				label.setLocation(label.getX() , label.getY() + 5);
				break;
			}
			case 'd': {
				label.setLocation(label.getX() + 5, label.getY());
				break;
			}
			case 'w': {
				label.setLocation(label.getX(), label.getY() - 5);
				break;
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " + e.getKeyChar());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released
		//System.out.println("You released key character: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
	}

}