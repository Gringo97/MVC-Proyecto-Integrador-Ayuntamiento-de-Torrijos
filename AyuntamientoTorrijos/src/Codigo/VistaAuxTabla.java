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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VistaAuxTabla extends JFrame {
	private ControladorWB controlador;
	private Modelo modelo;
	private ModeloBBDD modelo2;
	private Container contenedor;
	private JPanel contentPane;

	private JPanel PanelActividadAux;
	private JPanel PanelInteresadoAux;
	private JPanel PanelRepAux;
	private JPanel PanelActividadAux_1;
	private JTextField txtfActEmplazamiento;
	private JDateChooser txtfDCFechaInicio;
	private JDateChooser txtfDCFechaSolicitud;
	private JCheckBox checkActFotoJustificantePago;
	private JCheckBox checkActFotoEscritura;
	private JCheckBox checkActFotoModelo036;
	private JCheckBox checkActFotoMemoria;
	private JCheckBox checkActFotoFofografia;
	private JCheckBox checkActFotocopiaDni;
	private JCheckBox checkActCertColegioOficial;
	private JCheckBox checkActCertModelo1;
	private JCheckBox checkActCertModelo2;
	private JCheckBox checkActFotoLicenciaObra;
	private JCheckBox checkActFotoOtrasAutorizaciones;
	private JTextPane txtPActDescripcion;
	private JCheckBox checkActFotoPlanos;
	private JCheckBox checkActFotoCD;
	private JTextField txtfActReferenciaCatastral;
	private JTextField txtfActLocal;
	private JTextField txtfActTipo;
	private JTextField txtActCuota;
	private JTextField txtfintNombre;
	private JTextField txtfintApellido;
	private JTextField txtfintCif;
	private JTextField txtfintDireccion;
	private JTextField txtfintMunicipio;
	private JTextField txtfintCP;
	private JTextField txtfintTlfF;
	private JTextField txtfintTlfM;
	private JTextField txtfintFax;
	private JTextField txtfintEmail;
	private JTextField txtfrepNombre;
	private JTextField txtfrepApellidos;
	private JTextField txtfrepDocumentoIdentidad;
	private JTextField txtfrepDireccion;
	private JTextField txtfrepMunicipio;
	private JTextField txtfrepCP;
	private JTextField txtfrepTlfF;
	private JTextField txtfrepTlfM;
	private JTextField txtfrepFax;
	private JComboBox comboBoxActTipoSuelo;
	private JTextField txtfrepEmail;
	private JLabel lblEstado;
	private JComboBox comboBoxActEstado;
	private JButton button;
	private JButton button_1;
	private JLabel label_7;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_16;
	private JLabel label_15;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel lblEmail;

	public VistaAuxTabla() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1028 , 596);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelInteresadoAux = new JPanel();
		PanelInteresadoAux.setBounds(0, 309, 502, 220);
		contentPane.add(PanelInteresadoAux);
		PanelInteresadoAux.setLayout(null);
		
		JLabel label_2 = new JLabel("Nombre");
		label_2.setBounds(24, 70, 82, 14);
		PanelInteresadoAux.add(label_2);
		
		JLabel lblCp = new JLabel("CP");
		lblCp.setBounds(264, 70, 75, 14);
		PanelInteresadoAux.add(lblCp);
		
		txtfintCP = new JTextField();
		txtfintCP.setBounds(339, 67, 126, 20);
		txtfintCP.setColumns(10);
		PanelInteresadoAux.add(txtfintCP);
		
		JLabel label_3 = new JLabel("Apellidos");
		label_3.setBounds(24, 98, 82, 14);
		PanelInteresadoAux.add(label_3);
		
		txtfintApellido = new JTextField();
		txtfintApellido.setBounds(105, 95, 106, 20);
		txtfintApellido.setColumns(10);
		PanelInteresadoAux.add(txtfintApellido);
		
		JLabel label_8 = new JLabel("Tlf Fijo");
		label_8.setBounds(264, 95, 69, 14);
		PanelInteresadoAux.add(label_8);
		
		txtfintTlfF = new JTextField();
		txtfintTlfF.setBounds(338, 95, 126, 20);
		txtfintTlfF.setColumns(10);
		PanelInteresadoAux.add(txtfintTlfF);
		
		JLabel label_4 = new JLabel("CIF");
		label_4.setBounds(24, 123, 82, 14);
		PanelInteresadoAux.add(label_4);
		
		txtfintCif = new JTextField();
		txtfintCif.setBounds(105, 120, 106, 20);
		txtfintCif.setColumns(10);
		PanelInteresadoAux.add(txtfintCif);
		
		JLabel label_9 = new JLabel("Tlf Movil");
		label_9.setBounds(264, 123, 75, 14);
		PanelInteresadoAux.add(label_9);
		
		txtfintTlfM = new JTextField();
		txtfintTlfM.setBounds(338, 120, 126, 20);
		txtfintTlfM.setColumns(10);
		PanelInteresadoAux.add(txtfintTlfM);
		
		JLabel label_5 = new JLabel("Direccion");
		label_5.setBounds(24, 148, 82, 14);
		PanelInteresadoAux.add(label_5);
		
		txtfintDireccion = new JTextField();
		txtfintDireccion.setBounds(105, 145, 106, 20);
		txtfintDireccion.setColumns(10);
		PanelInteresadoAux.add(txtfintDireccion);
		
		JLabel label_10 = new JLabel("Fax");
		label_10.setBounds(264, 145, 75, 14);
		PanelInteresadoAux.add(label_10);
		
		txtfintFax = new JTextField();
		txtfintFax.setBounds(338, 145, 126, 20);
		txtfintFax.setColumns(10);
		PanelInteresadoAux.add(txtfintFax);
		
		JLabel label_6 = new JLabel("Municipio");
		label_6.setBounds(24, 173, 82, 14);
		PanelInteresadoAux.add(label_6);
		
		txtfintMunicipio = new JTextField();
		txtfintMunicipio.setBounds(105, 171, 106, 20);
		txtfintMunicipio.setColumns(10);
		PanelInteresadoAux.add(txtfintMunicipio);
		
		JLabel label_11 = new JLabel("Email");
		label_11.setBounds(264, 173, 75, 14);
		PanelInteresadoAux.add(label_11);
		
		txtfintEmail = new JTextField();
		txtfintEmail.setBounds(338, 170, 126, 20);
		txtfintEmail.setColumns(10);
		PanelInteresadoAux.add(txtfintEmail);
		
		JLabel label_1 = new JLabel("INTERESADO");
		label_1.setBounds(172, 11, 107, 22);
		PanelInteresadoAux.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfintNombre = new JTextField();
		txtfintNombre.setBounds(105, 70, 106, 20);
		PanelInteresadoAux.add(txtfintNombre);
		txtfintNombre.setColumns(10);
		
		PanelRepAux = new JPanel();
		PanelRepAux.setBounds(501, 309, 521, 258);
		contentPane.add(PanelRepAux);
		
		txtfrepNombre = new JTextField();
		txtfrepNombre.setEnabled(false);
		txtfrepNombre.setColumns(10);
		
		label_7 = new JLabel("Nombre");
		label_7.setEnabled(false);
		
		label_12 = new JLabel("Apellidos");
		label_12.setEnabled(false);
		
		txtfrepApellidos = new JTextField();
		txtfrepApellidos.setEnabled(false);
		txtfrepApellidos.setColumns(10);
		
		label_13 = new JLabel("Documento Identidad");
		label_13.setEnabled(false);
		
		txtfrepDocumentoIdentidad = new JTextField();
		txtfrepDocumentoIdentidad.setEnabled(false);
		txtfrepDocumentoIdentidad.setColumns(10);
		
		label_15 = new JLabel("Direccion");
		label_15.setEnabled(false);
		
		txtfrepDireccion = new JTextField();
		txtfrepDireccion.setEnabled(false);
		txtfrepDireccion.setColumns(10);
		
		label_16 = new JLabel("Municipio");
		label_16.setEnabled(false);
		
		txtfrepMunicipio = new JTextField();
		txtfrepMunicipio.setEnabled(false);
		txtfrepMunicipio.setColumns(10);
		
		JLabel label_17 = new JLabel("REPRESENTANTE");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		label_14 = new JLabel("Codigo Postal");
		label_14.setEnabled(false);
		
		label_18 = new JLabel("Tlf Fijo");
		label_18.setEnabled(false);
		
		txtfrepTlfF = new JTextField();
		txtfrepTlfF.setEnabled(false);
		txtfrepTlfF.setColumns(10);
		
		label_19 = new JLabel("Tlf Movil");
		label_19.setEnabled(false);
		
		txtfrepTlfM = new JTextField();
		txtfrepTlfM.setEnabled(false);
		txtfrepTlfM.setColumns(10);
		
		label_20 = new JLabel("Fax");
		label_20.setEnabled(false);
		
		txtfrepFax = new JTextField();
		txtfrepFax.setEnabled(false);
		txtfrepFax.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setEnabled(false);
		
		txtfrepEmail = new JTextField();
		txtfrepEmail.setEnabled(false);
		txtfrepEmail.setColumns(10);
		
		txtfrepCP = new JTextField();
		txtfrepCP.setEnabled(false);
		txtfrepCP.setColumns(10);
		
		
		button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(modelo2.repId!=null){
					controlador.realizarUpdate();
					controlador.realizarUpdate2();
					controlador.refrescar();
					dispose();
				}
				controlador.realizarUpdate();
				controlador.refrescar();
				dispose();
				
			}
		});
		
		
		button_1 = new JButton("Cancelar");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		GroupLayout gl_PanelRepAux = new GroupLayout(PanelRepAux);
		gl_PanelRepAux.setHorizontalGroup(
			gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelRepAux.createSequentialGroup()
					.addGap(198)
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(261))
				.addGroup(gl_PanelRepAux.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_12)
						.addComponent(label_13)
						.addComponent(label_14)
						.addComponent(label_16))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addComponent(txtfrepNombre, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addComponent(txtfrepApellidos, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addComponent(txtfrepDocumentoIdentidad, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addComponent(txtfrepCP, 106, 106, Short.MAX_VALUE)
						.addComponent(txtfrepMunicipio, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail)
								.addComponent(label_19)
								.addComponent(label_20)
								.addComponent(label_18)
								.addComponent(label_15))
							.addGap(18)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtfrepEmail)
								.addComponent(txtfrepFax)
								.addComponent(txtfrepTlfM)
								.addComponent(txtfrepTlfF)
								.addComponent(txtfrepDireccion, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
							.addGap(17))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addGap(157))
		);
		gl_PanelRepAux.setVerticalGroup(
			gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelRepAux.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_7)
								.addComponent(txtfrepNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(9)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_12)
								.addComponent(txtfrepApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_13)
								.addComponent(txtfrepDocumentoIdentidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_14)
								.addComponent(txtfrepCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_16)
								.addComponent(txtfrepMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_PanelRepAux.createSequentialGroup()
								.addGap(105)
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblEmail)
									.addComponent(txtfrepEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_PanelRepAux.createSequentialGroup()
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_15)
									.addComponent(txtfrepDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_18)
									.addComponent(txtfrepTlfF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_19)
									.addComponent(txtfrepTlfM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_20)
									.addComponent(txtfrepFax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addGap(18)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		PanelRepAux.setLayout(gl_PanelRepAux);

		

		
		PanelActividadAux_1 = new JPanel();
		PanelActividadAux_1.setBounds(0, 0, 1022, 310);
		contentPane.add(PanelActividadAux_1);
		
		JLabel label_36 = new JLabel("ACTIVIDAD");
		label_36.setBounds(423, 11, 140, 22);
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_35 = new JLabel("Tipo de suelo");
		label_35.setBounds(70, 53, 140, 14);
		
		comboBoxActTipoSuelo = new JComboBox();
		comboBoxActTipoSuelo.setBounds(215, 49, 110, 20);
		comboBoxActTipoSuelo.setModel(new DefaultComboBoxModel(new String[] {"Urbano ", "Rustico"}));
		comboBoxActTipoSuelo.setEditable(true);
		
		JLabel label_27 = new JLabel("Justificante de pago");
		label_27.setBounds(397, 53, 159, 14);
		
		checkActFotoJustificantePago = new JCheckBox("");
		checkActFotoJustificantePago.setBounds(552, 53, 21, 21);
		
		JLabel label_26 = new JLabel("Certificado colegio oficial");
		label_26.setBounds(656, 53, 147, 14);
		
		checkActCertColegioOficial = new JCheckBox("");
		checkActCertColegioOficial.setBounds(799, 53, 21, 21);
		
		JLabel label_37 = new JLabel("Referencia catastral");
		label_37.setBounds(70, 79, 140, 14);
		
		txtfActReferenciaCatastral = new JTextField();
		txtfActReferenciaCatastral.setBounds(215, 76, 110, 20);
		txtfActReferenciaCatastral.setColumns(10);
		
		JLabel label_34 = new JLabel("Escritura");
		label_34.setBounds(397, 78, 159, 14);
		
		checkActFotoEscritura = new JCheckBox("");
		checkActFotoEscritura.setBounds(552, 75, 21, 21);
		
		JLabel label_25 = new JLabel("Certificado Modelo 1");
		label_25.setBounds(656, 79, 137, 14);
		
		checkActCertModelo1 = new JCheckBox("");
		checkActCertModelo1.setBounds(799, 76, 21, 21);
		
		JLabel label_43 = new JLabel("Local");
		label_43.setBounds(70, 106, 140, 14);
		
		txtfActLocal = new JTextField();
		txtfActLocal.setBounds(215, 103, 110, 20);
		txtfActLocal.setColumns(10);
		
		JLabel label_33 = new JLabel("Modelo 36");
		label_33.setBounds(397, 106, 159, 14);
		
		checkActFotoModelo036 = new JCheckBox("");
		checkActFotoModelo036.setBounds(552, 102, 21, 21);
		
		JLabel label_24 = new JLabel("Certificado Modelo 2");
		label_24.setBounds(657, 107, 128, 14);
		
		checkActCertModelo2 = new JCheckBox("");
		checkActCertModelo2.setBounds(799, 100, 21, 21);
		
		JLabel label_42 = new JLabel("Tipo");
		label_42.setBounds(70, 132, 140, 14);
		
		txtfActTipo = new JTextField();
		txtfActTipo.setBounds(215, 129, 110, 20);
		txtfActTipo.setColumns(10);
		
		JLabel label_32 = new JLabel("Planos");
		label_32.setBounds(397, 131, 159, 14);
		
		checkActFotoPlanos = new JCheckBox("");
		checkActFotoPlanos.setBounds(552, 128, 21, 21);
		
		JLabel label_23 = new JLabel("Licencia obra");
		label_23.setBounds(658, 133, 128, 14);
		
		checkActFotoLicenciaObra = new JCheckBox("");
		checkActFotoLicenciaObra.setBounds(799, 126, 21, 21);
		
		JLabel label_41 = new JLabel("Emplazamiento");
		label_41.setBounds(70, 158, 140, 14);
		
		txtfActEmplazamiento = new JTextField();
		txtfActEmplazamiento.setBounds(215, 155, 110, 20);
		txtfActEmplazamiento.setColumns(10);
		
		JLabel label_31 = new JLabel("CD");
		label_31.setBounds(397, 156, 159, 14);
		
		checkActFotoCD = new JCheckBox("");
		checkActFotoCD.setBounds(552, 151, 21, 21);
		
		JLabel label_22 = new JLabel("Otras autorizaciones");
		label_22.setBounds(657, 159, 129, 14);
		
		checkActFotoOtrasAutorizaciones = new JCheckBox("");
		checkActFotoOtrasAutorizaciones.setBounds(799, 152, 21, 21);
		
		JLabel label_40 = new JLabel("Fecha inicio");
		label_40.setBounds(70, 188, 140, 14);
		
		txtfDCFechaInicio = new JDateChooser();
		txtfDCFechaInicio.setBounds(215, 182, 110, 20);
		
		JLabel label_30 = new JLabel("Memoria");
		label_30.setBounds(397, 182, 159, 14);
		
		checkActFotoMemoria = new JCheckBox("");
		checkActFotoMemoria.setBounds(552, 177, 21, 21);
		
		JLabel label = new JLabel("Descripcion");
		label.setBounds(656, 227, 78, 14);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(799, 227, 183, 59);
		
		JLabel label_39 = new JLabel("Fecha Solicitud");
		label_39.setBounds(70, 214, 140, 14);
		
		txtfDCFechaSolicitud = new JDateChooser();
		txtfDCFechaSolicitud.setBounds(215, 209, 110, 20);
		
		JLabel label_29 = new JLabel("Fotografia");
		label_29.setBounds(397, 208, 159, 14);
		
		checkActFotoFofografia = new JCheckBox("");
		checkActFotoFofografia.setBounds(552, 203, 21, 21);
		
		JLabel label_38 = new JLabel("Cuota");
		label_38.setBounds(70, 245, 140, 14);
		
		txtActCuota = new JTextField();
		txtActCuota.setBounds(215, 239, 110, 20);
		txtActCuota.setColumns(10);
		
		JLabel label_28 = new JLabel("Fotocopia DNI");
		label_28.setBounds(397, 233, 159, 14);
		
		checkActFotocopiaDni = new JCheckBox("");
		checkActFotocopiaDni.setBounds(552, 229, 21, 21);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(656, 182, 98, 14);
		
		comboBoxActEstado = new JComboBox();
		comboBoxActEstado.setBounds(799, 179, 110, 20);
		comboBoxActEstado.setModel(new DefaultComboBoxModel(new String[] {"Procesando", "Aceptada", "Archivada"}));
		
		txtPActDescripcion = new JTextPane();
		scrollPane.setColumnHeaderView(txtPActDescripcion);
		PanelActividadAux_1.setLayout(null);
		PanelActividadAux_1.add(label_37);
		PanelActividadAux_1.add(txtfActReferenciaCatastral);
		PanelActividadAux_1.add(label_34);
		PanelActividadAux_1.add(checkActFotoEscritura);
		PanelActividadAux_1.add(label_35);
		PanelActividadAux_1.add(comboBoxActTipoSuelo);
		PanelActividadAux_1.add(label_27);
		PanelActividadAux_1.add(checkActFotoJustificantePago);
		PanelActividadAux_1.add(label_25);
		PanelActividadAux_1.add(checkActCertModelo1);
		PanelActividadAux_1.add(label_26);
		PanelActividadAux_1.add(checkActCertColegioOficial);
		PanelActividadAux_1.add(label_43);
		PanelActividadAux_1.add(txtfActLocal);
		PanelActividadAux_1.add(label_33);
		PanelActividadAux_1.add(checkActFotoModelo036);
		PanelActividadAux_1.add(label_42);
		PanelActividadAux_1.add(txtfActTipo);
		PanelActividadAux_1.add(label_32);
		PanelActividadAux_1.add(checkActFotoPlanos);
		PanelActividadAux_1.add(label_41);
		PanelActividadAux_1.add(txtfActEmplazamiento);
		PanelActividadAux_1.add(label_31);
		PanelActividadAux_1.add(checkActFotoCD);
		PanelActividadAux_1.add(label_40);
		PanelActividadAux_1.add(label_39);
		PanelActividadAux_1.add(label_38);
		PanelActividadAux_1.add(txtfDCFechaInicio);
		PanelActividadAux_1.add(txtfDCFechaSolicitud);
		PanelActividadAux_1.add(txtActCuota);
		PanelActividadAux_1.add(comboBoxActEstado);
		PanelActividadAux_1.add(label_30);
		PanelActividadAux_1.add(label_29);
		PanelActividadAux_1.add(label_28);
		PanelActividadAux_1.add(checkActFotoMemoria);
		PanelActividadAux_1.add(checkActFotoFofografia);
		PanelActividadAux_1.add(checkActFotocopiaDni);
		PanelActividadAux_1.add(label);
		PanelActividadAux_1.add(scrollPane);
		PanelActividadAux_1.add(label_22);
		PanelActividadAux_1.add(checkActFotoOtrasAutorizaciones);
		PanelActividadAux_1.add(label_23);
		PanelActividadAux_1.add(label_24);
		PanelActividadAux_1.add(checkActCertModelo2);
		PanelActividadAux_1.add(checkActFotoLicenciaObra);
		PanelActividadAux_1.add(lblEstado);
		PanelActividadAux_1.add(label_36);
		

	
	}

	public String getComboBoxActEstado() {
		return (String)comboBoxActEstado.getSelectedItem();
	}

	public void setComboBoxActEstado(JComboBox comboBoxActEstado) {
		this.comboBoxActEstado = comboBoxActEstado;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {

		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo =  modelo;
	}
	public void setModelo2(Modelo modelo) {
		this.modelo2 = (ModeloBBDD) modelo;
	}

	public void adirArr() {

	}

	public void devolverDatosTitular() {
		
		/////// DATOS CHECKBOX ///////
	
		if(modelo2.getActCertColegioOficial().equals("1")){
			
			checkActCertColegioOficial.setSelected(true);
		}

		if(modelo2.getActFotoEscritura().equalsIgnoreCase("1")){
			
			checkActFotoEscritura.setSelected(true);
		}
		
		if(modelo2.getActFotoModelo036().equalsIgnoreCase("1")){
			
			checkActFotoModelo036.setSelected(true);
		}
		if(modelo2.getActFotoPlanos().equalsIgnoreCase("1")){
			
			checkActFotoPlanos.setSelected(true);
		}
		if(modelo2.getActFotoCD().equalsIgnoreCase("1")){
			
			checkActFotoCD.setSelected(true);
		}
		if(modelo2.getActFotoMemoria().equalsIgnoreCase("1")){
			
			checkActFotoMemoria.setSelected(true);
		}
		if(modelo2.getActFotoFofografia().equalsIgnoreCase("1")){
			
			checkActFotoFofografia.setSelected(true);
		}
		if(modelo2.getActFotocopiaDni().equalsIgnoreCase("1")){
			
			checkActFotocopiaDni.setSelected(true);
		}
		if(modelo2.getActCertColegioOficial().equalsIgnoreCase("1")){
			
			checkActCertColegioOficial.setSelected(true);
		}
		if(modelo2.getActCertModelo1().equalsIgnoreCase("1")){
			
			checkActCertModelo1.setSelected(true);
		}
		if(modelo2.getActCertModelo2().equalsIgnoreCase("1")){
			
			checkActCertModelo2.setSelected(true);
		}
		if(modelo2.getActFotoLicenciaObra().equalsIgnoreCase("1")){
			
			checkActFotoLicenciaObra.setSelected(true);
		}
		if(modelo2.getActFotoOtrasAutorizaciones().equalsIgnoreCase("1")){
			
			checkActFotoOtrasAutorizaciones.setSelected(true);
		}
		if(modelo2.getActFotoJustificantePago().equalsIgnoreCase("1")){
			
			checkActFotoJustificantePago.setSelected(true);
		}
	

		/////DATOS REPRESENTANTE////
	if(modelo2.getRepId()!=null)	{


		habilitarRepresentante();
		txtfrepNombre.setText(modelo2.repNombre);
		txtfrepApellidos.setText(modelo2.repApellidos);
		txtfrepDocumentoIdentidad.setText(modelo2.repDocumentoIdentidad);
		txtfrepDireccion.setText(modelo2.repDireccion);
		txtfrepMunicipio.setText(modelo2.repMunicipio);
		txtfrepCP.setText(modelo2.repCP);
		txtfrepTlfF.setText(modelo2.repTlfF);
		txtfrepTlfM.setText(modelo2.repTlfM);
		txtfrepFax.setText(modelo2.repFax);
		txtfrepEmail.setText(modelo2.repEmail);
	}else{
		deshabilitarRepresentante();

		txtfrepNombre.setText("");
		txtfrepApellidos.setText("");
		txtfrepDocumentoIdentidad.setText("");
		txtfrepDireccion.setText("");
		txtfrepMunicipio.setText("");
		txtfrepCP.setText("");
		txtfrepTlfF.setText("");
		txtfrepTlfM.setText("");
		txtfrepFax.setText("");
		txtfrepEmail.setText("");
	}
		/////INTERESADO//////
		
		txtfintNombre.setText(modelo2.intNombre);
		txtfintApellido.setText(modelo2.intApellido);
		txtfintCif.setText(modelo2.intCif);
		txtfintDireccion.setText(modelo2.intDireccion);
		txtfintMunicipio.setText(modelo2.intMunicipio);
		txtfintCP.setText(modelo2.intCP);
		txtfintTlfF.setText(modelo2.intTlfF);
		txtfintTlfM.setText(modelo2.intTlfM);
		txtfintFax.setText(modelo2.intFax);
		txtfintEmail.setText(modelo2.intEmail);
		comboBoxActEstado.setSelectedItem(modelo2.getActEstado());
		comboBoxActTipoSuelo.setSelectedItem(modelo2.getActTipoSuelo());
		///////ACTIVIDAD//////
		///////SELECTS /////
	
		
		
		txtfActReferenciaCatastral.setText(modelo2.ActReferenciaCatastral);
		txtfActLocal.setText(modelo2.ActLocal);
		txtfActTipo.setText(modelo2.ActTipo);
		txtfActEmplazamiento.setText(modelo2.ActEmplazamiento);
		txtPActDescripcion.setText(modelo2.ActDescripcion);
		txtActCuota.setText(modelo2.ActCuota);


		java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
		/////DATES////
		try {
			if(modelo2.ActFechaInicio==null){}else{
			java.util.Date fechaDate = formato.parse(modelo2.ActFechaInicio);
			txtfDCFechaInicio.setDate(fechaDate);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
			java.util.Date fechaDate = formato.parse(modelo2.ActFechaSolicitud);
			txtfDCFechaSolicitud.setDate(fechaDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}



	public String getTxtfActEmplazamiento() {
		return txtfActEmplazamiento.getText();
	}

	public void setTxtfActEmplazamiento(JTextField txtfActEmplazamiento) {
		this.txtfActEmplazamiento = txtfActEmplazamiento;
	}

	public String getTxtfDCFechaInicio() {
		String date=null;
		if(txtfDCFechaInicio  ==null){
	
		}else{	DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		date = fmt.format(this.txtfDCFechaInicio.getDate());}
		return date;
		
	}

	public void setTxtfDCFechaInicio(JDateChooser txtfDCFechaInicio) {
		this.txtfDCFechaInicio = txtfDCFechaInicio;
	}

	public String getTxtfDCFechaSolicitud() {
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		String date = fmt.format(this.txtfDCFechaSolicitud.getDate());
		return date;
		
	}

	public void setTxtfDCFechaSolicitud(JDateChooser txtfDCFechaSolicitud) {
		this.txtfDCFechaSolicitud = txtfDCFechaSolicitud;
	}

	public Boolean getCheckActFotoJustificantePago() {
		if(checkActFotoJustificantePago.isSelected()){
			return true;
		}else{
			return false;
		}
	}

	public void setCheckActFotoJustificantePago(String checkActFotoJustificantePago) {
		this.checkActFotoJustificantePago.setText(checkActFotoJustificantePago);
	}

	public Boolean getCheckActFotoEscritura() {
		if(checkActFotoEscritura.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoEscritura(String checkActFotoEscritura) {
		this.checkActFotoEscritura.setText(checkActFotoEscritura);
	}

	public Boolean getCheckActFotoModelo036() {
		if(checkActFotoModelo036.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoModelo036(String checkActFotoModelo036) {
		this.checkActFotoModelo036.setText(checkActFotoModelo036);
	}

	public Boolean getCheckActFotoMemoria() {
		if(checkActFotoMemoria.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoMemoria(String checkActFotoMemoria) {
		this.checkActFotoMemoria.setText(checkActFotoMemoria);
	}

	public Boolean getCheckActFotoFofografia() {
		if(checkActFotoFofografia.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoFofografia(String checkActFotoFofografia) {
		this.checkActFotoFofografia.setText(checkActFotoFofografia);
	}

	public Boolean getCheckActFotocopiaDni() {
		if(checkActFotocopiaDni.isSelected()){
			return true;
		}else{
			return false;
		}
	
	}

	public void setCheckActFotocopiaDni(String checkActFotocopiaDni) {
		this.checkActFotocopiaDni.setText(checkActFotocopiaDni);
	}

	public Boolean getCheckActCertColegioOficial() {
		if(checkActCertColegioOficial.isSelected()){
			return true;
		}else{
			return false;
		}
	
		
	}

	public void setCheckActCertColegioOficial(String checkActCertColegioOficial) {
		this.checkActCertColegioOficial.setText(checkActCertColegioOficial);
	}

	public Boolean getCheckActCertModelo1() {
		if(checkActCertModelo1.isSelected()){
			return true;
		}else{
			return false;
		}
	
		
	}

	public void setCheckActCertModelo1(String checkActCertModelo1) {
		this.checkActCertModelo1.setText(checkActCertModelo1);
	}

	public Boolean getCheckActCertModelo2() {
		if(checkActCertModelo2.isSelected()){
			return true;
		}else{
			return false;
		}
	
		
	}

	public void setCheckActCertModelo2(String checkActCertModelo2) {
		this.checkActCertModelo2.setText(checkActCertModelo2);
	}

	public Boolean getCheckActFotoLicenciaObra() {
		
		if(checkActFotoLicenciaObra.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoLicenciaObra(String checkActFotoLicenciaObra) {
		this.checkActFotoLicenciaObra.setText(checkActFotoLicenciaObra);
	}

	public Boolean getCheckActFotoOtrasAutorizaciones() {
		if(checkActFotoOtrasAutorizaciones.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoOtrasAutorizaciones(String checkActFotoOtrasAutorizaciones) {
		this.checkActFotoOtrasAutorizaciones.setText(checkActFotoOtrasAutorizaciones);
	}

	public String getTxtPActDescripcion() {
		return txtPActDescripcion.getText();
	}

	public void setTxtPActDescripcion(JTextPane txtPActDescripcion) {
		this.txtPActDescripcion = txtPActDescripcion;
	}

	public Boolean getCheckActFotoPlanos() {
		if(checkActFotoPlanos.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoPlanos(String checkActFotoPlanos) {
		this.checkActFotoPlanos.setText(checkActFotoPlanos);
	}

	public Boolean getCheckActFotoCD() {
		if(checkActFotoCD.isSelected()){
			return true;
		}else{
			return false;
		}
		
	}

	public void setCheckActFotoCD(String checkActFotoCD) {
		this.checkActFotoCD.setText(checkActFotoCD);
	}

	public String getTxtfActReferenciaCatastral() {
		return txtfActReferenciaCatastral.getText();
	}

	public void setTxtfActReferenciaCatastral(JTextField txtfActReferenciaCatastral) {
		this.txtfActReferenciaCatastral = txtfActReferenciaCatastral;
	}

	public String getTxtfActLocal() {
		return txtfActLocal.getText();
	}

	public void setTxtfActLocal(JTextField txtfActLocal) {
		this.txtfActLocal = txtfActLocal;
	}

	public String getTxtfActTipo() {
		return txtfActTipo.getText();
	}

	public void setTxtfActTipo(JTextField txtfActTipo) {
		this.txtfActTipo = txtfActTipo;
	}

	public String getTxtActCuota() {
		return txtActCuota.getText();
	}

	public void setTxtActCuota(JTextField txtActCuota) {
		this.txtActCuota = txtActCuota;
	}

	public String getTxtfintNombre() {
		return txtfintNombre.getText();
	}

	public void setTxtfintNombre(JTextField txtfintNombre) {
		this.txtfintNombre = txtfintNombre;
	}

	public String getTxtfintApellido() {
		return txtfintApellido.getText();
	}

	public void setTxtfintApellido(JTextField txtfintApellido) {
		this.txtfintApellido = txtfintApellido;
	}

	public String getTxtfintCif() {
		return txtfintCif.getText();
	}

	public void setTxtfintCif(JTextField txtfintCif) {
		this.txtfintCif = txtfintCif;
	}

	public String getTxtfintDireccion() {
		return txtfintDireccion.getText();
	}

	public void setTxtfintDireccion(JTextField txtfintDireccion) {
		this.txtfintDireccion = txtfintDireccion;
	}

	public String getTxtfintMunicipio() {
		return txtfintMunicipio.getText();
	}

	public void setTxtfintMunicipio(JTextField txtfintMunicipio) {
		this.txtfintMunicipio = txtfintMunicipio;
	}

	public String getTxtfintCP() {
		return txtfintCP.getText();
	}

	public void setTxtfintCP(JTextField txtfintCP) {
		this.txtfintCP = txtfintCP;
	}

	public String getTxtfintTlfF() {
		return txtfintTlfF.getText();
	}

	public void setTxtfintTlfF(JTextField txtfintTlfF) {
		this.txtfintTlfF = txtfintTlfF;
	}

	public String getTxtfintTlfM() {
		return txtfintTlfM.getText();
	}

	public void setTxtfintTlfM(JTextField txtfintTlfM) {
		this.txtfintTlfM = txtfintTlfM;
	}

	public String getTxtfintFax() {
		return txtfintFax.getText();
	}

	public void setTxtfintFax(JTextField txtfintFax) {
		this.txtfintFax = txtfintFax;
	}

	public String getTxtfintEmail() {
		return txtfintEmail.getText();
	}

	public void setTxtfintEmail(JTextField txtfintEmail) {
		this.txtfintEmail = txtfintEmail;
	}

	public String getTxtfrepNombre() {
		return txtfrepNombre.getText();
	}

	public void setTxtfrepNombre(JTextField txtfrepNombre) {
		this.txtfrepNombre = txtfrepNombre;
	}

	public String getTxtfrepApellidos() {
		return txtfrepApellidos.getText();
	}

	public void setTxtfrepApellidos(JTextField txtfrepApellidos) {
		this.txtfrepApellidos = txtfrepApellidos;
	}

	public String getTxtfrepDocumentoIdentidad() {
		return txtfrepDocumentoIdentidad.getText();
	}

	public void setTxtfrepDocumentoIdentidad(JTextField txtfrepDocumentoIdentidad) {
		this.txtfrepDocumentoIdentidad = txtfrepDocumentoIdentidad;
	}

	public String getTxtfrepDireccion() {
		return txtfrepDireccion.getText();
	}

	public void setTxtfrepDireccion(JTextField txtfrepDireccion) {
		this.txtfrepDireccion = txtfrepDireccion;
	}

	public String getTxtfrepMunicipio() {
		return txtfrepMunicipio.getText();
	}

	public void setTxtfrepMunicipio(JTextField txtfrepMunicipio) {
		this.txtfrepMunicipio = txtfrepMunicipio;
	}

	public String getTxtfrepCP() {
		return txtfrepCP.getText();
	}

	public void setTxtfrepCP(JTextField txtfrepCP) {
		this.txtfrepCP = txtfrepCP;
	}

	public String getTxtfrepTlfF() {
		return txtfrepTlfF.getText();
	}

	public void setTxtfrepTlfF(JTextField txtfrepTlfF) {
		this.txtfrepTlfF = txtfrepTlfF;
	}

	public String getTxtfrepTlfM() {
		return txtfrepTlfM.getText();
	}

	public void setTxtfrepTlfM(JTextField txtfrepTlfM) {
		this.txtfrepTlfM = txtfrepTlfM;
	}

	public String getTxtfrepFax() {
		return txtfrepFax.getText();
	}

	public void setTxtfrepFax(JTextField txtfrepFax) {
		this.txtfrepFax = txtfrepFax;
	}

	public String getComboBoxActTipoSuelo() {
		return (String) comboBoxActTipoSuelo.getSelectedItem();
	}

	public void setComboBoxActTipoSuelo(JComboBox comboBoxActTipoSuelo) {
		this.comboBoxActTipoSuelo = comboBoxActTipoSuelo;
	}

	public String getTxtfrepEmail() {
		return txtfrepEmail.getText();
	}

	public void setTxtfrepEmail(JTextField txtfrepEmail) {
		this.txtfrepEmail = txtfrepEmail;
	}

	public void habilitarRepresentante() {
		System.out.println("habilita");


		System.out.println("habilita2");
		txtfrepNombre.setEnabled(true);
		txtfrepApellidos.setEnabled(true);
		txtfrepDocumentoIdentidad.setEnabled(true);
		txtfrepDireccion.setEnabled(true);
		txtfrepMunicipio.setEnabled(true);
		txtfrepCP.setEnabled(true);
		txtfrepTlfF.setEnabled(true);
		txtfrepTlfM.setEnabled(true);
		txtfrepFax.setEnabled(true);
		txtfrepEmail.setEnabled(true);
		label_12.setEnabled(true);
		label_13.setEnabled(true);
		label_14.setEnabled(true);
		label_15.setEnabled(true);
		label_16.setEnabled(true);
		label_18.setEnabled(true);
		label_19.setEnabled(true);
		label_20.setEnabled(true);
		label_7.setEnabled(true);
		lblEmail.setEnabled(true);
		
		
		
	}

	public void deshabilitarRepresentante() {
		System.out.println("deshabilita");

		label_12.setEnabled(false);
		label_13.setEnabled(false);
		label_14.setEnabled(false);
		label_15.setEnabled(false);
		label_16.setEnabled(false);
		label_18.setEnabled(false);
		label_19.setEnabled(false);
		label_20.setEnabled(false);
		label_7.setEnabled(false);
		lblEmail.setEnabled(false);
		txtfrepNombre.setEnabled(false);
		txtfrepApellidos.setEnabled(false);
		txtfrepDocumentoIdentidad.setEnabled(false);
		txtfrepDireccion.setEnabled(false);
		txtfrepMunicipio.setEnabled(false);
		txtfrepCP.setEnabled(false);
		txtfrepTlfF.setEnabled(false);
		txtfrepTlfM.setEnabled(false);
		txtfrepFax.setEnabled(false);
		txtfrepEmail.setEnabled(false);
		
		
	}
}
