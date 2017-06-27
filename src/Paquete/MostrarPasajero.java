package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class MostrarPasajero extends JFrame {

	private JPanel contentPane;

	public MostrarPasajero(Pasajero seleccionado) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPasajero = new JLabel("Pasajero");
		lblPasajero.setBounds(182, 0, 46, 14);
		contentPane.add(lblPasajero);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 25, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(151, 25, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblCiudadDeOrigen = new JLabel("Ciudad de origen");
		lblCiudadDeOrigen.setBounds(10, 89, 113, 14);
		contentPane.add(lblCiudadDeOrigen);
		
		JLabel lblNewLabel = new JLabel("Domicilio");
		lblNewLabel.setBounds(182, 89, 90, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHabitacionActual = new JLabel("Habitacion actual");
		lblHabitacionActual.setBounds(10, 144, 113, 14);
		contentPane.add(lblHabitacionActual);
		
		JEditorPane nombre = new JEditorPane();
		nombre.setText(seleccionado.getNombre());
		nombre.setEditable(false);
		nombre.setBounds(10, 50, 106, 20);
		contentPane.add(nombre);
		
		JEditorPane dni = new JEditorPane();
		dni.setText(String.valueOf(seleccionado.getDNI()));
		dni.setEditable(false);
		dni.setBounds(140, 50, 106, 20);
		contentPane.add(dni);
		
		JEditorPane ciudad = new JEditorPane();
		ciudad.setText(seleccionado.getCiudad());
		ciudad.setEditable(false);
		ciudad.setBounds(10, 114, 106, 20);
		contentPane.add(ciudad);
		
		JEditorPane domicilio = new JEditorPane();
		domicilio.setText(seleccionado.getDomicilio());
		domicilio.setEditable(false);
		domicilio.setBounds(140, 114, 106, 20);
		contentPane.add(domicilio);
		
		JEditorPane habitacion = new JEditorPane();
		habitacion.setText(String.valueOf(seleccionado.getActual().getNumero()));
		habitacion.setEditable(false);
		habitacion.setBounds(10, 169, 106, 20);
		contentPane.add(habitacion);
	}

}
