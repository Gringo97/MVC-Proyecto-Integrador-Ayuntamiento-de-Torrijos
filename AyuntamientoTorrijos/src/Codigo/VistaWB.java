package Codigo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import com.toedter.calendar.JDateChooser;

import javafx.scene.control.TableColumn;

import com.toedter.calendar.JCalendar;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class VistaWB extends JFrame implements Vista {
	private ModeloWB modelo;
	private ControladorWB controlador;
	private ModeloBBDD modelo2;

	private Container contenedor;
	private JPanel contentPane;
	private JPanel ArrVistas[];
	private JTextField txtfRazonSocialBusquedaPJ;
	private JTextField NIFBusquedaPJ;
	private JTextField txtfActBusqueda;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField txtfLocal;
	private JTextField txtfTipo;
	private JTextField txtfCuota;
	private JTextField txtfReferenciaCatastral;
	private JTextField txtfEmplazamiento;

	private JTable table;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JDateChooser FechaInicialActBusqueda;
	private JDateChooser FechaFinalActBusqueda;
	private JButton btnConfiguracion;
	private JLabel lblRutaDeAcceso;
	private JTextField txtfNombreR;
	private JTextField txtfApellidosR;
	private JTextField txtfDocumentoIdentidadR;
	private JTextField txtfDireccionR;
	private JTextField txtfMuncipioR;
	private JTextField txtfCPR;
	private JTextField txtfEmailR;
	private JTextField txtfFaxR;
	private JTextField txtfMovilR;
	private JTextField txtfFijo;
	private JTextField txtfNombreI;
	private JTextField txtfApellidosI;
	private JTextField txtfMunicipio;
	private JTextField txtfCIFI;
	private JTextField txtfDireccionI;
	private JTextField txtfCDI;
	private JTextField txtfEmailI;
	private JTextField txtfFaxI;
	private JTextField txtfMovilI;
	private JTextField txtfFijoI;
	private JCheckBox checkRepresentante;
	private JCheckBox chckbxFotocopiaDNI;
	private JCheckBox chckFotocopiaLicenciaObra;
	private JCheckBox chckJustificantePago;
	private JCheckBox chckFotocopiaEscritura;
	private JCheckBox chckPlanos;
	private JCheckBox chckCD;
	private JCheckBox chckMemoria;
	private JCheckBox chckFotocopiaModelo36;
	private JCheckBox chckFotografia;
	private JCheckBox chckbxCertificado1;
	private JCheckBox chckbxCertificado2;
	private JDateChooser DCFechaInicio;
	private JDateChooser DCFechaSolicitud;
	private JComboBox comboBoxTipoSuelo;
	private JTextPane txtDescripcion;
	private JCheckBox chckCertificadoColegio;
	private JCheckBox chckOtrasAuto;
	private JButton btnCancelarInsActv;
	private JButton btnActualizar2;

	public void setControlador(Controlador controlador) {

		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {
		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloWB) modelo;
	}

	public void setModelo2(Modelo modelo2) {
		this.modelo2 = (ModeloBBDD) modelo2;
	}

	public void adirArr() {
		controlador.setPanels(ArrVistas);
	}

	/**
	 * Create the frame.
	 */
	public VistaWB() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaWB.class.getResource("/Codigo/logo50x50.png")));
		setResizable(false);
		this.ArrVistas = new JPanel[3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnInscribirActividad = new JButton("Solicitud actividad");
		JButton btnVisualizarLicencias = new JButton("Visualizar Licencias");

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");

		tabbedPane.setVisible(true);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Personas", null, panel_3, null);// BUSCAR PERSONA

		JLabel lblRazonSocial = new JLabel("Nombre:");

		txtfRazonSocialBusquedaPJ = new JTextField();
		txtfRazonSocialBusquedaPJ.setColumns(10);

		JLabel label = new JLabel("NIF/NIE:");

		NIFBusquedaPJ = new JTextField();
		NIFBusquedaPJ.setColumns(10);

		JButton BuscarPJ = new JButton("Buscar");

		JButton btnRefresh = new JButton("Actualizar");
		btnRefresh.setVisible(false);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.refrescar();
			}
		});
		btnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(BuscarPJ, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
						.addComponent(btnRefresh, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblRazonSocial, GroupLayout.PREFERRED_SIZE, 79,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfRazonSocialBusquedaPJ)
								.addComponent(NIFBusquedaPJ, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
				.addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(7)
						.addComponent(lblRazonSocial, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGap(2)
						.addComponent(txtfRazonSocialBusquedaPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(NIFBusquedaPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(BuscarPJ, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);

		BuscarPJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.busquedaPersonaJur();
			}
		});

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Actividades", null, panel_1, null);// bUSCAR
																// ACTIVIDADES

		JButton btnBuscarLicencia = new JButton("Buscar");

		JLabel lblTipo = new JLabel("Tipo");

		FechaInicialActBusqueda = new JDateChooser();

		FechaFinalActBusqueda = new JDateChooser();

		JLabel lblDesdeActBusqueda = new JLabel("Fecha Solicitud:");

		JLabel lblHastaActBusqueda = new JLabel("Fecha Inicio:");

		txtfActBusqueda = new JTextField();
		txtfActBusqueda.setColumns(10);

		btnActualizar2 = new JButton("Actualizar");
		btnActualizar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.refrescar();
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addGroup(gl_panel_1
								.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
										.createSequentialGroup().addGroup(gl_panel_1
												.createParallelGroup(Alignment.LEADING).addComponent(lblTipo,
														GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtfActBusqueda, GroupLayout.PREFERRED_SIZE, 216,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_panel_1.createSequentialGroup()
														.addComponent(lblDesdeActBusqueda, GroupLayout.PREFERRED_SIZE,
																103, GroupLayout.PREFERRED_SIZE)
														.addGap(10).addComponent(lblHastaActBusqueda)))
										.addGap(10))
								.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(FechaFinalActBusqueda, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
										.addComponent(FechaInicialActBusqueda, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(
										gl_panel_1.createSequentialGroup()
												.addComponent(btnBuscarLicencia, GroupLayout.DEFAULT_SIZE, 216,
														Short.MAX_VALUE)
												.addContainerGap())
								.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(btnActualizar2, GroupLayout.PREFERRED_SIZE, 216,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(11).addComponent(lblTipo).addGap(6)
						.addComponent(txtfActBusqueda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(26)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(lblDesdeActBusqueda)
								.addComponent(lblHastaActBusqueda))
						.addGap(11)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(FechaInicialActBusqueda, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(FechaFinalActBusqueda, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(btnBuscarLicencia).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnActualizar2).addContainerGap(36, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ventanaConfiguracion();
			}
		});
		btnConfiguracion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(VistaWB.class.getResource("/Codigo/Ayto.png")));

		JPanel Contenedor = new JPanel();
		Contenedor.setLayout(new CardLayout(0, 0));

		JPanel inscActvPers = new JPanel();
		inscActvPers.setBackground(SystemColor.menu);
		Contenedor.add(inscActvPers, "name_25046820143722");
		inscActvPers.setVisible(false);
		ArrVistas[1] = inscActvPers;
		inscActvPers.setLayout(null);

		JButton btnAceptarInsPers = new JButton("Aceptar");

		btnAceptarInsPers.setBounds(10, 605, 89, 23);
		inscActvPers.add(btnAceptarInsPers);

		JButton btnCancelarInsPers = new JButton("Cancelar");
		btnCancelarInsPers.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				vaciarAct();
			}
		});

		btnCancelarInsPers.setBounds(566, 605, 89, 23);
		inscActvPers.add(btnCancelarInsPers);

		JPanel Panelrepresentante = new JPanel();
		Panelrepresentante.setBounds(314, 0, 351, 594);
		inscActvPers.add(Panelrepresentante);

		JLabel label_1 = new JLabel("Representante");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel label_3 = new JLabel("Nombre");
		label_3.setEnabled(false);

		txtfNombreR = new JTextField();
		txtfNombreR.setEnabled(false);
		txtfNombreR.setColumns(10);

		JLabel label_4 = new JLabel("Apellidos");
		label_4.setEnabled(false);

		txtfApellidosR = new JTextField();
		txtfApellidosR.setEnabled(false);
		txtfApellidosR.setColumns(10);

		JLabel label_5 = new JLabel("Documento de identidad");
		label_5.setEnabled(false);

		txtfDocumentoIdentidadR = new JTextField();
		txtfDocumentoIdentidadR.setEnabled(false);
		txtfDocumentoIdentidadR.setColumns(10);

		JLabel label_7 = new JLabel("Direccion");
		label_7.setEnabled(false);

		txtfDireccionR = new JTextField();
		txtfDireccionR.setEnabled(false);
		txtfDireccionR.setColumns(10);

		JLabel label_8 = new JLabel("Municipio");
		label_8.setEnabled(false);

		txtfMuncipioR = new JTextField();
		txtfMuncipioR.setEnabled(false);
		txtfMuncipioR.setColumns(10);

		JLabel label_9 = new JLabel("Codigo postal");
		label_9.setEnabled(false);

		txtfCPR = new JTextField();
		txtfCPR.setEnabled(false);
		txtfCPR.setColumns(10);

		JLabel label_10 = new JLabel("Email representante");
		label_10.setEnabled(false);

		txtfEmailR = new JTextField();
		txtfEmailR.setEnabled(false);
		txtfEmailR.setColumns(10);

		JLabel label_11 = new JLabel("Fax representante");
		label_11.setEnabled(false);

		txtfFaxR = new JTextField();
		txtfFaxR.setEnabled(false);
		txtfFaxR.setColumns(10);

		JLabel label_12 = new JLabel("Telefono movil");
		label_12.setEnabled(false);

		txtfMovilR = new JTextField();
		txtfMovilR.setEnabled(false);
		txtfMovilR.setColumns(10);

		txtfFijo = new JTextField();
		txtfFijo.setEnabled(false);
		txtfFijo.setColumns(10);

		JLabel label_13 = new JLabel("Telefono fijo");
		label_13.setEnabled(false);
		GroupLayout gl_Panelrepresentante = new GroupLayout(Panelrepresentante);
		gl_Panelrepresentante.setHorizontalGroup(gl_Panelrepresentante.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Panelrepresentante.createSequentialGroup().addContainerGap(70, Short.MAX_VALUE)
						.addGroup(gl_Panelrepresentante.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Panelrepresentante.createSequentialGroup().addGap(41).addComponent(label_1,
										GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfNombreR, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfApellidosR, GroupLayout.PREFERRED_SIZE, 180,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfDocumentoIdentidadR, GroupLayout.PREFERRED_SIZE, 180,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfDireccionR, GroupLayout.PREFERRED_SIZE, 180,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfMuncipioR, GroupLayout.PREFERRED_SIZE, 180,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfCPR, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfEmailR, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfFaxR, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Panelrepresentante.createSequentialGroup()
										.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 84,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10).addComponent(label_13, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Panelrepresentante.createSequentialGroup()
										.addComponent(txtfMovilR, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE)
										.addGap(8).addComponent(txtfFijo, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(97)));
		gl_Panelrepresentante.setVerticalGroup(gl_Panelrepresentante.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panelrepresentante.createSequentialGroup().addContainerGap()
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_3).addGap(11)
						.addComponent(txtfNombreR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_4).addGap(11)
						.addComponent(txtfApellidosR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_5).addGap(11)
						.addComponent(txtfDocumentoIdentidadR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_7).addGap(11)
						.addComponent(txtfDireccionR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_8).addGap(11)
						.addComponent(txtfMuncipioR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_9).addGap(11)
						.addComponent(txtfCPR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_10).addGap(11)
						.addComponent(txtfEmailR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_11).addGap(10)
						.addComponent(txtfFaxR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addGroup(gl_Panelrepresentante.createParallelGroup(Alignment.LEADING).addComponent(label_12)
								.addComponent(label_13))
						.addGap(11)
						.addGroup(gl_Panelrepresentante.createParallelGroup(Alignment.LEADING)
								.addComponent(txtfMovilR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfFijo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(65, Short.MAX_VALUE)));
		Panelrepresentante.setLayout(gl_Panelrepresentante);

		JPanel PanelInteresado = new JPanel();
		PanelInteresado.setBounds(0, 0, 316, 594);
		inscActvPers.add(PanelInteresado);

		JLabel label_2 = new JLabel("Interesado");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel label_14 = new JLabel("Nombre");

		txtfNombreI = new JTextField();
		txtfNombreI.setColumns(10);

		JLabel label_15 = new JLabel("Apellidos");

		txtfApellidosI = new JTextField();
		txtfApellidosI.setColumns(10);

		JLabel lblMunicipio = new JLabel("Municipio");

		txtfMunicipio = new JTextField();
		txtfMunicipio.setColumns(10);

		JLabel label_17 = new JLabel("CIF");

		txtfCIFI = new JTextField();
		txtfCIFI.setColumns(10);

		JLabel label_18 = new JLabel("Direccion");

		txtfDireccionI = new JTextField();
		txtfDireccionI.setColumns(10);

		JLabel label_19 = new JLabel("Codigo postal");

		txtfCDI = new JTextField();
		txtfCDI.setColumns(10);

		JLabel label_20 = new JLabel("Email interesado");

		txtfEmailI = new JTextField();
		txtfEmailI.setColumns(10);

		JLabel label_21 = new JLabel("Fax interesado");

		txtfFaxI = new JTextField();
		txtfFaxI.setColumns(10);

		JLabel label_22 = new JLabel("Telefono movil");

		JLabel label_23 = new JLabel("Telefono fijo");

		txtfMovilI = new JTextField();
		txtfMovilI.setColumns(10);

		txtfFijoI = new JTextField();
		txtfFijoI.setColumns(10);

		checkRepresentante = new JCheckBox("Representante Juridico");
		checkRepresentante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkRepresentante.isSelected()) {
					controlador.ActivarRepre(Panelrepresentante, true);
				} else {
					controlador.ActivarRepre(Panelrepresentante, false);
				}
			}
		});
		GroupLayout gl_PanelInteresado = new GroupLayout(PanelInteresado);
		gl_PanelInteresado.setHorizontalGroup(gl_PanelInteresado.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PanelInteresado.createSequentialGroup().addContainerGap(67, Short.MAX_VALUE)
						.addGroup(gl_PanelInteresado.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(48).addComponent(label_2,
										GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(label_14,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(txtfNombreI,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(label_15,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(
										txtfApellidosI, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(
										lblMunicipio, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(
										txtfMunicipio, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(label_17,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(txtfCIFI,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(label_18,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(
										txtfDireccionI, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(label_19,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(txtfCDI,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(txtfEmailI,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(label_21,
										GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2).addComponent(txtfFaxI,
										GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2)
										.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 84,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10).addComponent(label_23, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresado.createSequentialGroup().addGap(2)
										.addGroup(gl_PanelInteresado.createParallelGroup(Alignment.LEADING)
												.addComponent(checkRepresentante)
												.addGroup(gl_PanelInteresado.createSequentialGroup()
														.addComponent(txtfMovilI, GroupLayout.PREFERRED_SIZE, 86,
																GroupLayout.PREFERRED_SIZE)
														.addGap(8).addComponent(txtfFijoI, GroupLayout.PREFERRED_SIZE,
																86, GroupLayout.PREFERRED_SIZE)))))
						.addGap(65)));
		gl_PanelInteresado.setVerticalGroup(gl_PanelInteresado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelInteresado.createSequentialGroup().addContainerGap().addComponent(label_2).addGap(11)
						.addComponent(label_14).addGap(11)
						.addComponent(txtfNombreI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_15).addGap(11)
						.addComponent(txtfApellidosI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(lblMunicipio).addGap(11)
						.addComponent(txtfMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_17).addGap(11)
						.addComponent(txtfCIFI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_18).addGap(11)
						.addComponent(txtfDireccionI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_19).addGap(11)
						.addComponent(txtfCDI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_20).addGap(11)
						.addComponent(txtfEmailI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(label_21).addGap(7)
						.addComponent(txtfFaxI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(14)
						.addGroup(gl_PanelInteresado.createParallelGroup(Alignment.LEADING).addComponent(label_22)
								.addComponent(label_23))
						.addGap(11)
						.addGroup(gl_PanelInteresado.createParallelGroup(Alignment.LEADING)
								.addComponent(txtfMovilI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfFijoI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(checkRepresentante, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(31, Short.MAX_VALUE)));
		PanelInteresado.setLayout(gl_PanelInteresado);

		JPanel VisualizarLicencias = new JPanel();
		Contenedor.add(VisualizarLicencias, "name_30680022169608");
		ArrVistas[0] = VisualizarLicencias;
		VisualizarLicencias.setVisible(true);

		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_VisualizarLicencias = new GroupLayout(VisualizarLicencias);
		gl_VisualizarLicencias.setHorizontalGroup(
				gl_VisualizarLicencias.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						gl_VisualizarLicencias.createSequentialGroup()
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 660, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_VisualizarLicencias.setVerticalGroup(gl_VisualizarLicencias.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_VisualizarLicencias.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(52, Short.MAX_VALUE)));

		table = new JTable() {
			private static final long serialVersionUID = 9082642090247275215L;

			public boolean isCellEditable(int row, int column) {
				return false;// you can set which column/row can be edited.
			}
		};
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NºRegistro", "Nombre", "Apellido", "Licencia", "CIF" }));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int selectedRowIndex = table.getSelectedRow();

					controlador.nuevaPantalla();
					controlador.recogerRegistroCambio();

				}
			}
		});

		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		scrollPane_1.setViewportView(table);
		VisualizarLicencias.setLayout(gl_VisualizarLicencias);

		JPanel inscActv = new JPanel();
		ArrVistas[2] = inscActv;
		Contenedor.add(inscActv, "name_29022094463246");

		JLabel lblNewLabel = new JLabel("Fotocopia de licencia de obra");
		lblNewLabel.setBounds(37, 38, 151, 14);

		JLabel lblNewLabel_1 = new JLabel("Justificante de pago");
		lblNewLabel_1.setBounds(37, 79, 139, 14);

		JLabel lblNewLabel_2 = new JLabel("Fotocopia de Escritura");
		lblNewLabel_2.setBounds(37, 120, 139, 14);

		JLabel lblNewLabel_3 = new JLabel("Fotocopia de modelo 36");
		lblNewLabel_3.setBounds(37, 161, 139, 14);

		JLabel lblNewLabel_4 = new JLabel("Planos");
		lblNewLabel_4.setBounds(37, 202, 139, 14);

		JLabel lblNewLabel_5 = new JLabel("CD");
		lblNewLabel_5.setBounds(37, 243, 139, 14);

		JLabel lblNewLabel_6 = new JLabel("Memoria");
		lblNewLabel_6.setBounds(37, 284, 139, 14);

		JLabel lblNewLabel_7 = new JLabel("Fotograf\u00EDa");
		lblNewLabel_7.setBounds(37, 325, 139, 14);

		JLabel lblNewLabel_8 = new JLabel("Tipo de suelo");
		lblNewLabel_8.setBounds(334, 37, 124, 14);

		JLabel lblNewLabel_9 = new JLabel("Emplazamiento");
		lblNewLabel_9.setBounds(334, 303, 124, 14);

		JLabel lblNewLabel_10 = new JLabel("Fecha de inicio");
		lblNewLabel_10.setBounds(334, 116, 124, 14);

		JLabel lblNewLabel_11 = new JLabel("Fecha de solicitud");
		lblNewLabel_11.setBounds(334, 78, 124, 14);

		JLabel lblNewLabel_12 = new JLabel("Referencia catastral");
		lblNewLabel_12.setBounds(334, 265, 124, 14);

		JLabel lblNewLabel_13 = new JLabel("Local");
		lblNewLabel_13.setBounds(334, 151, 124, 14);

		JLabel lblNewLabel_14 = new JLabel("Tipo");
		lblNewLabel_14.setBounds(334, 189, 124, 14);

		JLabel lblNewLabel_15 = new JLabel("Cuota");
		lblNewLabel_15.setBounds(334, 227, 129, 14);

		JLabel lblNewLabel_16 = new JLabel("Descripci\u00F3n");
		lblNewLabel_16.setBounds(334, 338, 124, 14);

		JLabel lblNewLabel_17 = new JLabel("Certificado del Colegio Oficial");
		lblNewLabel_17.setBounds(37, 489, 166, 14);

		chckFotocopiaLicenciaObra = new JCheckBox("Entregado");
		chckFotocopiaLicenciaObra.setBounds(209, 34, 98, 23);

		chckJustificantePago = new JCheckBox("Entregado");
		chckJustificantePago.setBounds(209, 75, 98, 23);

		chckFotocopiaEscritura = new JCheckBox("Entregado");
		chckFotocopiaEscritura.setBounds(209, 116, 98, 23);

		chckFotocopiaModelo36 = new JCheckBox("Entregado");
		chckFotocopiaModelo36.setBounds(209, 157, 98, 23);

		chckPlanos = new JCheckBox("Entregado");
		chckPlanos.setBounds(209, 198, 98, 23);

		chckCD = new JCheckBox("Entregado");
		chckCD.setBounds(209, 239, 98, 23);

		chckMemoria = new JCheckBox("Entregado");
		chckMemoria.setBounds(209, 280, 98, 23);

		chckFotografia = new JCheckBox("Entregado");
		chckFotografia.setBounds(209, 321, 98, 23);

		chckCertificadoColegio = new JCheckBox("Entregado");
		chckCertificadoColegio.setBounds(209, 485, 98, 23);

		DCFechaSolicitud = new JDateChooser();
		DCFechaSolicitud.setBounds(473, 72, 146, 20);

		DCFechaInicio = new JDateChooser();
		DCFechaInicio.setBounds(473, 110, 146, 20);

		txtfLocal = new JTextField();
		txtfLocal.setBounds(473, 148, 146, 20);
		txtfLocal.setColumns(10);

		txtfTipo = new JTextField();
		txtfTipo.setBounds(473, 186, 146, 20);
		txtfTipo.setText("");
		txtfTipo.setColumns(10);

		txtfCuota = new JTextField();
		txtfCuota.setBounds(473, 224, 146, 20);
		txtfCuota.setText("");
		txtfCuota.setColumns(10);

		txtfReferenciaCatastral = new JTextField();
		txtfReferenciaCatastral.setBounds(473, 262, 146, 20);
		txtfReferenciaCatastral.setColumns(10);

		txtfEmplazamiento = new JTextField();
		txtfEmplazamiento.setBounds(473, 300, 146, 20);
		txtfEmplazamiento.setText("");
		txtfEmplazamiento.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(473, 338, 146, 61);

		JButton btnAceptarInsActv = new JButton("Aceptar");
		btnAceptarInsActv.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				if (checkRepresentante.isSelected()) {

					int idPer = controlador.insetarPersona();
					int idAct = controlador.inscribirActividad();
					int idRep = controlador.insertarRepresentante();
					controlador.inscribirTablaInter(idPer, idAct);
					controlador.inscribirtablaInter2(idPer, idRep);
					controlador.cambioPantalla(VisualizarLicencias);
					tabbedPane.setVisible(true);
					btnRefresh.setVisible(true);
					vaciarAct();

					controlador.refrescar();
				} else {
					int idPer = controlador.insetarPersona();
					int idAct = controlador.inscribirActividad();
					controlador.inscribirTablaInter(idPer, idAct);
					controlador.cambioPantalla(VisualizarLicencias);
					tabbedPane.setVisible(true);
					btnRefresh.setVisible(true);
					vaciarAct();
					controlador.refrescar();
				}

			}
		});
		btnAceptarInsActv.setBounds(10, 621, 90, 23);

		btnCancelarInsActv = new JButton("Cancelar");
		btnCancelarInsActv.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				vaciarAct();
				controlador.cambioPantalla(inscActvPers);
				tabbedPane.setVisible(false);
				btnRefresh.setVisible(false);
			}
		});
		btnCancelarInsActv.setBounds(560, 621, 95, 23);

		comboBoxTipoSuelo = new JComboBox();
		comboBoxTipoSuelo.setBounds(473, 34, 74, 20);
		comboBoxTipoSuelo.setModel(new DefaultComboBoxModel(new String[] { "Urbano", "Rústico" }));

		JLabel lblNewLabel_18 = new JLabel("Fotocopia DNI/CIF/NIE");
		lblNewLabel_18.setBounds(37, 366, 139, 14);

		chckbxFotocopiaDNI = new JCheckBox("Entregado");
		chckbxFotocopiaDNI.setBounds(209, 362, 98, 23);

		JLabel lblCertificado = new JLabel("Certificado 1");
		lblCertificado.setBounds(37, 407, 139, 14);

		chckbxCertificado1 = new JCheckBox("Entregado");
		chckbxCertificado1.setBounds(209, 403, 98, 23);

		JLabel lblCertificado_1 = new JLabel("Certificado2");
		lblCertificado_1.setBounds(37, 453, 139, 14);

		chckbxCertificado2 = new JCheckBox("Entregado");
		chckbxCertificado2.setBounds(209, 449, 98, 23);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(313, 0, 2, 573);
		separator_1.setOrientation(SwingConstants.VERTICAL);

		txtDescripcion = new JTextPane();
		scrollPane.setViewportView(txtDescripcion);
		inscActv.setLayout(null);
		inscActv.add(lblNewLabel_17);
		inscActv.add(chckCertificadoColegio);
		inscActv.add(lblNewLabel);
		inscActv.add(lblNewLabel_1);
		inscActv.add(lblNewLabel_2);
		inscActv.add(lblNewLabel_3);
		inscActv.add(lblNewLabel_4);
		inscActv.add(lblNewLabel_5);
		inscActv.add(lblNewLabel_6);
		inscActv.add(lblNewLabel_7);
		inscActv.add(lblNewLabel_18);
		inscActv.add(lblCertificado);
		inscActv.add(chckbxFotocopiaDNI);
		inscActv.add(chckFotocopiaLicenciaObra);
		inscActv.add(chckJustificantePago);
		inscActv.add(chckFotocopiaEscritura);
		inscActv.add(chckPlanos);
		inscActv.add(chckCD);
		inscActv.add(chckMemoria);
		inscActv.add(chckFotocopiaModelo36);
		inscActv.add(chckFotografia);
		inscActv.add(chckbxCertificado1);
		inscActv.add(lblCertificado_1);
		inscActv.add(chckbxCertificado2);
		inscActv.add(separator_1);
		inscActv.add(lblNewLabel_11);
		inscActv.add(lblNewLabel_8);
		inscActv.add(lblNewLabel_10);
		inscActv.add(lblNewLabel_13);
		inscActv.add(lblNewLabel_14);
		inscActv.add(lblNewLabel_15);
		inscActv.add(lblNewLabel_12);
		inscActv.add(lblNewLabel_9);
		inscActv.add(lblNewLabel_16);
		inscActv.add(btnCancelarInsActv);
		inscActv.add(txtfLocal);
		inscActv.add(txtfTipo);
		inscActv.add(txtfCuota);
		inscActv.add(txtfReferenciaCatastral);
		inscActv.add(txtfEmplazamiento);
		inscActv.add(DCFechaInicio);
		inscActv.add(DCFechaSolicitud);
		inscActv.add(btnAceptarInsActv);
		inscActv.add(scrollPane);
		inscActv.add(comboBoxTipoSuelo);

		JLabel lblOtrasAutorizaciones = new JLabel("Otras autorizaciones");
		lblOtrasAutorizaciones.setBounds(37, 519, 139, 14);
		inscActv.add(lblOtrasAutorizaciones);

		chckOtrasAuto = new JCheckBox("Entregado");
		chckOtrasAuto.setBounds(209, 515, 98, 23);
		inscActv.add(chckOtrasAuto);
		btnAceptarInsPers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRutaDeAcceso.setText("Inscribir Actividad");

				controlador.cambioPantalla(inscActv);
				tabbedPane.setVisible(false);
				btnRefresh.setVisible(false);
			}
		});

		lblRutaDeAcceso = new JLabel("");
		lblRutaDeAcceso.setHorizontalAlignment(SwingConstants.CENTER);
		lblRutaDeAcceso.setText("Inscribir Licencia de Actividad");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnVisualizarLicencias, 0, 0, Short.MAX_VALUE)
								.addComponent(btnInscribirActividad, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(32).addComponent(label_6,
										GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnConfiguracion))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRutaDeAcceso, GroupLayout.PREFERRED_SIZE, 665,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(Contenedor, GroupLayout.PREFERRED_SIZE, 665, GroupLayout.PREFERRED_SIZE))
						.addGap(6)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(lblRutaDeAcceso, GroupLayout.PREFERRED_SIZE, 25,
								GroupLayout.PREFERRED_SIZE)
						.addGap(17)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(Contenedor, GroupLayout.PREFERRED_SIZE, 655,
												GroupLayout.PREFERRED_SIZE)
										.addGap(35))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 178,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnVisualizarLicencias, GroupLayout.PREFERRED_SIZE, 44,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnInscribirActividad, GroupLayout.PREFERRED_SIZE, 44,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 261,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnConfiguracion).addGap(56)))));

		contentPane.setLayout(gl_contentPane);
		btnInscribirActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRutaDeAcceso.setText("Inscribir Actividad");
				controlador.cambioPantalla(inscActvPers);
				tabbedPane.setVisible(false);
				btnRefresh.setVisible(false);
			}
		});
		btnVisualizarLicencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRutaDeAcceso.setText("Visualizar Licencias");
				controlador.cambioPantalla(VisualizarLicencias);
				tabbedPane.setVisible(true);
				btnRefresh.setVisible(true);
			}
		});

	}

	public String getTxtfLocal() {
		return txtfLocal.getText();
	}

	public void setTxtfLocal(JTextField txtfLocal) {
		this.txtfLocal = txtfLocal;
	}

	public String getTxtfTipo() {
		return txtfTipo.getText();
	}

	public void setTxtfTipo(JTextField txtfTipo) {
		this.txtfTipo = txtfTipo;
	}

	public String getTxtfCuota() {
		return txtfCuota.getText();
	}

	public void setTxtfCuota(JTextField txtfCuota) {
		this.txtfCuota = txtfCuota;
	}

	public String getTxtfReferenciaCatastral() {
		return txtfReferenciaCatastral.getText();
	}

	public void setTxtfReferenciaCatastral(JTextField txtfReferenciaCatastral) {
		this.txtfReferenciaCatastral = txtfReferenciaCatastral;
	}

	public String getTxtfEmplazamiento() {
		return txtfEmplazamiento.getText();
	}

	public void setTxtfEmplazamiento(JTextField txtfEmplazamiento) {
		this.txtfEmplazamiento = txtfEmplazamiento;
	}

	public String getTxtfNombreR() {
		return txtfNombreR.getText();
	}

	public void setTxtfNombreR(JTextField txtfNombreR) {
		this.txtfNombreR = txtfNombreR;
	}

	public String getTxtfApellidosR() {
		return txtfApellidosR.getText();
	}

	public void setTxtfApellidosR(JTextField txtfApellidosR) {
		this.txtfApellidosR = txtfApellidosR;
	}

	public String getTxtfDocumentoIdentidadR() {
		return txtfDocumentoIdentidadR.getText();
	}

	public void setTxtfDocumentoIdentidadR(JTextField txtfDocumentoIdentidadR) {
		this.txtfDocumentoIdentidadR = txtfDocumentoIdentidadR;
	}

	public String getTxtfDireccionR() {
		return txtfDireccionR.getText();
	}

	public void setTxtfDireccionR(JTextField txtfDireccionR) {
		this.txtfDireccionR = txtfDireccionR;
	}

	public String getTxtfMuncipioR() {
		return txtfMuncipioR.getText();
	}

	public void setTxtfMuncipioR(JTextField txtfMuncipioR) {
		this.txtfMuncipioR = txtfMuncipioR;
	}

	public String getTxtfCDR() {
		return txtfCPR.getText();
	}

	public void setTxtfCDR(JTextField txtfCDR) {
		this.txtfCPR = txtfCDR;
	}

	public String getTxtfEmailR() {
		return txtfEmailR.getText();
	}

	public void setTxtfEmailR(JTextField txtfEmailR) {
		this.txtfEmailR = txtfEmailR;
	}

	public String getTxtfFaxR() {
		return txtfFaxR.getText();
	}

	public void setTxtfFaxR(JTextField txtfFaxR) {
		this.txtfFaxR = txtfFaxR;
	}

	public String getTxtfMovilR() {
		return txtfMovilR.getText();
	}

	public void setTxtfMovilR(JTextField txtfMovilR) {
		this.txtfMovilR = txtfMovilR;
	}

	public String getTxtfFijo() {
		return txtfFijo.getText();
	}

	public void setTxtfFijo(JTextField txtfFijo) {
		this.txtfFijo = txtfFijo;
	}

	public String getTxtfNombreI() {
		return txtfNombreI.getText();
	}

	public void setTxtfNombreI(JTextField txtfNombreI) {
		this.txtfNombreI = txtfNombreI;
	}

	public String getTxtfApellidosI() {
		return txtfApellidosI.getText();
	}

	public void setTxtfApellidosI(JTextField txtfApellidosI) {
		this.txtfApellidosI = txtfApellidosI;
	}

	public String getTxtfMunicipio() {
		return txtfMunicipio.getText();
	}

	public void setTxtfMunicipio(JTextField txtfMunicipio) {
		this.txtfMunicipio = txtfMunicipio;
	}

	public String getTxtfCIFI() {
		return txtfCIFI.getText();
	}

	public void setTxtfCIFI(JTextField txtfCIFI) {
		this.txtfCIFI = txtfCIFI;
	}

	public String getTxtfDireccionI() {
		return txtfDireccionI.getText();
	}

	public void setTxtfDireccionI(JTextField txtfDireccionI) {
		this.txtfDireccionI = txtfDireccionI;
	}

	public String getTxtfCDI() {
		return txtfCDI.getText();
	}

	public void setTxtfCDI(JTextField txtfCDI) {
		this.txtfCDI = txtfCDI;
	}

	public String getTxtfEmailI() {
		return txtfEmailI.getText();
	}

	public void setTxtfEmailI(JTextField txtfEmailI) {
		this.txtfEmailI = txtfEmailI;
	}

	public String getTxtfFaxI() {
		return txtfFaxI.getText();
	}

	public void setTxtfFaxI(JTextField txtfFaxI) {
		this.txtfFaxI = txtfFaxI;
	}

	public String getTxtfMovilI() {
		return txtfMovilI.getText();
	}

	public void setTxtfMovilI(JTextField txtfMovilI) {
		this.txtfMovilI = txtfMovilI;
	}

	public String getTxtfFijoI() {
		return txtfFijoI.getText();
	}

	public void setTxtfFijoI(JTextField txtfFijoI) {
		this.txtfFijoI = txtfFijoI;
	}

	public void setTxtfRazonSocialBusquedaPJ(JTextField txtfRazonSocialBusquedaPJ) {
		this.txtfRazonSocialBusquedaPJ = txtfRazonSocialBusquedaPJ;
	}

	public void clear_Table() {
		for (int i = 0; i < table.getRowCount(); i++) {
			DefaultTableModel dm = (DefaultTableModel) table.getModel();
			dm.removeRow(i);
			i -= 1;
		}
	}

	public String getTxtfRazonSocialBusquedaPJ() {
		return txtfRazonSocialBusquedaPJ.getText();
	}

	public String getNIFBusquedaPJ() {
		return NIFBusquedaPJ.getText();
	}

	public String getTxtfActBusqueda() {
		return txtfActBusqueda.getText();
	}

	public void RellenarTabla(Object[][] aaa) {
		Object[][] resultados = (Object[][]) aaa;
		table.setModel(new DefaultTableModel(resultados,
				new String[] { "NºRegistro", "Nombre", "Apellido", "Licencia", "CIF" }));
	}

	public void setDatosTabla() {
		Object[][] tabla = modelo2.getTabla();
		this.RellenarTabla(tabla);

	}

	public Boolean getchckJustificantePago() {
		if (chckJustificantePago.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckFotocopiaEscritura() {
		if (chckFotocopiaEscritura.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckFotocopiaModelo36() {
		if (chckFotocopiaModelo36.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckPlanos() {
		if (chckPlanos.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckCD() {
		if (chckCD.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckMemoria() {
		if (chckMemoria.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckFotografia() {
		if (chckFotografia.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckbxFotocopiaDNI() {
		if (chckbxFotocopiaDNI.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckbxCertificado1() {
		if (chckbxCertificado1.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckbxCertificado2() {
		if (chckbxCertificado2.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public String getComboBoxTipoSuelo() {
		return (String) comboBoxTipoSuelo.getSelectedItem();
	}

	public Boolean getchckCertificadoColegio() {
		if (chckCertificadoColegio.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean getchckFotocopiaLicenciaObra() {
		if (chckFotocopiaLicenciaObra.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean getchckOtrasAuto() {
		if (chckOtrasAuto.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public String getDCFechaSolicitud() {

		// System.out.println(as);

		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		String date = fmt.format(this.DCFechaSolicitud.getDate());
		return date;
	}

	public String getDCFechaInicio() {

		// System.out.println(as);

		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		String date = fmt.format(this.DCFechaInicio.getDate());

		// int str = (Integer) DCFechaInicio.getDate().getDay();
		// int str2 = (Integer) DCFechaInicio.getDate().getMonth() + 1;
		// int str3 = (Integer) DCFechaInicio.getDate().getYear() + 1900;
		// System.out.println(str + "-" + str2 + "-" + str3);
		// return str + "-" + str2 + "-" + str3;
		return date;
	}

	public String gettxtfDescripcion() {
		return txtDescripcion.getText();
	}

	public void vaciarAct() {
		// INTERESADO
		txtfNombreI.setText("");
		txtfApellidosI.setText("");
		txtfMunicipio.setText("");
		txtfCIFI.setText("");
		txtfDireccionI.setText("");
		txtfCDI.setText("");
		txtfEmailI.setText("");
		txtfFaxI.setText("");
		txtfMovilI.setText("");
		txtfFijoI.setText("");
		checkRepresentante.setSelected(false);
		// REPRESENTANTE
		txtfNombreR.setText("");
		txtfApellidosR.setText("");
		txtfDocumentoIdentidadR.setText("");
		txtfDireccionR.setText("");
		txtfMuncipioR.setText("");
		txtfCPR.setText("");
		txtfEmailR.setText("");
		txtfFaxR.setText("");
		txtfMovilR.setText("");
		txtfFijo.setText("");
		// ACTIVIDAD
		chckCertificadoColegio.setSelected(false);
		chckbxFotocopiaDNI.setSelected(false);
		chckFotocopiaLicenciaObra.setSelected(false);
		chckJustificantePago.setSelected(false);
		chckFotocopiaEscritura.setSelected(false);
		chckPlanos.setSelected(false);
		chckCD.setSelected(false);
		chckMemoria.setSelected(false);
		chckFotocopiaModelo36.setSelected(false);
		chckFotografia.setSelected(false);
		chckbxCertificado1.setSelected(false);
		chckbxCertificado2.setSelected(false);
		txtfLocal.setText("");
		txtfTipo.setText("");
		txtfCuota.setText("");
		txtfReferenciaCatastral.setText("");
		txtfEmplazamiento.setText("");
		DCFechaInicio.setDate(null);
		DCFechaSolicitud.setDate(null);
		txtDescripcion.setText("");
		chckOtrasAuto.setSelected(false);

	}

	public JTable getTabla() {
		return table;
	}

	public void setTabla(JTable table) {
		this.table = table;
	}

}
