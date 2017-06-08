package Paquete;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements Serializable //Creacion clase ventana que llama al JFrame.
{
	
	public Ventana()
	{
		super("Ventana");//Asigna nombre a la ventana llamando al constructor de JFrame.
		setSize(800, 500);//Asigna tamaño.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Asigna accion de cierre, osea cuando se cierre la ventana.
	//	setExtendedState(JFrame.MAXIMIZED_BOTH);//Hacer que inicie maximizado.
		
		Container cp = getContentPane();//Crea el contenedor.
		cp.setLayout(new FlowLayout());//Hace algo con el contenedor.
		
		JLabel etiqueta = new JLabel("Nombre de Usuario: ");//Crea etiqueta y le asigna nombre.
		JLabel etiqueta2 = new JLabel("Contraseña: ");
		JButton bAceptar=new JButton("Aceptar");
		JButton bCrearCuenta = new JButton("Saludar");//Crea boton y le asigna un texto.
		JTextField texto = new JTextField(50);//Crea texto y le asigna tamaño.
		
		cp.add(etiqueta);//Agrega etiqueta al contenedor.
		cp.add(etiqueta2);
		cp.add(bAceptar);
		cp.add(bCrearCuenta);
		cp.add(texto);
		
		
		//cp.add(texto);//Agrega texto al contenedor.
		//cp.add(boton);//Agrega boton al contenedor.
		/*
		boton.addActionListener(new ActionListener()//Se le agrega una accion al pulsar el boton.
				
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Accion que se produce cuando se apreta el boton.
				
			}
		});*/
	}
}
