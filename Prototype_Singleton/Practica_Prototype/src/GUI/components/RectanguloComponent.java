package GUI.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class RectanguloComponent extends Component {
    
    public RectanguloComponent(){
        super();
        setSize(new Dimension(ancho,alto));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.darkGray);
        g.fillRect(0, 100, 300, 100);
        
    }
    
}
