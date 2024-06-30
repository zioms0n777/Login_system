package log_system;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome_Page {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello");
	
	Welcome_Page(String username){
		
		welcomeLabel.setBounds(55, 55, 200, 35);
		welcomeLabel.setText("Hello "+username);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.add(welcomeLabel);
		
		
		frame.setVisible(true);
		
	}
}
