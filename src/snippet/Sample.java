package snippet; //Popup Message example

import javax.swing.JOptionPane; // imports JOptionPane class 

public class Sample {
	public static void main(String args[])

	{
		
		//call a function to get and validate an input
		String Monthsale = showInputDialog();
		int number1 = Integer.parseInt (Monthsale);
		JOptionPane.showInputDialog (null, "Number netered is ",number1);
		//this will only work on strings...
		//String name = JOptionPane.showInputDialog ( "put your message here" );
		
		//so now it needs to be converted to int 
		//convert numbers from type String to type int
		//int number1 = Integer.parseInt ( name); 
		
		////JOptionPane.showMessageDialog(null, "Message here", "Title here", JOptionPane.ERROR_MESSAGE);	
		//options for the last arguments are:
		//JOptionPane.PLAIN_MESSAGE // this is a plain message 
		//JOptionPane.INFORMATION_MESSAGE // this is a info message 
		//JOptionPane.ERROR_MESSAGE // this is a error message 
		//JOptionPane.WARNING_MESSAGE // this is a warning message 
		
		////JOptionPane.showMessageDialog(null, "This is a sample program");
		System.exit(0); // stops the program
	}
	
	private static String showInputDialog()
	{
	    String inputValue = JOptionPane.showInputDialog("Please enter sales for..");

	    if(inputValue == null || inputValue.isEmpty() || !inputValue.matches("[A-Za-z]*"))
	    {
	    	JOptionPane.showMessageDialog(null, "Please etner a number", "Input Error", JOptionPane.ERROR_MESSAGE);
	    	inputValue = showInputDialog();	    	
	    }

	    return inputValue;
	}
}