package GUI.components;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Component extends JPanel {
    
    protected final int ancho,alto;
    
    public Component(){
        ancho = 300;
        alto = 275;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
    }
    
}
