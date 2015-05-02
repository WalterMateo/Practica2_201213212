import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Boton6 extends JButton implements ActionListener{

	
	Boton6(){
		
		super("--De ocho piezas--");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clickeado el boton6");
		
		
	}
}
