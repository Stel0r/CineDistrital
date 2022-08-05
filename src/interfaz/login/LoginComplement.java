package interfaz.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginComplement implements ActionListener{

	private LoginView loginView;
	
	
	public LoginComplement() {
		
		loginView = new LoginView(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Entrar")) {
			JOptionPane.showMessageDialog(null, "el boton se ha presionado");
		}
	}

}
