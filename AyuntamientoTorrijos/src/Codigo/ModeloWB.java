package Codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ModeloWB extends JFrame implements Modelo {
	private Vista vista;
	private JPanel contentPane;
	private JPanel ArrVistas[];

	/**
	 * Launch the application.
	 */

	public void setVista(Vista vista) {
		this.vista = vista;
	}
	
	
	public void cambioPantalla(JPanel pantallaNueva){
		if (pantallaNueva.isVisible() == false) {
			pantallaNueva.setVisible(true);
			for (int i = 0; i < ArrVistas.length; i++) {
				if (!(ArrVistas[i] == pantallaNueva)) {
					ArrVistas[i].setVisible(false);
				}
			}

		}
	}




}
