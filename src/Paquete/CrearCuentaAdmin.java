package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class CrearCuentaAdmin extends JFrame implements Serializable{

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField dni;
	private JTextField user;
	private JPasswordField contraseña;
	Principal principal=new Principal();
	public CrearCuentaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarInformacion = new JLabel("Ingresar Informacion");
		lblIngresarInformacion.setBounds(172, 0, 119, 14);
		contentPane.add(lblIngresarInformacion);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 37, 46, 14);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(10, 62, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 104, 46, 14);
		contentPane.add(lblDni);
		
		dni = new JTextField();
		dni.setBounds(10, 129, 86, 20);
		contentPane.add(dni);
		dni.setColumns(10);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setBounds(10, 160, 126, 14);
		contentPane.add(lblNombreDeUsuario);
		
		user = new JTextField();
		user.setBounds(10, 189, 86, 20);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(163, 160, 106, 14);
		contentPane.add(lblContrasea);
		
		contraseña = new JPasswordField();
		contraseña.setEchoChar('*');
		contraseña.setBounds(159, 189, 110, 20);
		contentPane.add(contraseña);
		
		JButton btnVolver = new JButton("volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AsignarUsuario volver=new AsignarUsuario();
				volver.setVisible(true);
			}
		});
		btnVolver.setBounds(335, 11, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.CrearCuentaAdmin(nombre.getText(), Integer.parseInt(dni.getText()), user.getText(), contraseña.getText());
				JOptionPane.showMessageDialog(btnAceptar, "Creacion exitosa de la cuenta, bienvenido "+nombre.getText());
				dispose();
				InicioSesion volver=new InicioSesion();
				volver.setVisible(true);
			}
		});
		btnAceptar.setBounds(335, 228, 89, 23);
		contentPane.add(btnAceptar);
	}

}
