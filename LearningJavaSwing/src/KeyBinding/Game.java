package KeyBinding;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Game {

	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action rightAction;
	Action leftAction;
	
	public Game() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100, 100, 200, 200);
		label.setOpaque(true);
		
		
		frame.add(label);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		
		label.getActionMap().put("upAction", upAction);
		label.getActionMap().put("downAction",	 downAction);
		label.getActionMap().put("leftAction", leftAction);
		label.getActionMap().put("rightAction", rightAction);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY() - 10);
		}
		
	}
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() - 10, label.getY());
		}
		
	}
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() + 10, label.getY());
		}
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY() + 10);
		}
		
	}
}
