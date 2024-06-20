package Java2DAnimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.IntToDoubleFunction;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 1000;
	final int PANEL_HEIGHT = 1000;
	
	Image spaceShipImage;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		spaceShipImage = new ImageIcon("src/DragDrop/troll1.png").getImage();
		
		timer = new Timer(10, this); 
		timer.start();
	}

	@Override
	public void paint(Graphics g) {
		
		super.paint(g); //Paint Background
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(spaceShipImage, x, y, null);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(x >= PANEL_WIDTH || x <= 0) {
			xVelocity *= -1;
		}
		x = x + xVelocity;
		repaint();
	}
}
