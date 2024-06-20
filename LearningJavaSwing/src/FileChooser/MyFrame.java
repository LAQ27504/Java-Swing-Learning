package FileChooser;	

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
    private Font font = new Font("Times New Roman", Font.PLAIN, 30);	
	
	private JButton button;
	
	public MyFrame() {
		
		button = new JButton("Select File");
		button.addActionListener(this);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		button.setSize(400, 400);
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JFileChooser fileChooser = new JFileChooser();
			
			//fileChooser.setCurrentDirectory
			
			setFileChooserFont(fileChooser.getComponents());  
			
			fileChooser.setPreferredSize(new Dimension(1000, 1000));
			
			int response = fileChooser.showOpenDialog(null);
			
			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		}
	}
	
	private void setFileChooserFont(Component[] comp)
    {  
      for(int x = 0; x < comp.length; x++)  
      {  
        if(comp[x] instanceof Container) setFileChooserFont(((Container)comp[x]).getComponents());  
        try{comp[x].setFont(font);}  
        catch(Exception e){}//do nothing  
      }  
    }  


}
