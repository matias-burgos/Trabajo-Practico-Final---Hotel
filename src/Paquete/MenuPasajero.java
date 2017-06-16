package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;

public class MenuPasajero extends JFrame implements Serializable{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public MenuPasajero(Pasajero usuario) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JButton btnNewButton = new JButton("Realizar reserva");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearReserva nuevo= new CrearReserva();
				nuevo.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(250, 31, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(126, 31, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblHistorialDeHabitaciones = new JLabel("Historial de habitaciones");
		lblHistorialDeHabitaciones.setBounds(10, 141, 124, 14);
		contentPane.add(lblHistorialDeHabitaciones);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				InicioSesion nuevo=new InicioSesion();
				nuevo.setVisible(true);
				
			}
		});
		btnSalir.setBounds(345, 239, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnOpcioonesDeUsuario = new JButton("Configuracion de cuenta");
		btnOpcioonesDeUsuario.setBounds(283, 215, 151, 23);
		contentPane.add(btnOpcioonesDeUsuario);
		
		JLabel lblNewLabel = new JLabel("Imagen de usuario");
		lblNewLabel.setBounds(0, 0, 89, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(126, 0, 141, 14);
		contentPane.add(lblBienvenido);
		
		
		JLabel lblReservasRealizadas = new JLabel("Reservas realizadas");
		lblReservasRealizadas.setBounds(250, 65, 124, 14);
		contentPane.add(lblReservasRealizadas);
		
		FileInputStream salidaReserva;
		Reserva auxReserva=new Reserva();
		try {
			salidaReserva=new FileInputStream("Reservas.dat");
			ObjectInputStream lecturaReservas=new ObjectInputStream(salidaReserva);
			auxReserva=(Reserva)lecturaReservas.readObject();
			while(auxReserva!=null)
			{
				if(auxReserva.getResponsable().getDNI()==usuario.getDNI())
				{
					break;
				}
				auxReserva=(Reserva)lecturaReservas.readObject();
			}
		} catch (Exception e) {
			System.out.println("Error al usar el archivo de Reservas: "+e);
		}
		textField = new JTextField("Habitacion "+auxReserva.getHabitacionReservada().getNumero());
		textField.setForeground(Color.BLACK);
		textField.setEditable(false);
		textField.setBounds(250, 90, 124, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		textField_1 = new JTextField();
		FileInputStream salidaHistorial;
		Habitacion auxHabitacion=new Habitacion();
		try {
			salidaHistorial=new FileInputStream("Historial.dat");
			ObjectInputStream lecturaHistorial=new ObjectInputStream(salidaHistorial);
			auxHabitacion=(Habitacion)lecturaHistorial.readObject();
			while(auxHabitacion!=null)
			{
				textField_1 = new JTextField("Habitacion "+auxHabitacion.getNumero());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		textField_1.setEditable(false);
		textField_1.setBounds(10, 166, 124, 127);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
