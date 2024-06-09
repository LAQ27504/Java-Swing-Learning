package ProgressBar;

import java.awt.*;
import javax.swing.*;
import javax.swing.Box.Filler;
import java.lang.Thread;

public class ProgressBarDemo {
	
	private JFrame frame;
	private JProgressBar bar;
	
	public ProgressBarDemo() {
		frame = new JFrame();
		bar = new JProgressBar();
		
		bar.setValue(0);
		bar.setBounds(0, 50, 1000, 100);
		bar.setStringPainted(true);
		bar.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		//We can set the background, foreground color for the progress bar
		
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	private void fill(){
		int counter = 0;
		while (counter <= 100) {
			bar.setValue(counter);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			counter += 10;
		}
		
		
	}
	
}
