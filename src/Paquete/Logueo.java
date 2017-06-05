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

public class Logueo extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Logueo() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		add(passwordField);
		
		JButton btnAceptar = new JButton("Aceptar");
		add(btnAceptar);

	}

}
