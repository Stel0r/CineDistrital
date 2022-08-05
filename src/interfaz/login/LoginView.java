package interfaz.login;
import java.awt.Color;

import javax.swing.*;

import Services.servicioGrafico;

public class LoginView extends JFrame {
	
	private JTextField userInput;
	private JPasswordField passInput;
	private JButton loginButton;
	private servicioGrafico gService;
	
	public LoginView() {
		
		gService = servicioGrafico.obtenerServicio();
		
		this.setSize(750, 628);
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
		
		
		//loginButton = gService.crear_Boton_centro("Ëntrar", 450, 35, 150, this,new Color(53, 53, 53) , Color.white);
		
		loginButton = new JButton("Entrar");
		loginButton.setSize(150,35);
		loginButton.setBackground(new Color(53, 53, 53));
		loginButton.setForeground(Color.white);
		loginButton.setLocation((this.getSize().width/2)-loginButton.getSize().width/2, 450);
		this.add(loginButton);
		
		this.setVisible(true);
		this.setResizable(false);
		
		
		
		
	}

}
