package Services;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.*;

public class servicioGrafico {
	
	private static servicioGrafico service;
	
	private servicioGrafico() {
		
	}
	
	public static servicioGrafico obtenerServicio() {
		if (service == null) {
			service = new servicioGrafico();
		}
		return service;
	}
	
	public JButton crear_Boton(String texto,int x, int y, int alto, int ancho, JComponent destino,Color col,Color colLetra) {
		
		JButton nombre = new JButton(texto);
		nombre.setBounds(x,y,ancho,alto);
		nombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		nombre.setBackground(col);
		nombre.setForeground(colLetra);
		
		destino.add(nombre);
		
		return nombre;
		
	}
	
	public JButton crear_Boton_centro(String texto, int y,int alto, int ancho, JComponent destino,Color col,Color colLetra) {
		
		JButton nombre = new JButton(texto);
		nombre.setSize(ancho,alto);
		nombre.setLocation(destino.getSize().width/2-ancho/2,y);
		nombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		nombre.setBackground(col);
		nombre.setForeground(colLetra);
		
		destino.add(nombre);
		
		return nombre;
	}

}
