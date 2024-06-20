package DragDrop;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	DragPanel panel = new DragPanel();
	
	public MyFrame(){
		this.setTitle("Drag and Drop");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.add(panel);
		this.setVisible(true);
	}
}
