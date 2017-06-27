package Paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class AsignarUsuario extends JFrame implements Serializable{

	private JPanel contentPane;
	ButtonGroup grupo1 = new ButtonGroup();

	public AsignarUsuario() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneElTipo = new JLabel("Seleccione el tipo de usuario que desea crear");
		lblSeleccioneElTipo.setBounds(100, 0, 263, 14);
		contentPane.add(lblSeleccioneElTipo);
		
		JRadioButton administrador = new JRadioButton("Administrador");
		administrador.setBounds(133, 39, 109, 23);
		contentPane.add(administrador);
		grupo1.add(administrador);
		
		JRadioButton conserje = new JRadioButton("Conserje");
		conserje.setBounds(133, 87, 109, 23);
		contentPane.add(conserje);
		grupo1.add(conserje);
		
		JRadioButton pasajero = new JRadioButton("Pasajero");
		pasajero.setBounds(133, 131, 109, 23);
		contentPane.add(pasajero);
		grupo1.add(pasajero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(administrador.isSelected())
				{
					CrearCuentaAdmin nuevo=new CrearCuentaAdmin();
					nuevo.setVisible(true);
					dispose();			
				}
				if(conserje.isSelected())
				{
					CrearCuentaConserje nuevo=new CrearCuentaConserje();
					nuevo.setVisible(true);
					dispose();
				}
				if(pasajero.isSelected())
				{
					CrearCuentaPasajero nuevo=new CrearCuentaPasajero();
					nuevo.setVisible(true);
					dispose();
				}
			}
		});
		btnAceptar.setBounds(153, 182, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(153, 228, 89, 23);
		contentPane.add(btnCancelar);
	}
}
