package Codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ModeloWB extends JFrame implements Modelo {
	private VistaAuxTabla vista2;
	private VistaWB vistaP;
	private JPanel contentPane;
	private JPanel ArrVistas[];

	/**
	 * Launch the application.
	 */

	public void setVista(Vista vista) {
		this.vistaP = (VistaWB)vista;
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

	public void vaciarNuevaAct() {
		vistaP.vaciarAct();
	}


	public void copiarInfor(String txtfintNombre, String txtfintApellido, String txtfintCif, String txtfintDireccion,
			String txtfintMunicipio, String txtfintCP, String txtfintTlfF, String txtfintTlfM, String txtfintFax,
			String txtfintEmail) {
		
		vistaP.copiarInfo(txtfintNombre,txtfintApellido,txtfintCif,txtfintDireccion,txtfintMunicipio,txtfintCP,txtfintTlfF,txtfintTlfM, txtfintFax,txtfintEmail);
		
	}




	




}
