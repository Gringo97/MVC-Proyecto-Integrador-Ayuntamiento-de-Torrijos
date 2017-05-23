package Codigo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;

public class VistaAuxTabla extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	private Container contenedor;
	private JPanel contentPane;
	private JLabel lblJustificanteDePago;
	private JLabel lblEscritura;
	private JLabel lblModelo;
	private JLabel lblPlanos;
	private JLabel lblCd;
	private JLabel lblMemoria;
	private JLabel lblFotografia;
	private JTextField txtfRefCastral;
	private JTextField txtfLocal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	public VistaAuxTabla() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 955 , 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de suelo");
		lblNewLabel.setBounds(10, 69, 74, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblReferenciaCatastral = new JLabel("Referencia catastral");
		lblReferenciaCatastral.setBounds(10, 99, 104, 14);
		contentPane.add(lblReferenciaCatastral);
		
		JLabel lblLocal = new JLabel("Local");
		lblLocal.setBounds(10, 127, 31, 14);
		contentPane.add(lblLocal);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 155, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblEmplazamiento = new JLabel("Emplazamiento");
		lblEmplazamiento.setBounds(10, 183, 74, 14);
		contentPane.add(lblEmplazamiento);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setBounds(10, 211, 55, 14);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaSolicitud = new JLabel("Fecha Solicitud");
		lblFechaSolicitud.setBounds(10, 239, 74, 14);
		contentPane.add(lblFechaSolicitud);
		
		JLabel lblCuota = new JLabel("Cuota");
		lblCuota.setBounds(10, 267, 46, 14);
		contentPane.add(lblCuota);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(677, 211, 63, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblCertificadoColegioOficial = new JLabel("Certificado colegio oficial");
		lblCertificadoColegioOficial.setBounds(677, 74, 124, 14);
		contentPane.add(lblCertificadoColegioOficial);
		
		JLabel lblCertificado = new JLabel("Certificado Modelo 1");
		lblCertificado.setBounds(677, 102, 104, 14);
		contentPane.add(lblCertificado);
		
		JLabel lblCertificadoModelo = new JLabel("Certificado Modelo 2");
		lblCertificadoModelo.setBounds(677, 130, 104, 14);
		contentPane.add(lblCertificadoModelo);
		
		JLabel lblLicenciaObra = new JLabel("Licencia obra");
		lblLicenciaObra.setBounds(677, 158, 63, 14);
		contentPane.add(lblLicenciaObra);
		
		JLabel lblOtrasAutorizaciones = new JLabel("Otras autorizaciones");
		lblOtrasAutorizaciones.setBounds(677, 186, 104, 14);
		contentPane.add(lblOtrasAutorizaciones);
		
		lblJustificanteDePago = new JLabel("Justificante de pago");
		lblJustificanteDePago.setBounds(345, 69, 104, 14);
		contentPane.add(lblJustificanteDePago);
		
		lblEscritura = new JLabel("Escritura");
		lblEscritura.setBounds(345, 99, 46, 14);
		contentPane.add(lblEscritura);
		
		lblModelo = new JLabel("Modelo 36");
		lblModelo.setBounds(345, 127, 55, 14);
		contentPane.add(lblModelo);
		
		lblPlanos = new JLabel("Planos");
		lblPlanos.setBounds(345, 155, 46, 14);
		contentPane.add(lblPlanos);
		
		lblCd = new JLabel("CD");
		lblCd.setBounds(345, 183, 46, 14);
		contentPane.add(lblCd);
		
		lblMemoria = new JLabel("Memoria");
		lblMemoria.setBounds(345, 211, 46, 14);
		contentPane.add(lblMemoria);
		
		lblFotografia = new JLabel("Fotografia");
		lblFotografia.setBounds(345, 239, 55, 14);
		contentPane.add(lblFotografia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Urbano", "Rustico"}));
		comboBox.setBounds(155, 63, 92, 20);
		contentPane.add(comboBox);
		
		txtfRefCastral = new JTextField();
		txtfRefCastral.setBounds(155, 96, 92, 20);
		contentPane.add(txtfRefCastral);
		txtfRefCastral.setColumns(10);
		
		txtfLocal = new JTextField();
		txtfLocal.setColumns(10);
		txtfLocal.setBounds(155, 124, 92, 20);
		contentPane.add(txtfLocal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 152, 92, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 180, 92, 20);
		contentPane.add(textField_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(155, 211, 115, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(155, 239, 115, 20);
		contentPane.add(dateChooser_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 264, 92, 20);
		contentPane.add(textField_2);
		
		JCheckBox chckbxEntregado = new JCheckBox("Entregado");
		chckbxEntregado.setBounds(822, 70, 97, 23);
		contentPane.add(chckbxEntregado);
		
		JCheckBox checkBox = new JCheckBox("Entregado");
		checkBox.setBounds(822, 98, 97, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Entregado");
		checkBox_1.setBounds(822, 126, 97, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Entregado");
		checkBox_2.setBounds(822, 154, 97, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Entregado");
		checkBox_3.setBounds(822, 182, 97, 23);
		contentPane.add(checkBox_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(750, 211, 193, 70);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JCheckBox checkBox_4 = new JCheckBox("Entregado");
		checkBox_4.setBounds(455, 69, 97, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Entregado");
		checkBox_5.setBounds(455, 97, 97, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Entregado");
		checkBox_6.setBounds(455, 125, 97, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Entregado");
		checkBox_7.setBounds(455, 153, 97, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("Entregado");
		checkBox_8.setBounds(455, 181, 97, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Entregado");
		checkBox_9.setBounds(455, 211, 97, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("Entregado");
		checkBox_10.setBounds(455, 239, 97, 23);
		contentPane.add(checkBox_10);
		
		JLabel lblNewLabel_1 = new JLabel("ACTIVIDAD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 22, 124, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInteresado = new JLabel("INTERESADO");
		lblInteresado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInteresado.setBounds(155, 322, 124, 20);
		contentPane.add(lblInteresado);
		
		JLabel lblRepresentsnte = new JLabel("REPRESENTANTE");
		lblRepresentsnte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRepresentsnte.setBounds(674, 322, 143, 20);
		contentPane.add(lblRepresentsnte);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 360, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 385, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(10, 410, 46, 14);
		contentPane.add(lblCif);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 435, 46, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setBounds(10, 460, 46, 14);
		contentPane.add(lblMunicipio);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(90, 354, 92, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(90, 382, 92, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(90, 407, 92, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(90, 432, 92, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(90, 457, 92, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(334, 456, 92, 20);
		contentPane.add(textField_8);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(254, 459, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(254, 434, 46, 14);
		contentPane.add(lblFax);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(334, 431, 92, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(334, 406, 92, 20);
		contentPane.add(textField_10);
		
		JLabel lblTlfMovil = new JLabel("Tlf Movil");
		lblTlfMovil.setBounds(254, 409, 46, 14);
		contentPane.add(lblTlfMovil);
		
		JLabel lblCodigoPostal = new JLabel("Codigo postal");
		lblCodigoPostal.setBounds(254, 359, 46, 14);
		contentPane.add(lblCodigoPostal);
		
		JLabel lblTlfFijo = new JLabel("Tlf Fijo");
		lblTlfFijo.setBounds(254, 384, 46, 14);
		contentPane.add(lblTlfFijo);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(334, 381, 92, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(334, 353, 92, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		textField_13.setBounds(851, 353, 92, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		textField_14.setBounds(851, 381, 92, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		textField_15.setBounds(851, 406, 92, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(851, 431, 92, 20);
		contentPane.add(textField_16);
		
		JLabel lblFax_1 = new JLabel("Fax");
		lblFax_1.setEnabled(false);
		lblFax_1.setBounds(771, 434, 46, 14);
		contentPane.add(lblFax_1);
		
		JLabel lblTlfMovil_1 = new JLabel("Tlf Movil");
		lblTlfMovil_1.setEnabled(false);
		lblTlfMovil_1.setBounds(771, 409, 46, 14);
		contentPane.add(lblTlfMovil_1);
		
		JLabel lblTlfFijo_1 = new JLabel("Tlf Fijo");
		lblTlfFijo_1.setEnabled(false);
		lblTlfFijo_1.setBounds(771, 384, 46, 14);
		contentPane.add(lblTlfFijo_1);
		
		JLabel lblCodigoPostal_1 = new JLabel("Codigo Postal");
		lblCodigoPostal_1.setEnabled(false);
		lblCodigoPostal_1.setBounds(771, 359, 46, 14);
		contentPane.add(lblCodigoPostal_1);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		textField_18.setBounds(607, 354, 92, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		textField_19.setBounds(607, 382, 92, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		textField_20.setBounds(607, 407, 92, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
		textField_21.setBounds(607, 432, 92, 20);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEnabled(false);
		textField_22.setColumns(10);
		textField_22.setBounds(607, 457, 92, 20);
		contentPane.add(textField_22);
		
		JLabel lblMunicipio_1 = new JLabel("Municipio");
		lblMunicipio_1.setEnabled(false);
		lblMunicipio_1.setBounds(527, 460, 46, 14);
		contentPane.add(lblMunicipio_1);
		
		JLabel lblDireccion_1 = new JLabel("Direccion");
		lblDireccion_1.setEnabled(false);
		lblDireccion_1.setBounds(527, 435, 46, 14);
		contentPane.add(lblDireccion_1);
		
		JLabel lblDocumentoIdentidad = new JLabel("Documento Identidad");
		lblDocumentoIdentidad.setEnabled(false);
		lblDocumentoIdentidad.setBounds(527, 410, 46, 14);
		contentPane.add(lblDocumentoIdentidad);
		
		JLabel lblApellidos_1 = new JLabel("Apellidos");
		lblApellidos_1.setEnabled(false);
		lblApellidos_1.setBounds(527, 385, 46, 14);
		contentPane.add(lblApellidos_1);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setEnabled(false);
		lblNombre.setBounds(527, 360, 46, 14);
		contentPane.add(lblNombre);
		
		JCheckBox checkBox_11 = new JCheckBox("");
		checkBox_11.setBounds(822, 324, 21, 14);
		contentPane.add(checkBox_11);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(14, 309, 929, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(465, 334, 2, 143);
		contentPane.add(separator_1);
		
		JLabel label = new JLabel("Fotocopia DNI");
		label.setBounds(345, 267, 81, 14);
		contentPane.add(label);
		
		JCheckBox checkBox_12 = new JCheckBox("Entregado");
		checkBox_12.setBounds(455, 263, 97, 23);
		contentPane.add(checkBox_12);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(850, 495, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(607, 495, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setEnabled(false);
		btnAceptar.setBounds(728, 495, 89, 23);
		contentPane.add(btnAceptar);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public Container getContenedor() {

		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void adirArr() {

	}
}
