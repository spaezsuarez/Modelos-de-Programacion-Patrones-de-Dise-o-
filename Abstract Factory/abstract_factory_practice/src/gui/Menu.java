package gui;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {
    
    private JLabel lBrownie,lGalleta,lMalteada,lHelado;
    private ImageIcon iconBrownie,iconGalleta,iconMalteada,iconHelado;

    public Menu() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setSize(new Dimension(800, 600));
        setSize(new Dimension(800, 600));
        
        initElements();
        
        setLocationRelativeTo(null);
        setVisible(true);
        

    }
    
    public void initElements(){
        iconBrownie = new ImageIcon("../resources/duende.svg");
        iconGalleta = new ImageIcon("../resources/galleta.svg");
        iconMalteada = new ImageIcon("../resources/malteada.svg");
        iconHelado = new ImageIcon("../resources/helado.svg");
        
        lBrownie = new JLabel(iconBrownie);
        lBrownie.setSize(new Dimension(40,40));
        lBrownie.setLocation(20, 20);
        add(lBrownie);
        
        lGalleta = new JLabel(iconGalleta);
        lGalleta.setSize(new Dimension(40,40));
        lGalleta.setLocation(70, 20);
        add(lGalleta);
        
        lMalteada = new JLabel(iconMalteada);
        lMalteada.setSize(new Dimension(40,40));
        lMalteada.setLocation(120, 20);
        add(lMalteada);
        
        lHelado = new JLabel(iconHelado);
        lHelado.setSize(new Dimension(40,40));
        lHelado.setLocation(170, 20);
        add(lHelado);
        
        
    }

}
