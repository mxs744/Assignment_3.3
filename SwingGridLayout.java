import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SwingGridLayout extends JFrame {
	
	public SwingGridLayout() {
		
	JTextField[] panelArray = new JTextField[4];
	setLayout(new GridLayout(2,2));
	for(int i = 0; i < 4; i++){
		panelArray[i] = new JTextField("Hello");
		
		
	}
	
	add(panelArray[0]);
	add(panelArray[1]);
	add(panelArray[2]);
	add(panelArray[3]);
	
	setVisible(true);
	setSize(new Dimension(250,250));

	
}

}

	
