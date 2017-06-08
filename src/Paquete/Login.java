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
import java.io.Serializable;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;

public class Login implements Serializable
{
	private static final long serialVersionUID = 1L;
	private JFrame frmHotelSawuel;
	private JPasswordField contraseña;
	private JTextField nombre;
	
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

	public Login() {
		initialize();
	}

	private void initialize() {
		
		frmHotelSawuel = new JFrame();
		frmHotelSawuel.getContentPane().setBackground(new Color(0, 204, 255));
		frmHotelSawuel.setForeground(new Color(0, 51, 255));
		frmHotelSawuel.setTitle("Hotel Sawuel");
		frmHotelSawuel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matias\\Downloads\\Logo.png.jpg"));
		frmHotelSawuel.setBounds(100, 100, 1155, 710);
		frmHotelSawuel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelSawuel.getContentPane().setLayout(null);
		frmHotelSawuel.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//Cuadros de texto
		nombre.setBounds(477, 280, 230, 26);
		frmHotelSawuel.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		contraseña = new JPasswordField();
		contraseña.setToolTipText("");
		contraseña.setBounds(477, 311, 230, 30);
		contraseña.setEchoChar('*');
		frmHotelSawuel.getContentPane().add(contraseña);
		
		//Mensajes
		JLabel NombreUsuario = new JLabel("Nombre de Usuario");
		NombreUsuario.setBounds(243, 275, 229, 31);
		NombreUsuario.setFont(new Font("MV Boli", Font.BOLD, 18));
		NombreUsuario.setBackground(new Color(0, 102, 255));
		frmHotelSawuel.getContentPane().add(NombreUsuario);
		
		JLabel Contraseña = new JLabel("Contraseña");
		Contraseña.setBounds(243, 311, 229, 30);
		Contraseña.setFont(new Font("MV Boli", Font.BOLD, 18));
		frmHotelSawuel.getContentPane().add(Contraseña);
		
		
		
		//Boton "Aceptar"
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(477, 346, 83, 34);
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre=NombreUsuario.getText();//Obtiene lo escrito por el usuario en el "nombre de usuario", y lo almacena en un string.
				String contraseña=Contraseña.getText();//Obtiene lo escrito por el usuario en la "contraseña", y lo guarda en un string./
				//Busca en el archivo de pasajeros el nombre de usuario y la contraseña ingresadas.
				/*
				FileInputStream salidaPasajero=null;*/
				int comprob=0;//Comprueba si el nombre de usuario y la contraseña es encontrada.
				Pasajero aux=null;
				try
				{/*
					salidaPasajero=new FileInputStream("Pasajero.dat");
					ObjectInputStream lectura=new ObjectInputStream(salidaPasajero); 
					System.out.println("asdas");
					aux=(Pasajero)lectura.readObject();
					System.out.println("asdas");*/
				//	while(aux!=null)//Recorrido del archivo
				//	{
						//Comprobacion.
					String nombreEjemplo="1";
					System.out.println(nombre);
					String contraseñaEjemplo="2";
						if(/*nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha())*/ nombre.equals(nombreEjemplo) && contraseña.equals(contraseñaEjemplo))
						{
							/*
							JOptionPane.showMessageDialog(frmHotelSawuel,  "entraste");
							MenuPasajero nuevo=new MenuPasajero();*/
							MenuAdministrador nuevo=new MenuAdministrador();
							nuevo.setVisible(true);
							comprob=1;
							
						}
						else
						{
							JOptionPane.showMessageDialog(frmHotelSawuel, "no enstraste");
							MenuPasajero nuevo=new MenuPasajero();
							nuevo.setVisible(true);
							comprob=1;
							
						}
						//aux=(Pasajero)lectura.readObject();
					//}
					//lectura.close();
					
				} /*catch (FileNotFoundException e) {
					System.out.println("Problema al usar el archivo de pasajeros: ");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Problema al usar el archivo de pasajeros: ");
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					System.out.println("Problema al usar el archivo de pasajeros: ");
					e.printStackTrace();
				}*/
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
