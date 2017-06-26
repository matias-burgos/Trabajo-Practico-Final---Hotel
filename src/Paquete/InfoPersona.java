package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class InfoPersona extends JFrame implements Serializable {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField dni;
	
	public InfoPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarInformacionPersonal = new JLabel("Ingresar informacion personal del responsable de la reserva");
		lblIngresarInformacionPersonal.setBounds(77, 11, 319, 14);
		contentPane.add(lblIngresarInformacionPersonal);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 39, 46, 14);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(10, 58, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblDNI = new JLabel("DNI\r\n");
		lblDNI.setBounds(134, 39, 46, 14);
		contentPane.add(lblDNI);
		
		dni = new JTextField();
		dni.setBounds(126, 58, 86, 20);
		contentPane.add(dni);
		dni.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				responsableAsignado=new Persona(nombre.getText(), Integer.parseInt(dni.getText()));
				dispose();
			}
		});
		btnAceptar.setBounds(10, 130, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(134, 130, 89, 23);
		contentPane.add(btnCancelar);
	}
}
