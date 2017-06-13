package Codigo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.lang.reflect.Array;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ControladorWB extends JFrame implements Controlador {
	private ModeloWB modelo;
	private ModeloBBDD modelo2;
	private ModeloFicheroIni modeloFicheroIni;
	private VistaFicheroIni vistaFicheroIni;
	private VistaWB vista;
	private VistaAuxTabla vista2;
	private JPanel contentPane;
	private JPanel ArrVistas[];

	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloWB) modelo;
	}

	public void setModelo2(Modelo modelo) {
		this.modelo2 = (ModeloBBDD) modelo;
	}

	public void setModelo3(Modelo modelo) {
		this.modeloFicheroIni = (ModeloFicheroIni) modelo;
	}

	public void setVista(Vista vista) {
		this.vista = (VistaWB) vista;
	}

	public void setVistaFichero(Vista vista) {
		this.vistaFicheroIni = (VistaFicheroIni) vista;
	}

	public void setPanels(JPanel[] aux) {
		this.ArrVistas = aux;
	}

	public void cambioPantalla(JPanel pantallaNueva) {
		if (pantallaNueva.isVisible() == false) {
			pantallaNueva.setVisible(true);
			for (int i = 0; i < ArrVistas.length; i++) {
				if (!(ArrVistas[i] == pantallaNueva)) {
					ArrVistas[i].setVisible(false);
				}
			}

		}
	}

	public void nuevaPantalla() {
		VistaAuxTabla vistaTabla = new VistaAuxTabla();
		vistaTabla.setControlador(this);
		vistaTabla.setModelo(modelo);
		vistaTabla.setModelo2(modelo2);
		this.setVista2(vistaTabla);
		modelo2.setVista2(vistaTabla);
		vistaTabla.setVisible(true);

	}
	private void setVista2(VistaAuxTabla vistaTabla) {
		this.vista2=vistaTabla;
		
	}

	public void GuardarDatos(){

		
		
		modeloFicheroIni.GuardarDatos(vistaFicheroIni.getTxtfBaseDatos(), vistaFicheroIni.getTxtfLogin(), vistaFicheroIni.getTxtfPassword(), vistaFicheroIni.getTxtfURL());
	}

	public void ventanaConfiguracion() {
		VistaFicheroIni vistaFichero = new VistaFicheroIni();
		vistaFichero.setControlador(this);
		vistaFichero.setModeloFich(modeloFicheroIni);
		vistaFichero.setModeloBBDD(modelo2);
		modeloFicheroIni.setVista(vistaFichero);
		modeloFicheroIni.Conectar();
		modeloFicheroIni.setDatos();
		
		setVistaFichero(vistaFichero);

		
		
		vistaFichero.setVisible(true);
	}

	public void refrescar() {

		modelo2.refrescar();
	}



	public void busquedaPersonaJur() {
		String nif = vista.getNIFBusquedaPJ();
		String razonSocial = vista.getTxtfRazonSocialBusquedaPJ();
		//modelo2.Consulta2(nif, razonSocial);

	}



	public void ActivarRepre(Container container, boolean enable) {
            Component[] components = container.getComponents();
            for (Component component : components) {
                   component.setEnabled(enable);
                   if (component instanceof Container) {
                	   ActivarRepre((Container) component, enable);
                   }
            }
      }

	public int insertarRepresentante() {
		return modelo2.insertarRepresentante(vista.getTxtfNombreR(),vista.getTxtfApellidosR(),vista.getTxtfDocumentoIdentidadR(),vista.getTxtfDireccionR(),vista.getTxtfMuncipioR(),vista.getTxtfCDR(),vista.getTxtfEmailR(),vista.getTxtfFaxR(),vista.getTxtfMovilR(),vista.getTxtfFijo());
		
	}

	public int insetarPersona() {
		return modelo2.insertarPersona(vista.getTxtfNombreI(),vista.getTxtfApellidosI(),vista.getTxtfMunicipio(),vista.getTxtfDireccionI(),vista.getTxtfCIFI(),vista.getTxtfEmailI(),vista.getTxtfFaxI(),vista.getTxtfMovilI(),vista.getTxtfFijoI(),vista.getTxtfCDI());
		
	}

	public int inscribirActividad() {
		return modelo2.insertarActividad(vista.getchckJustificantePago(),vista.getchckFotocopiaEscritura(),vista.getchckFotocopiaModelo36(),vista.getchckPlanos(),vista.getchckCD(),vista.getchckMemoria(),vista.getchckFotografia(),vista.getchckbxFotocopiaDNI(),vista.getchckbxCertificado1(),vista.getchckbxCertificado2(),vista.getchckCertificadoColegio(),vista.getComboBoxTipoSuelo(),vista.getDCFechaSolicitud(),vista.getDCFechaInicio(),vista.getTxtfLocal(),vista.getTxtfTipo(),vista.getTxtfCuota(),vista.getTxtfReferenciaCatastral(),vista.getTxtfEmplazamiento(),vista.gettxtfDescripcion(),vista.getchckFotocopiaLicenciaObra(),vista.getchckOtrasAuto(),vista.getComboBoxEstado());
		
	}
	
	public void inscribirTablaInter(int idPersona, int idActividad){
		modelo2.insertarTablaInter(idPersona,idActividad);
			
		
	}

	public void inscribirtablaInter2(int idPer, int idRep) {
		modelo2.insertarTablaInter2(idPer,idRep);
		
	}

	public void vaciarNuevaAct() {
		modelo.vaciarNuevaAct();
		
	}
