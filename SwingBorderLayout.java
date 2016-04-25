import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SwingBorderLayout extends JFrame {

	
	
	public SwingBorderLayout() {
		
		
		JTextField[] panelArray = new JTextField[4];
		setLayout(new BorderLayout());
		for(int i = 0; i < 4; i++){
			panelArray[i] = new JTextField("Hello");
			
			
		}
		
		add(panelArray[0], BorderLayout.PAGE_START);
		add(panelArray[1], BorderLayout.CENTER);
		add(panelArray[2], BorderLayout.PAGE_END);
		add(panelArray[3], BorderLayout.LINE_START);
		
		setVisible(true);
		setSize(new Dimension(250,250));
	}
}
