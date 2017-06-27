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

public class MostrarPasajeros extends JFrame {

	Principal principal=new Principal();
	private JPanel contentPane;
	public MostrarPasajeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPasajeros = new JLabel("Pasajeros");
		lblPasajeros.setBounds(181, 0, 172, 14);
		contentPane.add(lblPasajeros);
		
		JList list = new JList();
		DefaultListModel modelo = new DefaultListModel();
		ArrayList <Pasajero>listaAux=principal.AperturaArchivoPasajeros();
		for(Pasajero aux:listaAux)
		{
			modelo.addElement(aux.getNombre());
		}
		list.setBounds(146, 30, 145, 129);
		contentPane.add(list);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre= String.valueOf(list.getSelectedIndex());
				ArrayList<Pasajero>lista=principal.AperturaArchivoPasajeros();
				for(Pasajero aux:lista)
				{
					if(aux.getNombre()==nombre)
					{
						MostrarPasajero nuevo=new MostrarPasajero(aux);
						nuevo.setVisible(true);
					}
				}
				
				
			}
		});
		btnMostrar.setBounds(168, 170, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(168, 210, 89, 23);
		contentPane.add(btnSalir);
	}

}
