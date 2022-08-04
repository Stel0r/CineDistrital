package interfaz.login;
import java.awt.Color;

import javax.swing.*;

public class LoginView extends JFrame {
	
	private JTextField userInput;
	private JPasswordField passInput;
	
	public LoginView() {
		
		
		this.setSize(1000, 628);
		this.getContentPane().setBackground(new Color(53, 53, 53));
		this.setLayout(null);
		
		
		
		userInput = new JTextField();
		userInput.setSize(300, 20);
		userInput.setLocation((this.getSize().width/2)-userInput.getSize().width/2, 250);
		this.add(userInput);
		
		passInput = new JPasswordField();
		passInput.setSize(300, 20);
		passInput.setLocation((this.getSize().width/2)-passInput.getSize().width/2, 350);
		this.add(passInput);
		
		this.setVisible(true);
		
		
	}

}
