package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class CrearCuentaConserje extends JFrame implements Serializable{

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField dni;
	private JTextField user;
	private JTextField id;
	private JPasswordField contraseña;
	Principal principal=new Principal();
	public CrearCuentaConserje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarInformacion = new JLabel("Ingresar Informacion");
		lblIngresarInformacion.setBounds(168, 0, 124, 14);
		contentPane.add(lblIngresarInformacion);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 27, 46, 14);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(21, 55, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(21, 98, 46, 14);
		contentPane.add(lblNewLabel);
		
		dni = new JTextField();
		dni.setBounds(21, 123, 86, 20);
		contentPane.add(dni);
		dni.setColumns(10);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setBounds(21, 163, 114, 14);
		contentPane.add(lblNombreDeUsuario);
		
		user = new JTextField();
		user.setBounds(21, 196, 86, 20);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblEmpleadoId = new JLabel("Empleado ID");
		lblEmpleadoId.setBounds(168, 27, 103, 14);
		contentPane.add(lblEmpleadoId);
		
		id = new JTextField();
		id.setBounds(160, 55, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(168, 163, 91, 14);
		contentPane.add(lblContrasea);
		
		contraseña = new JPasswordField();
		contraseña.setEchoChar('*');
		contraseña.setBounds(168, 196, 103, 20);
		contentPane.add(contraseña);
		
		JButton btnVolver = new JButton("Volver");
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
				principal.CrearCuentaConserj(nombre.getText(), Integer.parseInt(dni.getText()), user.getText(), contraseña.getText(), id.getText());
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
