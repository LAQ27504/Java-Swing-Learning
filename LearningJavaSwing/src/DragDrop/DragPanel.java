package DragDrop;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DragPanel extends JPanel{
	
	ImageIcon imageIcon = new ImageIcon("src/DragDrop/troll1.png");
	final int WIDTH = imageIcon.getIconWidth();
	final int HEIGHT = imageIcon.getIconHeight();
	Point imageCornerPoint;
	Point prevPT; 
	
	public DragPanel() {
		imageCornerPoint = new Point(0, 0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}

	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		imageIcon.paintIcon(this, g, (int)imageCornerPoint.getX(),(int)imageCornerPoint.getY());
	}
	
	private class ClickListener extends MouseAdapter{
		public void mousePressed (MouseEvent e) {
			prevPT = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragger(MouseEvent e) {
			Point currentPoint = new Point();
			
			imageCornerPoint.translate((int)(currentPoint.getX() - prevPT.getX()), (int)(currentPoint.getY() - prevPT.getY()));
			prevPT = currentPoint;
			repaint();
		}
	}
}
