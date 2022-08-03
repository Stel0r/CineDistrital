package login;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginView extends JFrame {

	private JPanel pnlPeliculas;
	private JPanel pnlSnacks;
	private JButton btnPeliculas;
	private JButton btnSnacks;
	
	public LoginView() {
		
		setExtendedState(MAXIMIZED_BOTH);
		setSize(900, 600);
		setTitle("Cine Distrital");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
		
		
	}

	private void iniciarComponentes() {
		
		crearPaneles();
		
	}

	private void crearPaneles() {
		
		crearMdesplegable();
		panelPeliculas();
		
	}

	private void crearMdesplegable() {
		
	}
	
	private void panelPeliculas() {
		
		pnlPeliculas = new JPanel();
		pnlPeliculas.setBackground(Color.GRAY);
		pnlPeliculas.setLayout(null);
		this.getContentPane().add(pnlPeliculas);
		
		crear_Boton("btnPeliculas", "Cartelera", 150, 0, 40, 150,pnlPeliculas);
		crear_Boton("btnSnacks", "Snacks", 301, 0, 40, 150,pnlPeliculas);
		
		
	}
	
	
private void panelSnacks() {
		
		pnlSnacks = new JPanel();
		pnlSnacks.setBackground(Color.GRAY);
		pnlSnacks.setLayout(null);
		//this.getContentPane().add(pnlSnacks);
		
		crear_Boton("btnPeliculas", "Cartelera", 150, 0, 40, 150,pnlSnacks);
		crear_Boton("btnSnacks", "Snacks", 301, 0, 40, 150,pnlSnacks);
		
		
	}
	
	public void crear_Boton(String nombre1,String texto,int x, int y, int alto, int ancho, JPanel destino) {
		
		JButton nombre = new JButton();
		nombre.setBounds(x,y,ancho,alto);
		nombre.setText(texto);
		nombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		destino.add(nombre);
		
		
	}
	
	
}
