package Codigo;

public class Test {
	public static void main(String[] args) {
		ModeloWB modelo = new ModeloWB();
		ModeloBBDD modelobbdd = new ModeloBBDD();

		ControladorWB controlador = new ControladorWB();
		ModeloFicheroIni modeloFicheroIni = new ModeloFicheroIni();
		VistaWB vista = new VistaWB();
		

		modelo.setVista(vista);
		modelobbdd.setVista(vista);
		
		modeloFicheroIni.setModeloBBDD(modelobbdd);
		
		
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		vista.setModelo2(modelobbdd);
		

		controlador.setModelo(modelo);
		controlador.setModelo2(modelobbdd);
		controlador.setModelo3(modeloFicheroIni);
		controlador.setVista(vista);
		controlador.refrescar();
		
		vista.adirArr();

		vista.setVisible(true);

	}

}
