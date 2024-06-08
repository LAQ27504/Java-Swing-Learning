package JOptionPane;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * JOptionPane = pop up a standard dialog box that prompts users for a value 
		 * 				 or informs them of something.
		 */
		
		JOptionPane.showMessageDialog(null, "Hello world", "Hiiiiii", JOptionPane.PLAIN_MESSAGE);
		
		/*
		 * This function return integer number, for this example, if yes = 0, 
		 * no = 1, cancel = 2, close = -1 
		 */
		JOptionPane.showConfirmDialog(null, "Do you even code ??? ", "Super cool question", JOptionPane.YES_NO_CANCEL_OPTION);
		
		/*
		 * This function while return a string of an answer from the user
		 */
		JOptionPane.showInputDialog(null, "What is your name");
		
		
		/*
		 *This function will cover almost all of the over function  
		 */
		String trollStrings[] = {"Abc", "cdb", "def"};
		
		JOptionPane.showOptionDialog(
				null,
				"Are you cool ?", 
				"You good", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				trollStrings,
				0
				);
		
	}
}
