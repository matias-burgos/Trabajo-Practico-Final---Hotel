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

public class Inicio {

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
					Inicio window = new Inicio();
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
	public Inicio() {
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
		
		contraseña = new JPasswordField();
		contraseña.setEchoChar('*');
		contraseña.setBounds(487, 330, 230, 34);
		frmHotelSawuel.getContentPane().add(contraseña);
		
		usuario = new JTextField();
		usuario.setBounds(487, 277, 230, 34);
		frmHotelSawuel.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JLabel NombreUsuario = new JLabel("Nombre de Usuario");
		NombreUsuario.setFont(new Font("MV Boli", Font.BOLD, 18));
		NombreUsuario.setBackground(new Color(0, 102, 255));
		NombreUsuario.setBounds(243, 275, 234, 36);
		frmHotelSawuel.getContentPane().add(NombreUsuario);
		
		JLabel Contraseña = new JLabel("Contrase\u00F1a");
		Contraseña.setFont(new Font("MV Boli", Font.BOLD, 18));
		Contraseña.setBounds(243, 330, 234, 34);
		frmHotelSawuel.getContentPane().add(Contraseña);
		
		JButton botonAceptar = new JButton("Aceptar");
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
					while(lectura==null)//Recorrido del archivo
					{
						//Comprobacion.
						if(/*nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha())*/ nombre.equals("kappa") && contraseña.equals("kappa"))
						{/*
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										MenuPasajero frame = new MenuPasajero();
										frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
							MenuPasajero nuevo=new MenuPasajero();
							nuevo.setVisible(true);
							comprob=1;*/
							//JOptionPane.showMessageDialog(frame,  "Taiel sos un puto descendido");
						}
						else
						{
							//JOptionPane.showMessageDialog(frame, "no enstraste");
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
		botonAceptar.setBounds(487, 390, 116, 34);
		frmHotelSawuel.getContentPane().add(botonAceptar);
	}
}
