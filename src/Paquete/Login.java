package Paquete;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Login implements Serializable{

	private JFrame frmHotelSawuel;
	private JTextField nombreUsuario;
	private JPasswordField contraseñaUsuario;

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
		frmHotelSawuel.getContentPane().setBackground(new Color(0, 153, 204));
		frmHotelSawuel.setTitle("Hotel \r\nSawuel");
		frmHotelSawuel.setBounds(100, 100, 450, 300);
		frmHotelSawuel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHotelSawuel.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel nombreDeUsuario = new JLabel("Nombre de usuario");
		nombreDeUsuario.setFont(new Font("Segoe Print", Font.BOLD, 14));
		nombreDeUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel contrasenha = new JLabel("Contrase\u00F1a");
		contrasenha.setFont(new Font("Segoe Print", Font.BOLD, 14));
		contrasenha.setHorizontalAlignment(SwingConstants.RIGHT);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setForeground(Color.WHITE);
		nombreUsuario.setBackground(new Color(0, 0, 0));
		nombreUsuario.setColumns(10);
		
		contraseñaUsuario = new JPasswordField();
		contraseñaUsuario.setForeground(Color.WHITE);
		contraseñaUsuario.setBackground(new Color(0, 0, 0));
		contraseñaUsuario.setToolTipText("Contraseña");
		contraseñaUsuario.setEchoChar('*');
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(0, 255, 0));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre=nombreUsuario.getText();//Obtiene lo escrito por el usuario en el "nombre de usuario", y lo almacena en un string.
				String contraseña=contraseñaUsuario.getText();//Obtiene lo escrito por el usuario en la "contraseña", y lo guarda en un string./
				//Busca en el archivo de pasajeros el nombre de usuario y la contraseña ingresadas.
				
				FileInputStream salidaPasajero=null;
				int comprob=0;//Comprueba si el nombre de usuario y la contraseña es encontrada.
				Pasajero aux;
				try
				{
					salidaPasajero=new FileInputStream("Pasajero.dat");
					ObjectInputStream lectura=new ObjectInputStream(salidaPasajero); 
					aux=(Pasajero)lectura.readObject();
					System.out.println("asdas");
					while(aux!=null)//Recorrido del archivo
				{
						//Comprobacion.
						if(nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha())/* nombre.equals(nombreEjemplo) && contraseña.equals(contraseñaEjemplo)*/)
						{
							
							JOptionPane.showMessageDialog(frmHotelSawuel,  "entraste");
							MenuAdministrador nuevo=new MenuAdministrador();
							//MenuAdministrador nuevo=new MenuAdministrador();
							
							nuevo.setVisible(true);
							frmHotelSawuel.setVisible(false);
							comprob=1;
							
						}
						else
						{
							JOptionPane.showMessageDialog(frmHotelSawuel, "no enstraste");
							MenuPasajero nuevo=new MenuPasajero();
							nuevo.setVisible(true);
							frmHotelSawuel.setVisible(false);
							comprob=1;
							
						}
						aux=(Pasajero)lectura.readObject();
					}
					lectura.close();
					
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
		
		JLabel lblBienvenidoAlHotel = new JLabel("Bienvenido al hotel Sawuel");
		lblBienvenidoAlHotel.setFont(new Font("Swis721 BlkEx BT", Font.BOLD, 18));
		lblBienvenidoAlHotel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(frmHotelSawuel.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(nombreDeUsuario, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nombreUsuario, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(147)
							.addComponent(contrasenha, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAceptar)
								.addComponent(contraseñaUsuario, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(lblBienvenidoAlHotel, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblBienvenidoAlHotel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nombreDeUsuario)
						.addComponent(nombreUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(contrasenha)
						.addComponent(contraseñaUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAceptar)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		frmHotelSawuel.getContentPane().setLayout(groupLayout);
	}
}
