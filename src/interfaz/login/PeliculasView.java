package interfaz.login;

import java.awt.Color;

import javax.swing.*;

import Services.servicioGrafico;

public class PeliculasView extends JFrame{

	private servicioGrafico gService;
	private JPanel pnlPeliculas;
	private JButton btnPeliculas,btnSnacks;
	
	
	public PeliculasView() {
		
		gService = servicioGrafico.obtenerServicio();
		
		this.setSize(1280, 720);
		this.getContentPane().setBackground(new Color(53, 53, 53));
		this.setLayout(null);
		this.setTitle("Cartelera");
		
		pnlPeliculas = new JPanel();
		pnlPeliculas.setBackground(new Color(53, 53, 53));
		pnlPeliculas.setLayout(null);
		
		
		btnPeliculas = gService.crear_Boton1("Cartelera",50,200,new Color(53, 53, 53) , Color.white,Color.white);
		btnPeliculas.setLocation(200, 0);
		btnPeliculas.addActionListener(null);
		this.add(btnPeliculas);
		
		btnSnacks = gService.crear_Boton1("Snacks",50,200,new Color(53, 53, 53) , Color.white,Color.white);
		btnSnacks.setLocation(400, 0);
		btnSnacks.addActionListener(null);
		this.add(btnSnacks);

		
		this.add(pnlPeliculas);
		this.setVisible(true);
		
		
		
	}
	
	

//
//
//
//	private JPanel pnlPeliculas;
//	private JPanel pnlSnacks;
//	private JButton btnPeliculas;
//	private JButton btnSnacks;
//	
//
//	private void iniciarComponentes() {
//		
//		crearPaneles();
//		
//	}
//
//	private void crearPaneles() {
//		
//		crearMdesplegable();
//		panelPeliculas();
//		
//	}
//
//	private void crearMdesplegable() {
//		
//	}
//	
//	private void panelPeliculas() {
//		
//		pnlPeliculas = new JPanel();
//		pnlPeliculas.setBackground(Color.GRAY);
//		pnlPeliculas.setLayout(null);
//		this.getContentPane().add(pnlPeliculas);
//		
//		crear_Boton("btnPeliculas", "Cartelera", 150, 0, 40, 150,pnlPeliculas);
//		crear_Boton("btnSnacks", "Snacks", 301, 0, 40, 150,pnlPeliculas);
//		
//		
//	}
//	
//	
//private void panelSnacks() {
//		
//		pnlSnacks = new JPanel();
//		pnlSnacks.setBackground(Color.GRAY);
//		pnlSnacks.setLayout(null);
//		//this.getContentPane().add(pnlSnacks);
//		
//		crear_Boton("btnPeliculas", "Cartelera", 150, 0, 40, 150,pnlSnacks);
//		crear_Boton("btnSnacks", "Snacks", 301, 0, 40, 150,pnlSnacks);
//		
//		
//	}
//	
	public void crear_Boton(String nombre1,String texto,int x, int y, int alto, int ancho, JPanel destino) {
		
		JButton nombre = new JButton();
		nombre.setBounds(x,y,ancho,alto);
		nombre.setText(texto);
		nombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		destino.add(nombre);
		
		

	}
}	
	
