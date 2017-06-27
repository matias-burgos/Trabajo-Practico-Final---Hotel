package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ListaReservasRepresentante extends JFrame {

	private JPanel contentPane;
	Principal principal=new Principal();
	ArrayList<Pasajero>listaPasajeros=new ArrayList<>();
	public ListaReservasRepresentante(ArrayList<Reserva>listaReserva) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaReservas = new JLabel("Lista reservas");
		lblListaReservas.setBounds(166, 0, 102, 14);
		contentPane.add(lblListaReservas);
		
		JComboBox list = new JComboBox();
		list.setBounds(142, 29, 126, 20);
		contentPane.add(list);
		for(Reserva aux:listaReserva)
		{
			list.addItem(aux.getReservado().getNumero());;
		}
		
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(164, 228, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnOcupar = new JButton("Ocupar");
		btnOcupar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seleccionada=Integer.parseInt(list.getSelectedItem().toString());//Retorna la reserva realizada.
				principal.Ocupar(seleccionada, listaPasajeros);
				JOptionPane.showMessageDialog(btnOcupar, "Check-In realizado");
				dispose();
			}
		});
		btnOcupar.setBounds(166, 194, 89, 23);
		contentPane.add(btnOcupar);
		
		JLabel lblSeleccioneLaReserva = new JLabel("Seleccione la reserva");
		lblSeleccioneLaReserva.setBounds(10, 32, 108, 14);
		contentPane.add(lblSeleccioneLaReserva);
		
		
	}
}
