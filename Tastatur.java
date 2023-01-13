 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

 
public class Tastatur implements KeyListener, ActionListener {
	
	public String letzteTaste = "";
 
    public Tastatur() {

    }
 
    @Override
    public void keyTyped(KeyEvent ke) {
    }
 
    @Override
    public void keyPressed(KeyEvent ke) {
    	letzteTaste = ke.getKeyChar() + "";
    	System.out.println(letzteTaste);
    }
 
    @Override
    public void keyReleased(KeyEvent ke) {

    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {

    }
 
}