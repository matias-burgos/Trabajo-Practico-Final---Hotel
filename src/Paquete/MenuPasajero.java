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
import java.awt.event.ActionEvent;

public class MenuPasajero extends JFrame {

	private JPanel contentPane;
	private JTextField txtBienvenido;

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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(104, 60, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(104, 118, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txtBienvenido = new JTextField();
		txtBienvenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		txtBienvenido.setFont(new Font("Poor Richard", Font.BOLD, 17));
		txtBienvenido.setText("Bienvenido ");
		txtBienvenido.setBounds(139, 0, 95, 31);
		contentPane.add(txtBienvenido);
		txtBienvenido.setColumns(10);
		
		JEditorPane dtrpnBienvenido = new JEditorPane();
		dtrpnBienvenido.setText("Bienvenido");
		dtrpnBienvenido.setBounds(258, 0, 106, 20);
		contentPane.add(dtrpnBienvenido);
	}
}
