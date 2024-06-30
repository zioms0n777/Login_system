package log_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Page implements ActionListener {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton ("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel ("userID:");
	JLabel userPasswordLabel = new JLabel ("password:");
	JLabel messageLabel = new JLabel();
	
	Login_Page(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
	
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null, Font.PLAIN, 25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 450);
	    frame.setLayout(null);
	    
	    loginButton.setBounds(125, 200, 100, 25);
	    loginButton.setFocusable(false);
	    loginButton.addActionListener(this);
	    
	    resetButton.setBounds(225, 200, 100, 25);
	    resetButton.setFocusable(false);
	    resetButton.addActionListener(this);
	    
	    frame.add(messageLabel);
	    frame.add(userIDLabel);
	    frame.add(userPasswordLabel);
	    frame.add(userIDField);
	    frame.add(userPasswordField);
	    frame.add(loginButton);
	    frame.add(resetButton);
	    frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==resetButton)
		{
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if (e.getSource()==loginButton)
		{
			String userID = userIDField.getText();
		    String userPassword = String.valueOf(userPasswordField.getPassword());
		    if (logininfo.containsKey(userID))
		    {
		    	if(logininfo.get(userID).equals(userPassword))
		    	{

		    		messageLabel.setForeground(Color.green);
		    		messageLabel.setText("Login Successful");
		    		frame.dispose();
		    		Welcome_Page welcome = new Welcome_Page(userID);
		    	}
		    	else
			    {
			    	messageLabel.setForeground(Color.red);
			    	messageLabel.setText("wrong Password");
			    }
		    }
		    else
		    {
		    	messageLabel.setForeground(Color.red);
		    	messageLabel.setText("username not found");
		    }
		    
		}
	
	}
	
	
}
