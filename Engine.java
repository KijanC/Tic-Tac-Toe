import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 17.11.2022
 * @author 
 */

public class Engine extends JFrame {
  // Anfang Attribute
  private static JTextArea jTextArea1 = new JTextArea();
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  // Ende Attribute
  public Tastatur tastatur = new Tastatur();
  
  public Engine() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 200; 
    int frameHeight = 120;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 3;
    int y = (d.height - getSize().height) / 3;
    setLocation(x, y);
    setTitle("TIC TAK TOE");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    jTextArea1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 21));
    jTextArea1.setEditable(false);
    jTextArea1ScrollPane.setBounds(0, 0,  frameWidth, frameHeight);
    jTextArea1.setText("Leeres Fenster");
    cp.add(jTextArea1ScrollPane);
    //this.addKeyListener(new Tastatur());
    jTextArea1.addKeyListener(tastatur);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Dev
  
  
  public void setText(String a) {
	  jTextArea1.setText(a);
  }
  // Anfang Methoden
  
  /*public static void main(String[] args) {
    new Fenster();
    jTextArea1.setText("dgdsgg");
    
  }*/
  
  // end of main
  
  // Ende Methoden
} // end of class Dev
