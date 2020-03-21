package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		//switch statement
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Enjoy this last day of the week. Make pancakes!");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "The worst day of the week!");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "I hope you had fun on Monday :)");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "It's humpday!");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "It's almost Friday");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Woohoo!!");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Best day of the Week!");
		}
	}
	
	
}
