package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MenuAdministrador extends JFrame {

	private JPanel contentPane;
	Principal principal=new Principal();
	
	public MenuAdministrador(String nombre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setBounds(174, 0, 97, 14);
		contentPane.add(lblBienvenido);
		
		JButton btnVerHabitaciones = new JButton("Ver habitaciones");
		btnVerHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerHabitaciones nuevo=new VerHabitaciones();
				nuevo.setVisible(true);
			}
		});
		btnVerHabitaciones.setBounds(10, 30, 127, 23);
		contentPane.add(btnVerHabitaciones);
		
		JButton btnCrearHabitacion = new JButton("Crear Habitacion");
		btnCrearHabitacion.setBounds(10, 82, 127, 23);
		contentPane.add(btnCrearHabitacion);
		
		JButton btnVerPasajeros = new JButton("Ver pasajeros");
		btnVerPasajeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarPasajeros nuevo=new MostrarPasajeros();
				nuevo.setVisible(true);
			}
		});
		btnVerPasajeros.setBounds(166, 30, 127, 23);
		contentPane.add(btnVerPasajeros);
		
		JButton btnCrearPasajero = new JButton("Crear Pasajero");
		btnCrearPasajero.setBounds(166, 82, 127, 23);
		contentPane.add(btnCrearPasajero);
		
		JButton btnNewButton = new JButton("Ver conserjes");
		btnNewButton.setBounds(10, 135, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCrearConserjes = new JButton("Crear conserje");
		btnCrearConserjes.setBounds(166, 135, 127, 23);
		contentPane.add(btnCrearConserjes);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InicioSesion volver=new InicioSesion();
				volver.setVisible(true);
			}
		});
		btnSalir.setBounds(324, 228, 89, 23);
		contentPane.add(btnSalir);
	}

}
