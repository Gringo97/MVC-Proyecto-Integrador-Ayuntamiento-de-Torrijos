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

public class VistaAuxTabla extends JFrame {
	private ControladorWB controlador;
	private Modelo modelo;
	private Container contenedor;
	private JPanel contentPane;
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
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JCheckBox checkBoxrepresentanteAux;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_22;
	private JTextField textField_23;
	private JPanel PanelActividadAux;
	private JPanel PanelInteresadoAux;
	private JPanel PanelRepAux;
	private JPanel PanelActividadAux_1;

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
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(728, 499, 89, 23);
		contentPane.add(btnAceptar);
		
		PanelInteresadoAux = new JPanel();
		PanelInteresadoAux.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		PanelInteresadoAux.setBounds(0, 309, 465, 187);
		contentPane.add(PanelInteresadoAux);
		
		JLabel label_1 = new JLabel("INTERESADO");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("Nombre");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("Apellidos");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel label_4 = new JLabel("CIF");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel label_5 = new JLabel("Direccion");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel label_6 = new JLabel("Municipio");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel label_7 = new JLabel("Codigo postal");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel label_8 = new JLabel("Tlf Fijo");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel label_9 = new JLabel("Tlf Movil");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel label_10 = new JLabel("Fax");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JLabel label_11 = new JLabel("Email");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
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
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
							.addGap(67)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
									.addComponent(label_11)
									.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
									.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
											.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
												.addComponent(label_10)
												.addComponent(label_9))
											.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
											.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
										.addGroup(Alignment.LEADING, gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
												.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
												.addComponent(label_7)
												.addGap(18)
												.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
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
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
								.addComponent(label_8)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_9))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_5))
						.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
							.addComponent(label_10)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_PanelInteresadoAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6)))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_11))
						.addGroup(gl_PanelInteresadoAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		PanelInteresadoAux.setLayout(gl_PanelInteresadoAux);
		
		PanelRepAux = new JPanel();
		PanelRepAux.setBounds(459, 309, 484, 187);
		contentPane.add(PanelRepAux);
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		
		JLabel label_12 = new JLabel("Nombre");
		label_12.setEnabled(false);
		
		JLabel label_13 = new JLabel("Apellidos");
		label_13.setEnabled(false);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		
		JLabel label_14 = new JLabel("Documento Identidad");
		label_14.setEnabled(false);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		
		JLabel label_15 = new JLabel("Direccion");
		label_15.setEnabled(false);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		
		JLabel label_16 = new JLabel("Municipio");
		label_16.setEnabled(false);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		
		JLabel label_17 = new JLabel("REPRESENTANTE");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_18 = new JLabel("Codigo Postal");
		label_18.setEnabled(false);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		
		JLabel label_19 = new JLabel("Tlf Fijo");
		label_19.setEnabled(false);
		
		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		
		JLabel label_20 = new JLabel("Tlf Movil");
		label_20.setEnabled(false);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		
		JLabel label_21 = new JLabel("Fax");
		label_21.setEnabled(false);
		
		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
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
								.addGroup(gl_PanelRepAux.createSequentialGroup()
									.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
									.addGap(27)
									.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
										.addComponent(label_21)
										.addComponent(label_18)
										.addComponent(label_20)
										.addComponent(label_19))
									.addGap(57)
									.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
								.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
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
									.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_18))))
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(4)
							.addComponent(label_13))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_19)
								.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_14)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_20))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_21)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_15))
							.addGap(6))
						.addGroup(gl_PanelRepAux.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_PanelRepAux.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_16))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		PanelRepAux.setLayout(gl_PanelRepAux);
		
		checkBoxrepresentanteAux = new JCheckBox("Persona Jurídica");
		checkBoxrepresentanteAux.setBounds(10, 503, 104, 14);
		contentPane.add(checkBoxrepresentanteAux);
		checkBoxrepresentanteAux = new JCheckBox("");
		checkBoxrepresentanteAux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkBoxrepresentanteAux.isSelected()) {
					controlador.ActivarRepre(PanelRepAux, true);
} else {
					controlador.ActivarRepre(PanelRepAux, false);
}
			}
			});
		
		

		
		PanelActividadAux_1 = new JPanel();
		PanelActividadAux_1.setBounds(0, 0, 939, 310);
		contentPane.add(PanelActividadAux_1);
		
		JLabel label_36 = new JLabel("ACTIVIDAD");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_35 = new JLabel("Tipo de suelo");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		
		JLabel label_27 = new JLabel("Justificante de pago");
		
		JCheckBox checkBox_5 = new JCheckBox("");
		
		JLabel label_26 = new JLabel("Certificado colegio oficial");
		
		JCheckBox checkBox_4 = new JCheckBox("");
		
		JLabel label_37 = new JLabel("Referencia catastral");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_34 = new JLabel("Escritura");
		
		JCheckBox checkBox_6 = new JCheckBox("");
		
		JLabel label_25 = new JLabel("Certificado Modelo 1");
		
		JCheckBox checkBox_3 = new JCheckBox("");
		
		JLabel label_43 = new JLabel("Local");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_33 = new JLabel("Modelo 36");
		
		JCheckBox checkBox_7 = new JCheckBox("");
		
		JLabel label_24 = new JLabel("Certificado Modelo 2");
		
		JCheckBox checkBox_2 = new JCheckBox("");
		
		JLabel label_42 = new JLabel("Tipo");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_32 = new JLabel("Planos");
		
		JCheckBox checkBox_8 = new JCheckBox("");
		
		JLabel label_23 = new JLabel("Licencia obra");
		
		JCheckBox checkBox_1 = new JCheckBox("");
		
		JLabel label_41 = new JLabel("Emplazamiento");
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		JLabel label_31 = new JLabel("CD");
		
		JCheckBox checkBox_9 = new JCheckBox("");
		
		JLabel label_22 = new JLabel("Otras autorizaciones");
		
		JCheckBox checkBox = new JCheckBox("");
		
		JLabel label_40 = new JLabel("Fecha inicio");
		
		JDateChooser dateChooser = new JDateChooser();
		
		JLabel label_30 = new JLabel("Memoria");
		
		JCheckBox checkBox_10 = new JCheckBox("");
		
		JLabel label = new JLabel("Descripcion");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label_39 = new JLabel("Fecha Solicitud");
		
		JDateChooser dateChooser_1 = new JDateChooser();
		
		JLabel label_29 = new JLabel("Fotografia");
		
		JCheckBox checkBox_11 = new JCheckBox("");
		
		JLabel label_38 = new JLabel("Cuota");
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		JLabel label_28 = new JLabel("Fotocopia DNI");
		
		JCheckBox checkBox_12 = new JCheckBox("");
		GroupLayout gl_PanelActividadAux_1 = new GroupLayout(PanelActividadAux_1);
		gl_PanelActividadAux_1.setHorizontalGroup(
			gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
				.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(checkBox_6))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(80)
							.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(checkBox_5)))
					.addGap(119)
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label_25, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_26, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(5)
							.addComponent(checkBox_4))
						.addGroup(Alignment.TRAILING, gl_PanelActividadAux_1.createSequentialGroup()
							.addGap(5)
							.addComponent(checkBox_3))))
				.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(checkBox_7))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(checkBox_8))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(checkBox_9))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
							.addGap(80)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_30)
								.addComponent(label_29)
								.addComponent(label_28))
							.addGap(57)
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox_10)
								.addComponent(checkBox_11)
								.addComponent(checkBox_12))))
					.addGap(119)
					.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(checkBox))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_23, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_24, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
							.addGroup(gl_PanelActividadAux_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(checkBox_2))
								.addGroup(Alignment.TRAILING, gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(6)
									.addComponent(checkBox_1))))))
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
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(4)
									.addComponent(label_27))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(2)
									.addComponent(checkBox_5))
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(2)
									.addComponent(checkBox_4))))
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
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_34)
								.addComponent(checkBox_6)
								.addComponent(checkBox_3)))
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
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_33))
								.addComponent(checkBox_7)
								.addComponent(checkBox_2)))
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
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_32))
								.addComponent(checkBox_8)
								.addComponent(checkBox_1)))
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
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_31))
								.addComponent(checkBox_9)
								.addComponent(checkBox)))
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
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(label_30)
							.addGap(12)
							.addComponent(label_29)
							.addGap(17)
							.addComponent(label_28))
						.addGroup(gl_PanelActividadAux_1.createSequentialGroup()
							.addComponent(checkBox_10)
							.addGap(5)
							.addComponent(checkBox_11)
							.addGap(5)
							.addComponent(checkBox_12))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
		);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		PanelActividadAux_1.setLayout(gl_PanelActividadAux_1);
		
	
	}

	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorWB) controlador;
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
