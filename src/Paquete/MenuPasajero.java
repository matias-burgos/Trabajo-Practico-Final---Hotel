package Paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class MenuPasajero extends JFrame implements Serializable{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPasajero frame = new MenuPasajero();
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
	public MenuPasajero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JButton btnNewButton = new JButton("Realizar reserva");
		btnNewButton.setBounds(250, 31, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(126, 31, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblHistorialDeHabitaciones = new JLabel("Historial de habitaciones");
		lblHistorialDeHabitaciones.setBounds(10, 141, 124, 14);
		contentPane.add(lblHistorialDeHabitaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(115, 166, 19, 85);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setViewportView(scrollBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 165, 124, 86);
		contentPane.add(textArea);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnSalir.setBounds(345, 239, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnOpcioonesDeUsuario = new JButton("Configuracion de cuenta");
		btnOpcioonesDeUsuario.setBounds(283, 215, 151, 23);
		contentPane.add(btnOpcioonesDeUsuario);
		
		JLabel lblNewLabel = new JLabel("Imagen de usuario");
		lblNewLabel.setBounds(0, 0, 89, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(126, 0, 141, 14);
		contentPane.add(lblBienvenido);
	}
}
