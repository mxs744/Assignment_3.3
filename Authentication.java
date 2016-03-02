import javax.swing.JOptionPane;
/**
*Author: Michael Schreiber Exercise 3.3 Login/Password
*Date: March 2, 2016
*Contact Email: mxs744@gmail.com
*
*/

public class Authentication {
	public static void main(String [] args) {

	String strValidUserName, strValidPassWord, strUserName, strPassWord;
	
	JOptionPane.showMessageDialog(null, "This program will prompt you for a username and password to create an account. ");
	strValidUserName = JOptionPane.showInputDialog("Enter your username here: ");
	strValidPassWord = JOptionPane.showInputDialog("Enter your password here: ");
	strUserName = JOptionPane.showInputDialog("Re-enter your username to confirm: ");
	strPassWord = JOptionPane.showInputDialog("Re-enter your password to confirm: ");

	if (strUserName.equals(strValidUserName) && strPassWord.equals(strValidPassWord)) {
		JOptionPane.showMessageDialog(null, "Welcome " + strValidUserName + "! Your account has been created!");
	} else {
		JOptionPane.showMessageDialog(null, "Wrong UserName or PassWord! Sorry...");
	}

	
}

}

