import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Boton1 extends JButton implements ActionListener{

	
	Boton1(){
		
		super("--De tres piezas--");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clickeado el boton1");
		accionboton1 ventana = new accionboton1();
		
	}
}
class accionboton1 extends JFrame{
	
	accionboton1(){
	
	setTitle("Torre de tres piezas");
	setSize(500,500);
	setLocationRelativeTo(null);
	setVisible(true);
	}
}