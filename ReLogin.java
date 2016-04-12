/**
*Author: Michael Schreiber Assignment #3 Extra Credit 
*Date: April 10, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to authenticate a login username/password and assign an account type
 * 
 * @author Michael Schreiber
 *
 */

import javax.swing.JOptionPane;

public class ReLogin {
	
	//Declare Account Types as enumerated 
	private enum AccountType {Administrator, Staff, Student};
	static AccountType[] choicesAccount = {AccountType.Administrator, AccountType.Staff, AccountType.Student};
	static String[] Default = {"Sign up", "Login"};
	
	//Intialize 
	static int Count = 0;
	static String UserName, PassWord;
	static AccountType Account;

	//Main ARGS
	public static void main(String[] args) {
		
		int Begin = 0;
		do {
		Begin = JOptionPane.showOptionDialog(null,
				"Please create an account and then please login: ", "Message", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, Default, null);
		
		//Loop begins here with count set at 0
		if (Begin == 0) { SignUp(); }
		
		else if (Begin == 1) {
			if (Count < 3) { Login(); }
			
			else {
				JOptionPane.showMessageDialog(null,"Please contact an administrator.","Message",JOptionPane.PLAIN_MESSAGE);
			}
		}
		
		else break;
		
		} while (true);
	}
	
	static void SignUp() {
		
		UserName = JOptionPane.showInputDialog(null,"Username", "Sign Up",JOptionPane.PLAIN_MESSAGE);
		
		PassWord = JOptionPane.showInputDialog(null,"Password", "Sign Up",JOptionPane.PLAIN_MESSAGE);
		
		Account = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Sign up here",  JOptionPane.PLAIN_MESSAGE,null, choicesAccount, choicesAccount[2]);
	}
	
	static void Login() {
		
		String User = JOptionPane.showInputDialog(null,"Username", "Sign In",JOptionPane.PLAIN_MESSAGE);
		
		//If Loop for Invalid UserName
		if (!User.equals(UserName)) {
			JOptionPane.showMessageDialog(null,"Not a registered username", "Message",JOptionPane.PLAIN_MESSAGE);
			Count++;
			return;
		}
		
		String PassWord = JOptionPane.showInputDialog(null,"Password", "Sign In",JOptionPane.PLAIN_MESSAGE);
		
		//If Loop for Invalid Password
		if (!PassWord.equals(PassWord)) {
			JOptionPane.showMessageDialog(null,"Invalid password", "Message",JOptionPane.PLAIN_MESSAGE);
				Count++;
				return;
		}
		
		AccountType Type = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Sign up", JOptionPane.PLAIN_MESSAGE,null, choicesAccount, choicesAccount[0]);
		
		while (!Type.equals(Account)) {
			Type = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Sign up", JOptionPane.PLAIN_MESSAGE,null, choicesAccount, choicesAccount[0]);
		}
		
		//Case switch for AccountType
		switch (Type) {
		case Administrator: JOptionPane.showMessageDialog(null,"Welcome Administrator! You can update and read files!",
							"Message",JOptionPane.PLAIN_MESSAGE); 
		break;
		case Student: JOptionPane.showMessageDialog(null,"Welcome Student! You can only read files!",
					  "Message",JOptionPane.PLAIN_MESSAGE); 
		break;
		case Staff: JOptionPane.showMessageDialog(null,"Welcome Staff Member! You can update, read, add, and delete files!",
					"Message",JOptionPane.PLAIN_MESSAGE); 
		break;
		}
		
	}
	
	
}

