import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
*Author: Michael Schreiber  
*Date: April 20th, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*Assignment 6.2
**This Program is designed to add two numbers together using GUI
** 
 * @author Michael Schreiber
 *
 */

public class GUISum implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output;
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	
	
	public GUISum() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		
		label = new JLabel();
		label.setText("Enter number here");
		
		output = new JLabel();
		output.setText("------");
		
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		
		button = new JButton("Get that sum");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double sum = num1+num2;
		output.setText(String.valueOf(sum));
	}
}