package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Login {

	private JFrame frmHotelSawuel;
	private JPasswordField contraseña;
	private JTextField usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmHotelSawuel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHotelSawuel = new JFrame();
		frmHotelSawuel.getContentPane().setBackground(new Color(0, 204, 255));
		frmHotelSawuel.setForeground(new Color(0, 51, 255));
		frmHotelSawuel.setTitle("Hotel Sawuel");
		frmHotelSawuel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matias\\Downloads\\Logo.png.jpg"));
		frmHotelSawuel.setBounds(100, 100, 1155, 710);
		frmHotelSawuel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelSawuel.getContentPane().setLayout(null);
		
		JLabel NombreUsuario = new JLabel("Nombre de Usuario");
		NombreUsuario.setBounds(243, 275, 229, 31);
		NombreUsuario.setFont(new Font("MV Boli", Font.BOLD, 18));
		NombreUsuario.setBackground(new Color(0, 102, 255));
		frmHotelSawuel.getContentPane().add(NombreUsuario);
		
		usuario = new JTextField();
		usuario.setBounds(477, 275, 230, 31);
		frmHotelSawuel.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JLabel Contraseña = new JLabel("Contrase\u00F1a");
		Contraseña.setBounds(243, 311, 229, 30);
		Contraseña.setFont(new Font("MV Boli", Font.BOLD, 18));
		frmHotelSawuel.getContentPane().add(Contraseña);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(477, 311, 230, 30);
		contraseña.setEchoChar('*');
		frmHotelSawuel.getContentPane().add(contraseña);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(477, 346, 83, 34);
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre=NombreUsuario.getText();//Obtiene lo escrito por el usuario en el "nombre de usuario", y lo almacena en un string.
				String contraseña=Contraseña.getText();//Obtiene lo escrito por el usuario en la "contraseña", y lo guarda en un string./
				//Busca en el archivo de pasajeros el nombre de usuario y la contraseña ingresadas.
				
				FileInputStream salidaPasajero;
				int comprob=0;//Comprueba si el nombre de usuario y la contraseña es encontrada.
				try
				{
					
					salidaPasajero=new FileInputStream("Pasajero.dat");
					ObjectInputStream lectura=new ObjectInputStream(salidaPasajero); 
					Pasajero aux=(Pasajero)lectura.readObject();
					while(lectura!=null)//Recorrido del archivo
					{
						//Comprobacion.
						if(nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha()))
						{
							MenuPasajero nuevo=new MenuPasajero();
							nuevo.setVisible(true);
							comprob=1;
							JOptionPane.showMessageDialog(frmHotelSawuel,  "entraste");
						}
						else
						{
							MenuPasajero nuevo=new MenuPasajero();
							nuevo.setVisible(true);
							comprob=1;
							JOptionPane.showMessageDialog(frmHotelSawuel, "no enstraste");
						}
					}
					
					
				} catch (FileNotFoundException e) {
					System.out.println("Problema al usar el archivo de pasajeros: ");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Problema al usar el archivo de pasajeros: ");
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					System.out.println("Problema al usar el archivo de pasajeros: ");
					e.printStackTrace();
				}
				finally 
				{
					
				}
				
			}
		});
		botonAceptar.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		botonAceptar.setBackground(new Color(0, 153, 255));
		frmHotelSawuel.getContentPane().add(botonAceptar);
	}
}
