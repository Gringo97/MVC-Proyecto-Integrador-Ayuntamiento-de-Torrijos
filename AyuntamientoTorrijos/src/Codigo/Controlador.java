package Codigo;

import java.lang.reflect.Array;

import javax.swing.JPanel;

public interface Controlador {
	public void setModelo(Modelo modelo);

	public void setVista(Vista vista);

	public void cambioPantalla(JPanel pantallaNueva);

	public void setPanels(JPanel[] aux);

	public void nuevaPantalla();

}