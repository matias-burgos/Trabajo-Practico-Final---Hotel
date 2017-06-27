package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VerHabitaciones extends JFrame {

	private JPanel contentPane;
	Principal principal=new Principal();
	public VerHabitaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setBounds(165, 0, 107, 14);
		contentPane.add(lblHabitaciones);
		
		JList list = new JList();
		DefaultListModel modelo = new DefaultListModel();
		ArrayList <Habitacion>listaAux=principal.AperturaArchivoHabitacion();
		for(Habitacion aux:listaAux)
		{
			modelo.addElement(aux.numero);
		}
		list.setBounds(130, 42, 143, 158);
		contentPane.add(list);
		
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero=Integer.parseInt(list.getSelectedValue().toString());
				ArrayList<Habitacion>lista=principal.AperturaArchivoHabitacion();
				MostrarHabitacion nuevo=new MostrarHabitacion(lista.get(numero));
				nuevo.setVisible(true);
				
				
			}
		});
		btnVer.setBounds(153, 200, 89, 23);
		contentPane.add(btnVer);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(153, 234, 89, 23);
		contentPane.add(btnSalir);
	}

}
