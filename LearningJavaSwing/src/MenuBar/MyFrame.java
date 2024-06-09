package MenuBar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.tools.ForwardingJavaFileManager;

public class MyFrame extends JFrame implements ActionListener{
	
	private JMenuBar menuBar;
	private JMenuItem loadItem;
	private JMenuItem saveItem;
	private JMenuItem exitItem;
	
	public MyFrame() {
		
		menuBar = new JMenuBar();
		
		JMenu fileJMenu = new JMenu("File");
		JMenu editJMenu = new JMenu("Edit");
		JMenu helpJMenu = new JMenu("Help");
		
		menuBar.add(fileJMenu);
		menuBar.add(editJMenu);
		menuBar.add(helpJMenu);
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		//We can add Icon to the menu item
		
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileJMenu.setMnemonic(KeyEvent.VK_F);
		editJMenu.setMnemonic(KeyEvent.VK_E);
		helpJMenu.setMnemonic(KeyEvent.VK_H);
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		fileJMenu.add(loadItem);
		fileJMenu.add(saveItem);
		fileJMenu.add(exitItem);
		
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == loadItem) {
			System.out.println("Loadddd");
		}
		else if (e.getSource() == saveItem) {
			System.out.println("Savinggg");
		}
		else if (e.getSource() == exitItem) {
			System.exit(0);
		}
	}

}
