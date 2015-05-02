import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Frame extends JFrame{
	
	Frame(){
	setTitle("Bienvenido al juego Torre de Hanoi");
	setBounds(0,0,200,200);
	setVisible(true);
	Container contenido_en_frame = getContentPane();
	
	contenido_en_frame.setLayout(new GridLayout(7,1));
	JLabel texto1 = new JLabel("    De cuantas piezas desea su torre de Hanoi:    ");
	contenido_en_frame.add(texto1);
	Boton1 boton1 = new Boton1();
	boton1.addActionListener(boton1);
	add(boton1);
	Boton2 boton2 = new Boton2();
	boton2.addActionListener(boton2);
	add(boton2);
	Boton3 boton3 = new Boton3();
	boton3.addActionListener(boton3);
	add(boton3);
	Boton4 boton4 = new Boton4();
	boton4.addActionListener(boton4);
	add(boton4);
	Boton5 boton5 = new Boton5();
	boton5.addActionListener(boton5);
	add(boton5);
	Boton6 boton6 = new Boton6();
	boton6.addActionListener(boton6);
	add(boton6);
	
	 
	pack();
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	
		
	}
		
	}

