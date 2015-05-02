import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Boton3 extends JButton implements ActionListener{

	
	Boton3(){
		
		super("--De cinco piezas--");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clickeado el boton3");
		
		
	}
}
