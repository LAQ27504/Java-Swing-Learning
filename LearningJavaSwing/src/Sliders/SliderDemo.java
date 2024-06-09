package Sliders;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JSlider slider;
	
	public SliderDemo() {
		
		frame = new JFrame("Slider demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);

		slider.setPreferredSize(new Dimension(200, 700));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		label.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("Number of score: " + slider.getValue());
	}
}
