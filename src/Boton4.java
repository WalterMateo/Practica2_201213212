import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Boton4 extends JButton implements ActionListener{

	
	Boton4(){
		
		super("--De seis piezas--");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clickeado el boton4");
		
		
	}
}
