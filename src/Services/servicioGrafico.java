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
	
	
	public JButton crear_Boton1(String texto,int alto, int ancho,Color col,Color colLetra,Color colBorde) {
		
		JButton nombre = new JButton(texto);
		nombre.setSize(ancho,alto);
		nombre.setBorder(BorderFactory.createLineBorder(colBorde, 0, true));
		nombre.setBackground(col);
		nombre.setForeground(colLetra);
		
		return nombre;
	}

}
