package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField contraseñaUsuario;
	private JTextField nombreUsuario;

	public InicioSesion() {
		setTitle("Hotel Sawuel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoAlHotel = new JLabel("Bienvenido al Hotel Sawuel");
		lblBienvenidoAlHotel.setBounds(165, 0, 128, 14);
		contentPane.add(lblBienvenidoAlHotel);
		
		JLabel nombreDeUsuario = new JLabel("Nombre de usuario");
		nombreDeUsuario.setBounds(75, 115, 102, 14);
		contentPane.add(nombreDeUsuario);
		
		JLabel contraseña = new JLabel("Contrasea");
		contraseña.setBounds(75, 151, 102, 14);
		contentPane.add(contraseña);
		
		contraseñaUsuario = new JPasswordField();
		contraseñaUsuario.setForeground(Color.WHITE);
		contraseñaUsuario.setBackground(Color.BLACK);
		contraseñaUsuario.setBounds(204, 148, 115, 20);
		contentPane.add(contraseñaUsuario);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setForeground(Color.WHITE);
		nombreUsuario.setBackground(Color.BLACK);
		nombreUsuario.setBounds(204, 112, 121, 20);
		contentPane.add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=nombreUsuario.getText();//Obtiene lo escrito por el usuario en el "nombre de usuario", y lo almacena en un string.
				String contraseña=contraseñaUsuario.getText();//Obtiene lo escrito por el usuario en la "contraseña", y lo guarda en un string.
				//Busca en el archivo el nombre de usuario y la contraseña ingresadas.
				int rta = Login.iniciar(nombre, contraseña);
				switch (rta) {
				case -1:
					
					break;
				case 1:
					break;
				default:
					break;
				}
				
				
				
				
				
			}
		});
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(204, 179, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(345, 239, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearCuenta nueva=new CrearCuenta();
				nueva.setVisible(true);
				setVisible(false);
			}
		});
		btnCrearCuenta.setBounds(306, 11, 128, 23);
		contentPane.add(btnCrearCuenta);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de usuario");
		lblTipoDeUsuario.setBounds(75, 76, 89, 14);
		contentPane.add(lblTipoDeUsuario);
	}
}
