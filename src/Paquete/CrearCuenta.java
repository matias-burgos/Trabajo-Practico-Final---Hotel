package Paquete;

import java.io.Serializable;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CrearCuenta extends JPanel implements Serializable{
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
					.addGap(396)
					.addComponent(lblNombre))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(386)
					.addComponent(lblNombreDeUsuario))
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
					.addContainerGap()
					.addComponent(lblSawuel)
					.addGap(292)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtApellido_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAgregarCosasSobre)
									.addGap(414)
									.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(503)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCrearCuenta, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(lblSawuel))
					.addGap(8)
					.addComponent(lblCrearCuenta)
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNombre)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtApellido_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
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