String dato;
	public void recogerRegistroCambio(){
dato=String.valueOf(vista.getTabla().getValueAt(vista.getTabla().getSelectedRow(),0));
modelo2.recogerDatosParaCambioTitularidad(dato);
}

	public void habilitarRepresentante() {
		modelo2.habilitarRepresentante();
		
	}

	public void deshabilitarRepresentante() {
		modelo2.deshabilitarRepresentante();
		
	}

	public void realizarUpdate() {
		
		modelo2.realizarUpdate(vista2.getComboBoxActTipoSuelo(),vista2.getTxtfActReferenciaCatastral(),vista2.getTxtfActLocal(),vista2.getTxtfActTipo(),vista2.getTxtfActEmplazamiento(),vista2.getTxtfDCFechaInicio(),vista2.getTxtfDCFechaSolicitud(),vista2.getTxtActCuota(),vista2.getCheckActFotoJustificantePago(),vista2.getCheckActFotoEscritura(),vista2.getCheckActFotoModelo036(),vista2.getCheckActFotoPlanos(),vista2.getCheckActFotoCD(),vista2.getCheckActFotoMemoria(),vista2.getCheckActFotoFofografia(),vista2.getCheckActFotocopiaDni(),vista2.getCheckActCertColegioOficial(),vista2.getCheckActCertModelo1(),vista2.getCheckActCertModelo2(),vista2.getCheckActFotoLicenciaObra(),vista2.getCheckActFotoOtrasAutorizaciones(),vista2.getTxtPActDescripcion(),vista2.getTxtfintNombre(),vista2.getTxtfintApellido(),vista2.getTxtfintCif(),vista2.getTxtfintDireccion(),vista2.getTxtfintMunicipio(),vista2.getTxtfintCP(),vista2.getTxtfintTlfF(),vista2.getTxtfintTlfM(),vista2.getTxtfintFax(),vista2.getTxtfintEmail(),vista2.getComboBoxActEstado());
		
		
	}
	public void realizarUpdate2() {
		modelo2.realizarUpdate2(vista2.getTxtfrepNombre(),vista2.getTxtfrepApellidos(),vista2.getTxtfrepDocumentoIdentidad(),vista2.getTxtfrepDireccion(),vista2.getTxtfrepMunicipio(),vista2.getTxtfrepCP(),vista2.getTxtfrepTlfF(),vista2.getTxtfrepTlfM(),vista2.getTxtfrepFax(),vista2.getTxtfrepEmail());
	}

	public void copiarInfor() {
		modelo.copiarInfor(vista.getTxtfNombreI(),vista.getTxtfApellidosI(),vista.getTxtfCIFI(),vista.getTxtfDireccionI(),vista.getTxtfMunicipio(),vista.getTxtfCDI(),vista.getTxtfFijoI(),vista.getTxtfMovilI(),vista.getTxtfFaxI(),vista.getTxtfEmailI());
		
	}

	public void reconectar() {
		
		String url = vistaFicheroIni.getTxtfURL(); 
		String bd = vistaFicheroIni.getTxtfBaseDatos();
		
		
		
		modelo2.Conexion(url+bd, vistaFicheroIni.getTxtfLogin(), vistaFicheroIni.getTxtfPassword());
	
	}

}
