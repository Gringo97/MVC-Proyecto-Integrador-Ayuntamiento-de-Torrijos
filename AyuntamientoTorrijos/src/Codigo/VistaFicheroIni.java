package Codigo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaFicheroIni extends JFrame implements Vista{

	private JPanel contentPane;
	private ControladorWB controlador;
	private Modelo modelo;
	private ModeloBBDD modelo2;
	private ModeloFicheroIni modeloFich;
	private Container contenedor;
	private JTextField txtfBaseDatos;
	private JTextField txtfPassword;
	private JTextField txtfLogin;
	private JLabel lbl;
	private JTextField txtfURL;
	private JButton btnOk;


	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VistaFicheroIni() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 495, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtfBaseDatos = new JTextField();
		txtfBaseDatos.setBounds(234, 23, 245, 20);
		txtfBaseDatos.setColumns(10);

		JLabel lblBaseDeDatos = new JLabel("Base de Datos");
		lblBaseDeDatos.setBounds(15, 26, 189, 14);

		JLabel lblLogin = new JLabel("Usuario base de datos");
		lblLogin.setBounds(15, 57, 189, 14);

		txtfLogin = new JTextField();
		txtfLogin.setBounds(234, 54, 245, 20);
		txtfLogin.setColumns(10);

		JLabel lblPassword = new JLabel("Password base de datos");
		lblPassword.setBounds(15, 88, 189, 14);

		txtfPassword = new JTextField();
		txtfPassword.setBounds(234, 85, 245, 20);
		txtfPassword.setColumns(10);

		lbl = new JLabel("URL");
		lbl.setBounds(15, 119, 189, 14);

		txtfURL = new JTextField();
		txtfURL.setBounds(234, 116, 245, 20);
		txtfURL.setColumns(10);
		
		btnOk = new JButton("Aceptar");
		btnOk.setBounds(287, 169, 91, 23);
		
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(388, 169, 91, 23);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblPassword);
		contentPane.add(txtfURL);
		contentPane.add(txtfPassword);
		contentPane.add(btnOk);
		contentPane.add(btnCerrar);
		contentPane.add(lblBaseDeDatos);
		contentPane.add(txtfBaseDatos);
		contentPane.add(lblLogin);
		contentPane.add(txtfLogin);
		contentPane.add(lbl);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.GuardarDatos();
				try {
					controlador.reconectar();
					controlador.refrescar();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No esta conectado con su base de datos, acceda a la configuracion para conectarla");
				}
				dispose();
			}
		});
	}
	

	
	public String getTxtfBaseDatos() {
		return txtfBaseDatos.getText();
	}

	public void setTxtfBaseDatos(String txtfBaseDatos) {
		this.txtfBaseDatos.setText(txtfBaseDatos);
		
	}

	public String getTxtfPassword() {
		return txtfPassword.getText();
	}

	public void setTxtfPassword(String txtfPassword) {
		this.txtfPassword.setText(txtfPassword);
	}

	public String getTxtfLogin() {
		return txtfLogin.getText();
	}

	public void setTxtfLogin(String txtfLogin) {
		this.txtfLogin.setText(txtfLogin);
	}

	public String getTxtfURL() {
		return txtfURL.getText();
	}

	public void setTxtfURL(String txtfURL) {
		this.txtfURL.setText(txtfURL);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {

		return contenedor;
	}

	public void setModeloBBDD(Modelo modelo) {
		this.modelo = (ModeloBBDD) modelo;
	}
	public void setModeloFich(Modelo modeloFich) {
		this.modeloFich = (ModeloFicheroIni)modeloFich;
	}
	public JButton getBtnOk() {
		return btnOk;
	}
	public JTextField getTxtfPasswordEnb() {
		return txtfPassword;
	}
	public JTextField getTxtfBaseDatosEnb() {
		return txtfBaseDatos;
	}
	public JTextField getTxtfLoginEnb() {
		return txtfLogin;
	}
	public JTextField getTxtfURLEnb() {
		return txtfURL;
	}
	@Override
	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adirArr() {
		// TODO Auto-generated method stub
		
	}
}
