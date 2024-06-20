package Java2DGraphic;


import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyPanel panel;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);
		this.add(panel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

}
