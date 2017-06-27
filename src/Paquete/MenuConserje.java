package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuConserje extends JFrame {

	private JPanel contentPane;

	
	public MenuConserje(String nombre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido "+nombre);
		lblBienvenido.setBounds(170, 0, 130, 14);
		contentPane.add(lblBienvenido);
		
		JLabel lblPasajeros = new JLabel("Pasajeros");
		lblPasajeros.setBounds(92, 33, 61, 14);
		contentPane.add(lblPasajeros);
		
		JButton btnNewButton = new JButton("Check-In ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(10, 58, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCheckout = new JButton("Check-Out ");
		btnCheckout.setBounds(127, 58, 89, 23);
		contentPane.add(btnCheckout);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(335, 228, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblReservas = new JLabel("Reservas");
		lblReservas.setBounds(92, 105, 61, 14);
		contentPane.add(lblReservas);
		
		JButton btnHacerReservas = new JButton("Hacer reservas");
		btnHacerReservas.setBounds(10, 130, 113, 23);
		contentPane.add(btnHacerReservas);
		
		JButton btnVerReservas = new JButton("Ver reservas");
		btnVerReservas.setBounds(136, 130, 104, 23);
		contentPane.add(btnVerReservas);
		
		JButton btnVerHabitaciones = new JButton("Ver habitaciones");
		btnVerHabitaciones.setBounds(311, 194, 113, 23);
		contentPane.add(btnVerHabitaciones);
	}
}
