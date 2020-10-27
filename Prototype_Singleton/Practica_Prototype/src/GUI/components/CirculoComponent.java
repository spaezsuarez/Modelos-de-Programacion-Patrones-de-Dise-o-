package GUI.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class CirculoComponent extends Component {
    
    public CirculoComponent(){
        super();
        setSize(new Dimension(ancho,alto));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.darkGray);
        g.fillOval(30, 50, 250, 250);
        
    }
    
}
