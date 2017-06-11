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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField contrase�aUsuario;
	private JTextField nombreUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frmHotelSawuel = new InicioSesion();
					frmHotelSawuel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
		nombreDeUsuario.setBounds(75, 72, 102, 14);
		contentPane.add(nombreDeUsuario);
		
		JLabel contrase�a = new JLabel("Contrasea");
		contrase�a.setBounds(75, 133, 102, 14);
		contentPane.add(contrase�a);
		
		contrase�aUsuario = new JPasswordField();
		contrase�aUsuario.setBackground(Color.BLACK);
		contrase�aUsuario.setBounds(207, 130, 115, 20);
		contentPane.add(contrase�aUsuario);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBackground(Color.BLACK);
		nombreUsuario.setBounds(207, 69, 121, 20);
		contentPane.add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=nombreUsuario.getText();//Obtiene lo escrito por el usuario en el "nombre de usuario", y lo almacena en un string.
				String contrase�a=contrase�aUsuario.getText();//Obtiene lo escrito por el usuario en la "contrase�a", y lo guarda en un string./
				//Busca en el archivo de pasajeros el nombre de usuario y la contrase�a ingresadas.
				
				FileInputStream salidaPasajero=null;
				int comprob=0;//Comprueba si el nombre de usuario y la contrase�a es encontrada.
				Pasajero aux;
				try {
					salidaPasajero=new FileInputStream("Pasajero.dat");
					ObjectInputStream lecturaPasajero=new ObjectInputStream(salidaPasajero); 
					aux=(Pasajero)lecturaPasajero.readObject();
					System.out.println("asdas");
					//Recorrido por el archivo de usuarios.
					while(aux!=null)//Recorrido del archivo
				{
						//Comprobacion.
						if(nombre.equals(aux.getUser()) && contrase�a.equals(aux.getContrasenha())/* nombre.equals(nombreEjemplo) && contrase�a.equals(contrase�aEjemplo)*/)
						{
							
							JOptionPane.showMessageDialog(btnAceptar,  "entraste");
							MenuPasajero nuevo=new MenuPasajero();
							nuevo.setVisible(true);
							setVisible(false);
							comprob=comprob+1;
						}
						else
						{
							JOptionPane.showMessageDialog(btnAceptar, "no enstraste");
						
							
						}
						
						aux=(Pasajero)lecturaPasajero.readObject();
					}
					lecturaPasajero.close();
					
				} catch (Exception e2) {
					System.out.println("Problemas al usar el archivo de pasajeros"+e2);
				}
				FileInputStream salidaConserje;
				try {
					salidaConserje=new FileInputStream("Conserje.dat");
					ObjectInputStream lecturaConserje=new ObjectInputStream(salidaConserje);
					Conserje auxConserje=(Conserje)lecturaConserje.readObject();
					//Recorrido del archivo de conserjes.
					while(auxConserje!=null)//Recorrido del archivo
					{
							//Comprobacion.
							if(nombre.equals(auxConserje.getUser()) && contrase�a.equals(auxConserje.getContrasenha())/* nombre.equals(nombreEjemplo) && contrase�a.equals(contrase�aEjemplo)*/)
							{
								
								JOptionPane.showMessageDialog(btnAceptar,  "entraste");
								MenuConserje nuevo=new MenuConserje();
								nuevo.setVisible(true);
								setVisible(false);
								comprob=comprob+1;
								
							}
							else
							{
								JOptionPane.showMessageDialog(btnAceptar, "no enstraste");
								
								
							}
							
							auxConserje=(Conserje)lecturaConserje.readObject();
						}
						lecturaConserje.close();
				} catch (Exception e2) {
					System.out.println("Error al usar archivo de conserje: "+e2);
				}
				FileInputStream salidaAdministrador;
				try {
					salidaAdministrador=new FileInputStream("Administrador.dat");
					ObjectInputStream lecturaAdministrador=new ObjectInputStream(salidaAdministrador);
					Conserje auxAdministrador=(Conserje)lecturaAdministrador.readObject();
					//Recorrido del archivo de administrador.
					while(auxAdministrador!=null)//Recorrido del archivo
					{
							//Comprobacion.
							if(nombre.equals(auxAdministrador.getUser()) && contrase�a.equals(auxAdministrador.getContrasenha())/* nombre.equals(nombreEjemplo) && contrase�a.equals(contrase�aEjemplo)*/)
							{
								
								JOptionPane.showMessageDialog(btnAceptar,  "entraste");
								MenuAdministrador nuevo=new MenuAdministrador();
								nuevo.setVisible(true);
								setVisible(false);
								comprob=comprob+1;
								
							}
							else
							{
								JOptionPane.showMessageDialog(btnAceptar, "no enstraste");
								
								
							}
							
							auxAdministrador=(Conserje)lecturaAdministrador.readObject();
						}
						lecturaAdministrador.close();
				} catch (Exception e2) {
					System.out.println("Error al usar archivo de administrador: "+e2);
				}
				
			}
		});
		btnAceptar.setBackground(Color.GREEN);
		btnAceptar.setBounds(204, 161, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(345, 239, 89, 23);
		contentPane.add(btnSalir);
	}

}
