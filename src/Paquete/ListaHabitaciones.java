package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class ListaHabitaciones extends JFrame {

	private JPanel contentPane;
	int seleccionada;
	public ListaHabitaciones(ArrayList<Habitacion>disponibles, FEcha desde, FEcha hasta)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		DefaultListModel modelo = new DefaultListModel();
		for(Habitacion aux:disponibles)
		{
			modelo.addElement(aux.getNumero());
		}
		list.setModel(modelo);
		list.setBounds(145, 46, 147, 152);
		contentPane.add(list);
		
		JLabel lblSeleccionLaHabitacion = new JLabel("Seleccion la habitacion que desea reservar");
		lblSeleccionLaHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccionLaHabitacion.setBounds(97, 11, 239, 14);
		contentPane.add(lblSeleccionLaHabitacion);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

					
					if(seleccionada==0)
					{
						seleccionada=Integer.parseInt(list.getSelectedValue().toString());
						JOptionPane.showMessageDialog(btnAceptar, "Debe seleccionar algun hotel");
						
					}
					else{
						InfoPersona nuevo=new InfoPersona(seleccionada, desde, hasta);
						nuevo.setVisible(true);
						dispose();
					}
						
			}
		});
		btnAceptar.setBounds(170, 198, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(170, 228, 89, 23);
		contentPane.add(btnCancelar);
	}
}
