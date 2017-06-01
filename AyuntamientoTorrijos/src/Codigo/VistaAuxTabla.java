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
	private JButton btnAceptar;
	private JLabel lblEstado;
	private JComboBox comboBoxActEstado;

	public VistaAuxTabla() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 955 , 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(850, 499, 89, 23);
		contentPane.add(btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(modelo2.getRepId()==null){
				controlador.realizarUpdate();
				}else{
				controlador.realizarUpdate();
				controlador.realizarUpdate2();	
				}
				controlador.refrescar();
				dispose();
				
			}
		});
		btnAceptar.setBounds(728, 499, 89, 23);
		contentPane.add(btnAceptar);
		
		PanelInteresadoAux = new JPanel();
		PanelInteresadoAux.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		PanelInteresadoAux.setBounds(0, 309, 465, 187);
		contentPane.add(PanelInteresadoAux);
		
		JLabel label_1 = new JLabel("INTERESADO");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("Nombre");
		
		txtfintNombre = new JTextField();
		txtfintNombre.setColumns(10);
		
		JLabel label_3 = new JLabel("Apellidos");
		
		txtfintApellido = new JTextField();
		txtfintApellido.setColumns(10);
		
		JLabel label_4 = new JLabel("CIF");
		
		txtfintCif = new JTextField();
		txtfintCif.setColumns(10);
		
		JLabel label_5 = new JLabel("Direccion");
		
		txtfintDireccion = new JTextField();
		txtfintDireccion.setColumns(10);
		
		JLabel label_6 = new JLabel("Municipio");
		
		txtfintMunicipio = new JTextField();
		txtfintMunicipio.setColumns(10);
		
		JLabel label_7 = new JLabel("Codigo postal");
		
		txtfintCP = new JTextField();
		txtfintCP.setColumns(10);
		
		JLabel label_8 = new JLabel("Tlf Fijo");
		
		txtfintTlfF = new JTextField();
		txtfintTlfF.setColumns(10);
		
		JLabel label_9 = new JLabel("Tlf Movil");
		
		txtfintTlfM = new JTextField();
		txtfintTlfM.setColumns(10);
		
		JLabel label_10 = new JLabel("Fax");
		
		txtfintFax = new JTextField();
		txtfintFax.setColumns(10);
		
		JLabel label_11 = new JLabel("Email");
		
		txtfintEmail = new JTextField();
		txtfintEmail.setColumns(10);
		GroupLayout gl_PanelInteresadoAux = new GroupLayout(PanelInteresadoAux);
		gl_PanelInteresadoAux.setHorizontalGroup(
			gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(145)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3)
								.addComponent(label_2)
								.addComponent(label_4)
								.addComponent(label_5)
								.addComponent(label_6))
							.addGap(33)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(txtfintNombre, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfintApellido, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfintCif, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfintDireccion, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfintMunicipio, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
							.addGap(67)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
									.addComponent(label_11)
									.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
									.addComponent(txtfintEmail, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
											.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
												.addComponent(label_10)
												.addComponent(label_9))
											.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
											.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
												.addComponent(txtfintFax, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtfintTlfM, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
										.addGroup(Alignment.LEADING, gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
												.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(txtfintTlfF, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
												.addComponent(label_7)
												.addGap(18)
												.addComponent(txtfintCP, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(41))
		);
		gl_PanelInteresadoAux.setVerticalGroup(
			gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_2)
								.addComponent(txtfintNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(txtfintCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7))
							.addGap(1)))
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
									.addGap(4)
									.addComponent(label_3))
								.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
									.addGap(1)
									.addComponent(txtfintApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4)
								.addComponent(txtfintCif, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_8)
								.addComponent(txtfintTlfF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtfintTlfM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_9))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtfintDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_5))
						.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
							.addComponent(label_10)
							.addComponent(txtfintFax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtfintMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6)))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_11))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtfintEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		PanelInteresadoAux.setLayout(gl_PanelInteresadoAux);
		
		PanelRepAux = new JPanel();
		PanelRepAux.setBounds(459, 309, 484, 187);
		contentPane.add(PanelRepAux);
		
		txtfrepNombre = new JTextField();
		txtfrepNombre.setEnabled(false);
		txtfrepNombre.setColumns(10);
		
		JLabel label_12 = new JLabel("Nombre");
		label_12.setEnabled(false);
		
		JLabel label_13 = new JLabel("Apellidos");
		label_13.setEnabled(false);
		
		txtfrepApellidos = new JTextField();
		txtfrepApellidos.setEnabled(false);
		txtfrepApellidos.setColumns(10);
		
		JLabel label_14 = new JLabel("Documento Identidad");
		label_14.setEnabled(false);
		
		txtfrepDocumentoIdentidad = new JTextField();
		txtfrepDocumentoIdentidad.setEnabled(false);
		txtfrepDocumentoIdentidad.setColumns(10);
		
		JLabel label_15 = new JLabel("Direccion");
		label_15.setEnabled(false);
		
		txtfrepDireccion = new JTextField();
		txtfrepDireccion.setEnabled(false);
		txtfrepDireccion.setColumns(10);
		
		JLabel label_16 = new JLabel("Municipio");
		label_16.setEnabled(false);
		
		txtfrepMunicipio = new JTextField();
		txtfrepMunicipio.setEnabled(false);
		txtfrepMunicipio.setColumns(10);
		
		JLabel label_17 = new JLabel("REPRESENTANTE");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_18 = new JLabel("Codigo Postal");
		label_18.setEnabled(false);
		
		txtfrepCP = new JTextField();
		txtfrepCP.setEnabled(false);
		txtfrepCP.setColumns(10);
		
		JLabel label_19 = new JLabel("Tlf Fijo");
		label_19.setEnabled(false);
		
		txtfrepTlfF = new JTextField();
		txtfrepTlfF.setEnabled(false);
		txtfrepTlfF.setColumns(10);
		
		JLabel label_20 = new JLabel("Tlf Movil");
		label_20.setEnabled(false);
		
		txtfrepTlfM = new JTextField();
		txtfrepTlfM.setEnabled(false);
		txtfrepTlfM.setColumns(10);
		
		JLabel label_21 = new JLabel("Fax");
		label_21.setEnabled(false);
		
		txtfrepFax = new JTextField();
		txtfrepFax.setEnabled(false);
		txtfrepFax.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setEnabled(false);
		
		txtfrepEmail = new JTextField();
		txtfrepEmail.setEnabled(false);
		txtfrepEmail.setColumns(10);
		GroupLayout gl_PanelRepAux = new GroupLayout(PanelRepAux);
		gl_PanelRepAux.setHorizontalGroup(
			gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelRepAux.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(147)
							.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_14)
								.addComponent(label_13)
								.addComponent(label_12)
								.addComponent(label_15)
								.addComponent(label_16))
							.addGap(18)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
								.addComponent(txtfrepDocumentoIdentidad, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfrepDireccion, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfrepApellidos, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfrepNombre, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfrepMunicipio, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_21)
								.addComponent(label_18)
								.addComponent(label_20)
								.addComponent(label_19)
								.addComponent(lblEmail))
							.addGap(47)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtfrepFax, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
								.addComponent(txtfrepTlfM, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
								.addComponent(txtfrepTlfF, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
								.addComponent(txtfrepCP, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
								.addComponent(txtfrepEmail))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_PanelRepAux.setVerticalGroup(
			gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelRepAux.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_PanelRepAux.createSequentialGroup()
								.addGap(7)
								.addComponent(label_12))
							.addGroup(gl_PanelRepAux.createSequentialGroup()
								.addGap(6)
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_18)
									.addComponent(txtfrepCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addComponent(txtfrepNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(4)
							.addComponent(label_13))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_19)
								.addComponent(txtfrepApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(txtfrepTlfF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_14)
								.addComponent(txtfrepDocumentoIdentidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_20))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_21)
								.addComponent(txtfrepDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_15)))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtfrepTlfM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtfrepFax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtfrepMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblEmail))
								.addComponent(label_16)))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtfrepEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		PanelRepAux.setLayout(gl_PanelRepAux);

		

		
		PanelActividadAux_1 = new JPanel();
		PanelActividadAux_1.setBounds(0, 0, 939, 310);
		contentPane.add(PanelActividadAux_1);
		
		JLabel label_36 = new JLabel("ACTIVIDAD");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_35 = new JLabel("Tipo de suelo");
		
		comboBoxActTipoSuelo = new JComboBox();
		comboBoxActTipoSuelo.setModel(new DefaultComboBoxModel(new String[] {"Urbano ", "Rustico"}));
		comboBoxActTipoSuelo.setEditable(true);
		
		JLabel label_27 = new JLabel("Justificante de pago");
		
		checkActFotoJustificantePago = new JCheckBox("");
		
		JLabel label_26 = new JLabel("Certificado colegio oficial");
		
		checkActCertColegioOficial = new JCheckBox("");
		
		JLabel label_37 = new JLabel("Referencia catastral");
		
		txtfActReferenciaCatastral = new JTextField();
		txtfActReferenciaCatastral.setColumns(10);
		
		JLabel label_34 = new JLabel("Escritura");
		
		checkActFotoEscritura = new JCheckBox("");
		
		JLabel label_25 = new JLabel("Certificado Modelo 1");
		
		checkActCertModelo1 = new JCheckBox("");
		
		JLabel label_43 = new JLabel("Local");
		
		txtfActLocal = new JTextField();
		txtfActLocal.setColumns(10);
		
		JLabel label_33 = new JLabel("Modelo 36");
		
		checkActFotoModelo036 = new JCheckBox("");
		
		JLabel label_24 = new JLabel("Certificado Modelo 2");
		
		checkActCertModelo2 = new JCheckBox("");
		
		JLabel label_42 = new JLabel("Tipo");
		
		txtfActTipo = new JTextField();
		txtfActTipo.setColumns(10);
		
		JLabel label_32 = new JLabel("Planos");
		
		checkActFotoPlanos = new JCheckBox("");
		
		JLabel label_23 = new JLabel("Licencia obra");
		
		checkActFotoLicenciaObra = new JCheckBox("");
		
		JLabel label_41 = new JLabel("Emplazamiento");
		
		txtfActEmplazamiento = new JTextField();
		txtfActEmplazamiento.setColumns(10);
		
		JLabel label_31 = new JLabel("CD");
		
		checkActFotoCD = new JCheckBox("");
		
		JLabel label_22 = new JLabel("Otras autorizaciones");
		
		checkActFotoOtrasAutorizaciones = new JCheckBox("");
		
		JLabel label_40 = new JLabel("Fecha inicio");
		
		txtfDCFechaInicio = new JDateChooser();
		
		JLabel label_30 = new JLabel("Memoria");
		
		checkActFotoMemoria = new JCheckBox("");
		
		JLabel label = new JLabel("Descripcion");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label_39 = new JLabel("Fecha Solicitud");
		
		txtfDCFechaSolicitud = new JDateChooser();
		
		JLabel label_29 = new JLabel("Fotografia");
		
		checkActFotoFofografia = new JCheckBox("");
		
		JLabel label_38 = new JLabel("Cuota");
		
		txtActCuota = new JTextField();
		txtActCuota.setColumns(10);
		
		JLabel label_28 = new JLabel("Fotocopia DNI");
		
		checkActFotocopiaDni = new JCheckBox("");
		
		lblEstado = new JLabel("Estado");
		
		comboBoxActEstado = new JComboBox();
		comboBoxActEstado.setModel(new DefaultComboBoxModel(new String[] {"Procesando", "Aceptada", "Archivada"}));
		GroupLayout gl_PanelActividadAux_1 = new GroupLayout(PanelActividadAux_1);
		gl_PanelActividadAux_1.setHorizontalGroup(
			gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(txtfActReferenciaCatastral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(104)
									.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(checkActFotoEscritura))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(comboBoxActTipoSuelo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addGap(80)
									.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(checkActFotoJustificantePago)))
							.addGap(119)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_25, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_26, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
							.addGap(5)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(checkActCertColegioOficial)
								.addComponent(checkActCertModelo1)))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(txtfActLocal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(104)
									.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(checkActFotoModelo036))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(txtfActTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(104)
									.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addGap(67)
									.addComponent(checkActFotoPlanos))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(txtfActEmplazamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(104)
									.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
									.addGap(37)
									.addComponent(checkActFotoCD))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
									.addGap(5)
									.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtfDCFechaInicio, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
										.addComponent(txtfDCFechaSolicitud, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
										.addComponent(txtActCuota, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
										.addComponent(comboBoxActEstado, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(80)
									.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_30)
										.addComponent(label_29)
										.addComponent(label_28))
									.addGap(57)
									.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
										.addComponent(checkActFotoMemoria)
										.addComponent(checkActFotoFofografia)
										.addComponent(checkActFotocopiaDni))))
							.addGap(119)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(checkActFotoOtrasAutorizaciones))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(label_23, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_24, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(checkActCertModelo2)
										.addComponent(checkActFotoLicenciaObra)))))
						.addComponent(lblEstado))
					.addGap(84))
		);
		gl_PanelActividadAux_1.setVerticalGroup(
			gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_36)
							.addGap(5)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(4)
									.addComponent(label_35))
								.addComponent(comboBoxActTipoSuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(4)
									.addComponent(label_27))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(2)
									.addComponent(checkActFotoJustificantePago))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(2)
									.addComponent(checkActCertColegioOficial))))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(36)
							.addComponent(label_26)))
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_37))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(1)
									.addComponent(txtfActReferenciaCatastral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_34)
								.addComponent(checkActFotoEscritura)
								.addComponent(checkActCertModelo1)))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(9)
							.addComponent(label_25)))
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_43))
								.addComponent(txtfActLocal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_33))
								.addComponent(checkActFotoModelo036)
								.addComponent(checkActCertModelo2)))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(8)
							.addComponent(label_24)))
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_42))
								.addComponent(txtfActTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_32))
								.addComponent(checkActFotoPlanos)
								.addComponent(checkActFotoLicenciaObra)))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(8)
							.addComponent(label_23)))
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_41))
								.addComponent(txtfActEmplazamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_31))
								.addComponent(checkActFotoCD)
								.addComponent(checkActFotoOtrasAutorizaciones)))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(12)
							.addComponent(label_22)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_40)
							.addGap(12)
							.addComponent(label_39)
							.addGap(17)
							.addComponent(label_38))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(txtfDCFechaInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(txtfDCFechaSolicitud, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtActCuota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_30)
							.addGap(12)
							.addComponent(label_29)
							.addGap(17)
							.addComponent(label_28))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(checkActFotoMemoria)
							.addGap(5)
							.addComponent(checkActFotoFofografia)
							.addGap(5)
							.addComponent(checkActFotocopiaDni))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEstado)
						.addComponent(comboBoxActEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		
		txtPActDescripcion = new JTextPane();
		scrollPane.setViewportView(txtPActDescripcion);
		PanelActividadAux_1.setLayout(gl_PanelActividadAux_1);
		
	
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
			java.util.Date fechaDate = formato.parse(modelo2.ActFechaInicio);
			txtfDCFechaInicio.setDate(fechaDate);
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
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		String date = fmt.format(this.txtfDCFechaInicio.getDate());
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
		
		
		
	}

	public void deshabilitarRepresentante() {
		System.out.println("deshabilita");


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
