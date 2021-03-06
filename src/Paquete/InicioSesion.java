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
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame implements Serializable{

	private JPanel contentPane;
	//Siendo static puedo tener acceso a estas variables en cualquier lugar del proyecto.
	public static JPasswordField contraseņaUsuario;
	public static JTextField nombreUsuario;
	
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
		
		JLabel contraseņa = new JLabel("Contrasea");
		contraseņa.setBounds(75, 151, 102, 14);
		contentPane.add(contraseņa);
		
		contraseņaUsuario = new JPasswordField();
		contraseņaUsuario.setForeground(Color.WHITE);
		contraseņaUsuario.setBackground(Color.BLACK);
		contraseņaUsuario.setBounds(204, 148, 115, 20);
		contentPane.add(contraseņaUsuario);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setForeground(Color.WHITE);
		nombreUsuario.setBackground(Color.BLACK);
		nombreUsuario.setBounds(204, 112, 121, 20);
		contentPane.add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Busca en el archivo el nombre de usuario y la contraseņa ingresadas.
				int rta = Login.iniciar();
				switch (rta) {
				case -1:
					JOptionPane.showMessageDialog(btnAceptar, "La combinacion de nombre y contraseņa no existe", "Error al ingresar datos", JOptionPane.ERROR_MESSAGE);
					break;
				case 1:
					MenuPasajero nuevoPasajero=new MenuPasajero(nombreUsuario.getText());
					nuevoPasajero.setVisible(true);
					dispose();
					break;
				case 0:
					MenuConserje nuevoConserje=new MenuConserje(nombreUsuario.getText());
					nuevoConserje.setVisible(true);
					dispose();
					break;
				case 2:
					MenuAdministrador nuevoAdmin=new MenuAdministrador(nombreUsuario.getText());
					nuevoAdmin.setVisible(true);
					dispose();
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
				AsignarUsuario nueva=new AsignarUsuario();
				nueva.setVisible(true);
				setVisible(false);
			}
		});
		btnCrearCuenta.setBounds(306, 11, 128, 23);
		contentPane.add(btnCrearCuenta);
	}
}
