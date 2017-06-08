package Paquete;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.io.Serializable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;

public class MenuAdministrador extends JPanel implements Serializable{

	
	public MenuAdministrador() {
		
		JLabel lblVerInformacionDe = new JLabel("Ver informacion de:");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Habitaciones\r\n");
		
		JLabel lblCrearUnaHabitacion = new JLabel("Crear una habitacion");
		
		JLabel lblEliminarUnaHabitacion = new JLabel("Eliminar una habitacion");
		
		JLabel lblCrearPasajero = new JLabel("Crear pasajero");
		
		JLabel lblCrearConserje = new JLabel("Crear conserje");
		
		JButton btnOpcionesDeLa = new JButton("Opciones de la cuenta");
		
		JButton btnNewButton = new JButton("Salir");
		
		JLabel lblBienvenidonombreDel = new JLabel("Bienvenido (nombre del usuario)");
		lblBienvenidonombreDel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 17));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnOpcionesDeLa))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(133, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEliminarUnaHabitacion)
						.addComponent(lblCrearUnaHabitacion)
						.addComponent(lblBienvenidonombreDel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCrearPasajero)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblVerInformacionDe)
									.addComponent(lblCrearConserje)))
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
					.addGap(91))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblBienvenidonombreDel)
					.addGap(58)
					.addComponent(lblCrearUnaHabitacion)
					.addGap(18)
					.addComponent(lblEliminarUnaHabitacion)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblCrearPasajero)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCrearConserje)
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVerInformacionDe)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addComponent(btnOpcionesDeLa, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
		
	}
}
