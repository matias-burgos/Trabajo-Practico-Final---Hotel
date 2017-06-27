package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CheckIn extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField dni;
	Principal principal=new Principal();
	public CheckIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseInfoDel = new JLabel("Ingrese info del responsable de la reserva");
		lblIngreseInfoDel.setBounds(10, 24, 228, 14);
		contentPane.add(lblIngreseInfoDel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 60, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 123, 46, 14);
		contentPane.add(lblDni);
		
		nombre = new JTextField();
		nombre.setBounds(10, 76, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		dni = new JTextField();
		dni.setBounds(10, 148, 86, 20);
		contentPane.add(dni);
		dni.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(335, 228, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Reserva>listaEncontrada=principal.BusquedaReserva(nombre.getText(), Integer.parseInt(dni.getText()));
				ListaReservasRepresentante nuevo=new ListaReservasRepresentante(listaEncontrada);
				nuevo.setVisible(true);
				dispose();
				
			}
		});
		btnBuscar.setBounds(7, 191, 89, 23);
		contentPane.add(btnBuscar);
	}
}
