package Paquete;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CrearCuentaPasajero extends JDialog implements Serializable{

	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JTextField dni;
	private JTextField nombreUsuario;
	private JPasswordField contraseña;
	
	Principal principal=new Principal();
	private JTextField domicilio;
	private JTextField ciudad;
	public CrearCuentaPasajero() {
		
		
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		setBounds(100, 100, 450, 300);
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
				AsignarUsuario volver=new AsignarUsuario();
				volver.setVisible(true);
			}
		});
		btnVolver.setBackground(Color.RED);
		btnVolver.setBounds(345, 5, 89, 23);
		btnVolver.setForeground(Color.BLACK);
		
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				principal.CrearCuentaPasj(nombre.getText(), Integer.parseInt(dni.getText()), ciudad.getText(), domicilio.getText(), nombreUsuario.getText(), contraseña.getText());
				JOptionPane.showMessageDialog(btnAceptar, "Creacion exitosa de la cuenta, bienvenido "+nombre.getText());
				dispose();
				InicioSesion volver=new InicioSesion();
				volver.setVisible(true);
			}
		});
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(345, 239, 89, 23);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setBounds(10, 46, 57, 14);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblCiudad=new JLabel("Ciudad de origen");
		lblCiudad.setForeground(Color.WHITE);
		lblCiudad.setBackground(Color.WHITE);
		
		
		ciudad = new JTextField();
		ciudad.setBounds(10, 71, 86, 20);
		ciudad.setColumns(10);
		
		JLabel lblDomicilio=new JLabel("Domicilio");
		lblDomicilio.setForeground(Color.WHITE);
		lblDomicilio.setBackground(Color.WHITE);
		lblDomicilio.setBounds(131, 115, 57, 14);
		lblDomicilio.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		nombre = new JTextField();
		nombre.setBounds(10, 71, 86, 20);
		nombre.setColumns(10);
		
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
		contentPanel.setLayout(null);
		
		contentPanel.add(lblIngreseLaInformacion);
		contentPanel.add(btnVolver);
		contentPanel.add(btnAceptar);
		contentPanel.add(lblNombre);
		contentPanel.add(nombre);
		contentPanel.add(lblNewLabel);
		contentPanel.add(dni);
		contentPanel.add(lblNombreDeUsuario);
		contentPanel.add(nombreUsuario);
		contentPanel.add(lblContrasea);
		contentPanel.add(contraseña);
		contentPanel.add(label);
		
		domicilio = new JTextField();
		domicilio.setBounds(126, 140, 86, 20);
		contentPanel.add(domicilio);
		domicilio.setColumns(10);
		
		JLabel lblCiudadDeOrigen = new JLabel("Ciudad de origen");
		lblCiudadDeOrigen.setForeground(Color.WHITE);
		lblCiudadDeOrigen.setBounds(263, 115, 110, 14);
		contentPanel.add(lblCiudadDeOrigen);
		
		ciudad = new JTextField();
		ciudad.setBounds(263, 140, 86, 20);
		contentPanel.add(ciudad);
		ciudad.setColumns(10);
		
		JLabel lblDomicilio_1 = new JLabel("Domicilio");
		lblDomicilio_1.setForeground(Color.WHITE);
		lblDomicilio_1.setBounds(131, 115, 46, 14);
		contentPanel.add(lblDomicilio_1);
		
		
	}
}
