import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Boton5 extends JButton implements ActionListener{

	
	Boton5(){
		
		super("--De siete piezas--");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clickeado el boton5");
		
		
	}
}
