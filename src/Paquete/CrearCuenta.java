package Paquete;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CrearCuenta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JTextField apellido;
	private JTextField dni;
	private JTextField nombreUsuario;
	private JPasswordField contraseña;
	ButtonGroup grupo1 = new ButtonGroup();
	
	public CrearCuenta() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblIngreseLaInformacion = new JLabel("Ingrese la informacion requerida");
		lblIngreseLaInformacion.setForeground(Color.GREEN);
		lblIngreseLaInformacion.setBackground(Color.WHITE);
		lblIngreseLaInformacion.setBounds(131, 5, 193, 14);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnVolver.setBackground(Color.RED);
		btnVolver.setBounds(345, 5, 89, 23);
		btnVolver.setForeground(Color.BLACK);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreAux=nombre.getText();
				String apellidoAux=apellido.getText();
				int dniAux=Integer.parseInt(dni.getText());
				String contraseñaAux=contraseña.getText();
				String usuarioAux=nombreUsuario.getText();
				Conserje nuevo=new Conserje();
				//nuevo.crearUsuario(nombreAux, apellidoAux, dniAux, contraseñaAux, usuarioAux);
				//nuevo.AgregarUsuario();
				
			}
		});
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(345, 239, 89, 23);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setBounds(10, 46, 57, 14);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		nombre = new JTextField();
		nombre.setBounds(10, 71, 86, 20);
		nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setBounds(112, 46, 66, 14);
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		
		apellido = new JTextField();
		apellido.setBounds(106, 71, 86, 20);
		apellido.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 115, 46, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		dni = new JTextField();
		dni.setBounds(10, 140, 86, 20);
		dni.setColumns(10);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario ");
		lblNombreDeUsuario.setForeground(Color.WHITE);
		lblNombreDeUsuario.setBounds(10, 175, 110, 14);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(10, 200, 100, 20);
		nombreUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(131, 175, 100, 14);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(121, 200, 110, 20);
		
		JLabel label = new JLabel("-");
		label.setForeground(Color.WHITE);
		label.setBounds(103, 203, 26, 14);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("-");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(87, 74, 31, 14);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(lblIngreseLaInformacion);
		contentPanel.add(btnVolver);
		contentPanel.add(btnAceptar);
		contentPanel.add(lblNombre);
		contentPanel.add(nombre);
		contentPanel.add(lblApellido);
		contentPanel.add(apellido);
		contentPanel.add(lblNewLabel);
		contentPanel.add(dni);
		contentPanel.add(lblNombreDeUsuario);
		contentPanel.add(nombreUsuario);
		contentPanel.add(lblContrasea);
		contentPanel.add(contraseña);
		contentPanel.add(label);
		contentPanel.add(label_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Administrador");
		rdbtnNewRadioButton.setBounds(295, 70, 109, 23);
		contentPanel.add(rdbtnNewRadioButton);
		grupo1.add(rdbtnNewRadioButton);
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Conserje");
		rdbtnNewRadioButton_1.setBounds(295, 111, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_1);
		grupo1.add(rdbtnNewRadioButton_1);
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Pasajero");
		rdbtnNewRadioButton_2.setBounds(295, 153, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_2);
		grupo1.add(rdbtnNewRadioButton_2);
		JLabel lblElegirTipoDe = new JLabel("Elegir tipo de cuenta");
		lblElegirTipoDe.setForeground(Color.WHITE);
		lblElegirTipoDe.setBounds(287, 46, 137, 14);
		contentPanel.add(lblElegirTipoDe);
	}
}
