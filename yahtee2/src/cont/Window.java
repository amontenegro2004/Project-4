package cont;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Window {
	/* Method used to display a msg of a dialog boxe with a message
	*/
	public void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	/* Method used to display a a dialog box with input and displays
	* a message.
	*/
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	/* Method that shows a dialog box with different options,
	* that take in a string of options for the buttons and displays
	* a message.
	*/
	public int option(String[] options, String msg) {
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	/* Method used to print out a line of message in the system output.
	*/
	public void println(String msg) {
		System.out.println(msg);
	}
	
	/* Method used to print out message in the system output all on the same line.
	*/
	public void print(String msg) {
		System.out.println(msg);
	}
	
	/* Method used to display a msg of a dialog box with a msg that is an object
	*/
	public void msg(Object msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	 
	/* Method used to display a msg with input that the msg is an object
	*/
	public String in(Object msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	/* Method used to display an option box, with an array of object options,
	* an object message, and a string.
	*/
	public int option(Object[] options, Object msg, String string) {
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null,
                options, // possible options
                options[1]); // default option
	}
}
