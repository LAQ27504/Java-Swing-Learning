package Java2DGraphic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	Image image;
	ImageIcon imageIcon;
	
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		imageIcon = new ImageIcon("src/DragDrop/troll1.png");
		image = new ImageIcon("src/DragDrop/troll1.png").getImage();
		this.setPreferredSize(new Dimension(1000, 1000));
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;

		
		/*
		 * g2D.setStroke(new BasicStroke(100)); g2D.setPaint(Color.green);
		 * g2D.drawLine(0, 0, 1000, 1000);
		 */
		 
		g2D.drawImage(image, 0, 0, null);
	}

}
