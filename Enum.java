import javax.swing.JOptionPane;

public class Enum {

	public enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String [] args) {

	Months [] choices = {Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.	 December};

	Months select = (Months) JOptionPane.showInputDialog(null, "Select which month it is please!" , "Month", JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);
	
	while (true) {
	switch(select) {

	case January:
		JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
		break;
	case February:
		JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
		break;
	case March:
		JOptionPane.showMessageDialog(null, "Happy Spring Days!");
		break;
	case April:
		 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
		 break;
	case May:
		 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
		 break;
	case June:
		 JOptionPane.showMessageDialog(null, "It's summer time!");
		 break;
	case July:
		 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
		 break;
	case August:
		 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
		 break;
	case September:
		 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		 break;
	case October:
		JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		break;
	case November:
		JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		break;
	case December:
		JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
		break;
	}
	select = (Months) JOptionPane.showInputDialog(null,  "Select which month it is please!" , "Month", JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);
 	
	

}
}
}

