package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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

public class CrearReserva extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearReserva frame = new CrearReserva();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 82, 60, 20);
		contentPane.add(spinner);
		
		JLabel lblPeriodoDeOcupacion = new JLabel("Periodo de ocupacion");
		lblPeriodoDeOcupacion.setBounds(10, 113, 124, 14);
		contentPane.add(lblPeriodoDeOcupacion);
		
		JComboBox spinner_1 = new JComboBox();
		spinner_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		spinner_1.setBounds(10, 156, 37, 20);
		contentPane.add(spinner_1);
		
		JComboBox spinner_2 = new JComboBox();
		spinner_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		spinner_2.setBounds(57, 156, 37, 20);
		contentPane.add(spinner_2);
		
		JComboBox spinner_3 = new JComboBox();
		spinner_3.setModel(new DefaultComboBoxModel(new String[] {"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		spinner_3.setBounds(104, 156, 60, 20);
		contentPane.add(spinner_3);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(10, 212, 84, 23);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(185, 156, 37, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12"}));
		comboBox_2.setBounds(232, 156, 37, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		comboBox_3.setBounds(279, 156, 60, 20);
		contentPane.add(comboBox_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(279, 15, 145, 112);
		contentPane.add(panel);
	}
}
