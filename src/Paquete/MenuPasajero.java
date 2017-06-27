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
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class MenuPasajero extends JFrame implements Serializable{

	
	Principal principal=new Principal();
	private JPanel contentPane;
	public MenuPasajero(String cuenta) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JButton btnNewButton = new JButton("Realizar reserva");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearReserva nuevo=new CrearReserva();
				nuevo.setVisible(true);
			}
		});
		btnNewButton.setBounds(207, 31, 158, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblHistorialDeHabitaciones = new JLabel("Historial de habitaciones");
		lblHistorialDeHabitaciones.setBounds(10, 112, 158, 14);
		contentPane.add(lblHistorialDeHabitaciones);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				InicioSesion nuevo=new InicioSesion();
				nuevo.setVisible(true);
				
			}
		});
		btnSalir.setBounds(328, 239, 106, 23);
		contentPane.add(btnSalir);
		
		JLabel lblBienvenido = new JLabel("Bienvenido "+cuenta);
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(126, 0, 141, 14);
		contentPane.add(lblBienvenido);
		
		JList list = new JList();
		DefaultListModel modelo = new DefaultListModel();
		ArrayList <Habitacion>listaAux=principal.AperturaArchivoPasajerosHistorial(cuenta);
		for(Habitacion aux:listaAux)
		{
			modelo.addElement(aux.numero);
		}
		list.setModel(modelo);
		
		list.setBounds(10, 137, 124, 96);
		contentPane.add(list);
	}
}
