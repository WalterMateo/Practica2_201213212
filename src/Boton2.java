import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Boton2 extends JButton implements ActionListener{

	
	Boton2(){
		
		super("--De cuatro piezas--");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clickeado el boton2");
		
		
	}
}
