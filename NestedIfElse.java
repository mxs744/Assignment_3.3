/** 
*Author: Michael Schreiber
*Exercise 3.4 Nested IfElse and Boolean
*Date: March 14 2016
*Contact Email: mxs744@gmail.com
*This program is designed to take a number of people and divide them into groups
*/
import javax.swing.JOptionPane;

public class NestedIfElse {
	public static void main(String [] args) {
	String strPeople, strPlayers;
	int numberPeople, numberPlayers;

	//Prompt for input
	strPeople = JOptionPane.showInputDialog(null, "Enter your number of people: ");

	//Convert from string
	numberPeople = Integer.parseInt(strPeople);
	
	//Nested If Else

	if (numberPeople > 10) {
		JOptionPane.showMessageDialog(null, "The number of people is " + numberPeople + "\n Group size is " + numberPeople/2);
	
	}
	else if (numberPeople >= 3) {
		JOptionPane.showMessageDialog(null, "The number of people is " + numberPeople + "\n Group size is " + numberPeople/3);
	}
	else JOptionPane.showMessageDialog(null, "The number of people must be at least 3 please.");

	//Second Part of Assignment

	strPlayers = JOptionPane.showInputDialog(null, "Enter your number of players, bro: ");
	
	//Convert from string
	numberPlayers = Integer.parseInt(strPlayers);

	//Players to team

	if (numberPlayers >= 11 && numberPlayers <= 55){
		JOptionPane.showMessageDialog(null, "The number of teams is " + numberPlayers/11);
	}
	else JOptionPane.showMessageDialog(null, "The number of teams is 1");

}
}
# Assignment_3.4
