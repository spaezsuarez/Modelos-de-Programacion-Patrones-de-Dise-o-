package GUI;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel_Combos extends JPanel {
    
    public Panel_Combos(LayoutManager layout) {
        setLayout(layout);
        setSize(200, 300);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
}
