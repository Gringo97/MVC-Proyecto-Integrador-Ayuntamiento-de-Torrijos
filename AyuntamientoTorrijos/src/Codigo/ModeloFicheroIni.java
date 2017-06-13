package Codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ModeloFicheroIni implements Modelo {
	private VistaFicheroIni vista;
	private ModeloBBDD modeloBBDD;

	private File miFichero;
	private InputStream entrada;
	private final String FILE = "Fichero.ini";
	private Connection conexion;
	private String bd;
	private String login;
	private String pwd;
	private String url;
	private Properties datos;
	private JTextField bdjt;
	private JTextField logjt;
	private JTextField passjt;
	private JTextField urljt;
	private JButton ok;

	public ModeloFicheroIni() {
		this.Conectar();

	}

	public void GuardarDatos(String bd, String login, String pwd, String url) {
		OutputStream salida = null;
		try {
			miFichero = new File(FILE);
			if (miFichero.exists()) {
				salida = new FileOutputStream(miFichero);
				// asignamos los valores a las propiedades
				datos.setProperty("bd", bd);
				datos.setProperty("login", login);
				datos.setProperty("pwd", pwd);
				datos.setProperty("url", url);
				// guardamos el archivo de propiedades en la carpeta de
				// aplicación
				datos.store(salida, "Comentario para el fichero");
			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (salida != null) {
				try {
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void Conectar(){
		datos = new Properties();
		try {
			miFichero = new File(FILE);
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				datos.load(entrada);
				bd = datos.getProperty("bd");
				login = datos.getProperty("login");
				pwd = datos.getProperty("pwd");
				url = datos.getProperty("url");

				System.out.println(url);

			} else {
				System.err.println("Fichero no encontrado");
				System.exit(1);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally{
			if(entrada != null){
				try{
					entrada.close();
				}catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public void setDatos() {

		vista.setTxtfBaseDatos(bd);
		vista.setTxtfLogin(login);
		vista.setTxtfPassword(pwd);
		vista.setTxtfURL(url);
	}

	public void setModeloBBDD(ModeloBBDD modeloBBDD) {
		this.modeloBBDD = modeloBBDD;
		modeloBBDD.Conexion(url + bd, login, pwd);
	}

	public void setVista(Vista vista) {
		this.vista = (VistaFicheroIni) vista;

	}

	public String getBd() {
		return bd;
	}

	public void setBd(String bd) {
		this.bd = bd;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
