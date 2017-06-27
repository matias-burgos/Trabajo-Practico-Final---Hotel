package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class MostrarHabitacion extends JFrame {

	private JPanel cantHabitantes;

	public MostrarHabitacion(Habitacion seleccionada) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		cantHabitantes = new JPanel();
		cantHabitantes.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cantHabitantes);
		cantHabitantes.setLayout(null);
		
		JLabel lblInformacionDeLa = new JLabel("Informacion de la habitacion");
		lblInformacionDeLa.setBounds(144, 11, 172, 14);
		cantHabitantes.add(lblInformacionDeLa);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setToolTipText("");
		lblPiso.setBounds(39, 43, 46, 14);
		cantHabitantes.add(lblPiso);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(39, 105, 64, 14);
		cantHabitantes.add(lblNumero);
		
		JLabel lblOcupada = new JLabel("Ocupada");
		lblOcupada.setBounds(39, 155, 64, 14);
		cantHabitantes.add(lblOcupada);
		
		JLabel lblReservada = new JLabel("Reservada");
		lblReservada.setBounds(143, 155, 100, 14);
		cantHabitantes.add(lblReservada);
		
		JLabel lblCantidadHabitantesMx = new JLabel("Cantidad Habitantes max");
		lblCantidadHabitantesMx.setBounds(218, 43, 147, 14);
		cantHabitantes.add(lblCantidadHabitantesMx);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(262, 228, 89, 23);
		cantHabitantes.add(btnSalir);
		
		JEditorPane piso = new JEditorPane();
		piso.setText( String.valueOf(seleccionada.getPiso()));
		piso.setEditable(false);
		
		piso.setBounds(72, 43, 64, 20);
		cantHabitantes.add(piso);
		
		JEditorPane numero = new JEditorPane();
		numero.setText( String.valueOf(seleccionada.getNumero()));
		numero.setEditable(false);
		numero.setBounds(85, 105, 72, 20);
		cantHabitantes.add(numero);
		
		JEditorPane ocupada = new JEditorPane();
		ocupada.setText( String.valueOf(seleccionada.getOcup()));
		ocupada.setEditable(false);
		ocupada.setBounds(28, 180, 64, 20);
		cantHabitantes.add(ocupada);
		
		JEditorPane reservada = new JEditorPane();
		reservada.setText( String.valueOf(seleccionada.getReserv()));
		reservada.setEditable(false);
		reservada.setBounds(139, 180, 64, 20);
		cantHabitantes.add(reservada);
		
		JEditorPane cantHAbitantes = new JEditorPane();
		cantHAbitantes.setText( String.valueOf(seleccionada.getMaxHabi()));
		cantHAbitantes.setEditable(false);
		cantHAbitantes.setBounds(228, 68, 64, 20);
		cantHabitantes.add(cantHAbitantes);
	}
}
