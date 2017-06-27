package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog.ModalExclusionType;

public class CrearReserva extends JFrame implements Serializable{

	private JPanel contentPane;
	ArrayList<Habitacion>disponibles=new ArrayList<>();
	public CrearReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancerlar = new JButton("Cancerlar");
		btnCancerlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancerlar.setBounds(333, 238, 101, 23);
		contentPane.add(btnCancerlar);
		
		JLabel lblIngreseLaInformacion = new JLabel("Ingrese la informacion solicitada");
		lblIngreseLaInformacion.setBounds(10, 11, 164, 14);
		contentPane.add(lblIngreseLaInformacion);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(10, 57, 60, 14);
		contentPane.add(lblPiso);
		
		JLabel lblPeriodoDeOcupacion = new JLabel("Periodo de ocupacion");
		lblPeriodoDeOcupacion.setBounds(10, 113, 124, 14);
		contentPane.add(lblPeriodoDeOcupacion);
		
		JComboBox diaA = new JComboBox();
		diaA.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		diaA.setBounds(10, 156, 37, 20);
		contentPane.add(diaA);
		
		JComboBox mesA = new JComboBox();
		mesA.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		mesA.setBounds(57, 156, 37, 20);
		contentPane.add(mesA);
		
		JComboBox añoA = new JComboBox();
		añoA.setModel(new DefaultComboBoxModel(new String[] {"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		añoA.setBounds(104, 156, 60, 20);
		contentPane.add(añoA);
		
		JLabel label = new JLabel("-");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(44, 159, 15, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("-");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(89, 159, 21, 14);
		contentPane.add(label_1);
		
		JLabel lblDesde = new JLabel("Desde");
		lblDesde.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesde.setBounds(48, 138, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel label_2 = new JLabel("/");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(168, 156, 15, 20);
		contentPane.add(label_2);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setHorizontalAlignment(SwingConstants.CENTER);
		lblHasta.setBounds(223, 138, 46, 14);
		contentPane.add(lblHasta);
		
		JLabel lblCantidadDeHabitantes = new JLabel("Cantidad de habitantes");
		lblCantidadDeHabitantes.setBounds(10, 187, 124, 14);
		contentPane.add(lblCantidadDeHabitantes);
		
		JComboBox cantHabitantes = new JComboBox();
		cantHabitantes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cantHabitantes.setToolTipText("");
		cantHabitantes.setBounds(10, 212, 84, 23);
		contentPane.add(cantHabitantes);
		
		JComboBox diaB = new JComboBox();
		diaB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		diaB.setBounds(185, 156, 37, 20);
		contentPane.add(diaB);
		
		JComboBox mesB = new JComboBox();
		mesB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12"}));
		mesB.setBounds(232, 156, 37, 20);
		contentPane.add(mesB);
		
		JComboBox añoB = new JComboBox();
		añoB.setModel(new DefaultComboBoxModel(new String[] {"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		añoB.setBounds(279, 156, 60, 20);
		contentPane.add(añoB);
		
		JButton btnAceptar = new JButton("Aceptar");
		Reserva nueva=new Reserva();
		
		JComboBox piso = new JComboBox();
		piso.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		piso.setBounds(10, 82, 100, 20);
		contentPane.add(piso);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FEcha desde=new FEcha(diaA.getSelectedIndex(), mesA.getSelectedIndex(), añoA.getSelectedIndex());
				FEcha hasta=new FEcha(diaB.getSelectedIndex(), mesB.getSelectedIndex(), añoB.getSelectedIndex());
				disponibles=nueva.BuscarHabitacion(cantHabitantes.getSelectedIndex(), desde, hasta, Integer.parseInt(piso.getSelectedItem().toString()));
				if(disponibles.listIterator()!=null)
				{
					ListaHabitaciones nueva=new ListaHabitaciones(disponibles, desde, hasta);
					nueva.setVisible(true);
					dispose();
				}
				
			}
		});
		btnAceptar.setBounds(335, 212, 89, 23);
		contentPane.add(btnAceptar);
		
		
	}
}
