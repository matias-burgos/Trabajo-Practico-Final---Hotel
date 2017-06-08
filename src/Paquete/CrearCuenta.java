package Paquete;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SpringLayout;
import javax.swing.JSpinner;
import javax.swing.JSlider;

public class CrearCuenta extends JPanel {
	private JLabel lblCrearCuenta;
	private JTextField txtApellido_1;
	private JTextField txtApellido;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public CrearCuenta() {
		
		JLabel lblSawuel = new JLabel("Hotel Sawuel");
		
		lblCrearCuenta = new JLabel("Crear Cuenta");
		lblCrearCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		txtApellido_1 = new JTextField();
		txtApellido_1.setText("Nombre");
		txtApellido_1.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setColumns(10);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		
		passwordField = new JPasswordField();
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a");
		
		passwordField_1 = new JPasswordField();
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		
		JSpinner spinner = new JSpinner();
		
		JSpinner spinner_1 = new JSpinner();
		
		JSpinner spinner_2 = new JSpinner();
		
		JLabel label = new JLabel("/");
		
		JLabel label_1 = new JLabel("/");
		
		JButton btnNewButton_1 = new JButton("Iniciar Sesion");
		
		JLabel lblAgregarCosasSobre = new JLabel("Agregar cosas sobre la cuenta, el hotel, esas cosas");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(192)
					.addComponent(lblCrearCuenta, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(396)
					.addComponent(lblNombre))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(386)
					.addComponent(lblNombreDeUsuario))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(364)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(384)
					.addComponent(lblFechaDeNacimiento))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(364)
					.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label)
					.addGap(4)
					.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_1)
					.addGap(7)
					.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(415)
					.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(364)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(385)
					.addComponent(lblRepetirContrasea))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(364)
					.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAgregarCosasSobre)
							.addGap(297)
							.addComponent(txtApellido_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSawuel)
							.addGap(441)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblSawuel))
						.addComponent(btnNewButton_1))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCrearCuenta)
							.addGap(14)
							.addComponent(lblNombre)
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtApellido_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblAgregarCosasSobre))
					.addGap(6)
					.addComponent(lblNombreDeUsuario)
					.addGap(6)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblFechaDeNacimiento)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label))
						.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addComponent(lblContrasea)
					.addGap(6)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblRepetirContrasea)
					.addGap(6)
					.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);

	}
}
