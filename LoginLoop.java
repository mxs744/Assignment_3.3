import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javax.swing.JOptionPane;


public class LoginLoop extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	public enum AccountType {Administrator, Faculty, Staff, Student, Guest}
	AccountType[] choicesAccount = {AccountType.Administrator, AccountType.Faculty, AccountType.Staff, AccountType.Student, AccountType.Guest};
	
	String UserName1;
	String PassWord1;
	static int count = 0;
	
	Object[] contactOption = {"Contact", "Cancel"};
	Object[] ProceedOption = {"Proceed", "Redo"};


	@Override
	public void start(Stage primaryStage) {
	primaryStage.setTitle("Java Login");
	GridPane gPane = new GridPane();
	gPane.setAlignment(Pos.CENTER);
	gPane.setHgap(10);
	gPane.setVgap(10);
	gPane.setPadding(new Insets(25, 25, 25, 25));

	Text scenetitle = new Text("Welcome to your login");
	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	gPane.add(scenetitle, 0, 0, 2, 1);

	Label usernameBox = new Label("User Name:");
	gPane.add(usernameBox, 0, 1);

	TextField userTextField = new TextField();
	gPane.add(userTextField, 1, 1);

	Label pw = new Label("Password:");
	gPane.add(pw, 0, 2);

	PasswordField pwBox = new PasswordField();
	gPane.add(pwBox, 1, 2);

	Button btSignIn = new Button ("Sign in");
	Button btGetAccount = new Button ("Create an account");
	HBox hBox = new HBox(10);
	hBox.setAlignment(Pos.BOTTOM_RIGHT);
	hBox.getChildren().addAll(btGetAccount,btSignIn);
	gPane.add(hBox, 1, 4);

	btGetAccount.setOnAction(e -> {
		UserName1 = JOptionPane.showInputDialog(null, "Enter your username",
				"Message",JOptionPane.PLAIN_MESSAGE);
		PassWord1 = JOptionPane.showInputDialog(null, "Enter your password",
				"Message",JOptionPane.PLAIN_MESSAGE);
	});



	btSignIn.setOnAction(e -> {
	
	if (count < 3) {
		String userName = userTextField.getText();
		String passWord = pwBox.getText();
		if (UserName1.equals(userName) && PassWord1.equals(passWord)) {
			AccountType accountType = (AccountType) JOptionPane.showInputDialog(null, "Select Account Type Please.", "Account Type",
				JOptionPane.PLAIN_MESSAGE, null, choicesAccount, choicesAccount[0]);

		do {
			if (accountType != null) {
			int selectedOption = JOptionPane.showOptionDialog(null, "You have selected " + accountType , "Message",
						JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, ProceedOption, null);

						if (selectedOption == 0) { break;}
						}

					accountType = (AccountType) JOptionPane.showInputDialog(null, "Please select account type.", "Account Type",
							JOptionPane.PLAIN_MESSAGE,null, choicesAccount, choicesAccount[0]);

					} while (true);

					JOptionPane.showMessageDialog(null, "Welcome " + UserName1 + accountType );

					System.exit(0);

				}

				else {

					count++;
					JOptionPane.showMessageDialog(null, "This is your " + count + "attempt" + "Wrong UserName or PassWord","Careful",
					JOptionPane.WARNING_MESSAGE);

					}
				}
				else {

					int selectedOption = JOptionPane.showOptionDialog(null,
					" Please contact your adminstrator to unlock your account!", "Message",
					JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null,
					contactOption, null);

					if (selectedOption == 0) {
						JOptionPane.showMessageDialog(null, "Your account is now open!",
								"Message",JOptionPane.INFORMATION_MESSAGE);
							count = 0;
					}
				}

				});
				
				Scene scene = new Scene(gPane,300,300);
				primaryStage.setTitle("Log In");
				primaryStage.setScene(scene);
				primaryStage.show();

			}


	}





















