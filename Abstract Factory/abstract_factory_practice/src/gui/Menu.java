package gui;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {
    
    private JLabel lBrownie,lGalleta,lMalteada,lHelado,lFresa,lChocolate;
    private String rutaBrownie,rutaHelado,rutaMalteada,rutaGalleta;

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
        
        
        String rutaFresa = new String("src/resources/fresa_1.png");;
        ImageIcon iconoFresa = new ImageIcon(rutaFresa);
        Image imagenFresa = iconoFresa.getImage();
        Image nuevaImagenFresa = imagenFresa.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon imagenFinalFresa = new ImageIcon(nuevaImagenFresa);
        
        lFresa = new JLabel("Sabor Fresa",imagenFinalFresa,JLabel.CENTER);
        lFresa.setSize(new Dimension(150,60));
        lFresa.setLocation(20, 150);
        add(lFresa);
        
        
        String rutaChocolate = new String("src/resources/chocolate.png");;
        ImageIcon iconoChocolate = new ImageIcon(rutaChocolate);
        Image imagenChocolate = iconoChocolate.getImage();
        Image nuevaImagenChocolate = imagenChocolate.getScaledInstance(60,60, Image.SCALE_SMOOTH);
        ImageIcon imagenFinalChocolate = new ImageIcon(nuevaImagenChocolate);
        
        lChocolate = new JLabel("Sabor Chocolate",imagenFinalChocolate,JLabel.CENTER);
        lChocolate.setSize(new Dimension(165,60));
        lChocolate.setLocation(20, 230);
        add(lChocolate);
       
        lBrownie = new JLabel();
        lBrownie.setSize(new Dimension(80,80));
        lBrownie.setLocation(200, 20);
        
        rutaBrownie = new String("src/resources/duende.png");
        ImageIcon instr = new ImageIcon(rutaBrownie);
        Image imginstr = instr.getImage();
        Image nuevaimagen = imginstr.getScaledInstance(lBrownie.getWidth(), lBrownie.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaimagen);
        lBrownie.setIcon(imagen);
        add(lBrownie);
 
        
        lGalleta = new JLabel();
        lGalleta.setSize(new Dimension(80,80));
        lGalleta.setLocation(300, 20);
        
        rutaGalleta = new String("src/resources/galleta.png");
        ImageIcon iconoGalleta = new ImageIcon(rutaGalleta);
        Image imagenGalleta = iconoGalleta.getImage();
        Image nuevaimagenGalleta = imagenGalleta.getScaledInstance(lGalleta.getWidth(), lGalleta.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalGalleta = new ImageIcon(nuevaimagenGalleta);
        lGalleta.setIcon(imagenFinalGalleta);
        add(lGalleta);
        
        lMalteada = new JLabel();
        lMalteada.setSize(new Dimension(80,80));
        lMalteada.setLocation(400, 20);
        
        rutaMalteada = new String("src/resources/malteada.png");
        ImageIcon iconoMalteada = new ImageIcon(rutaMalteada);
        Image imagenMalteada = iconoMalteada.getImage();
        Image nuevaimagenMalteada = imagenMalteada.getScaledInstance(lMalteada.getWidth(), lMalteada.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalMalteada = new ImageIcon(nuevaimagenMalteada);
        lMalteada.setIcon(imagenFinalMalteada);
        add(lMalteada);
        
        lHelado = new JLabel();
        lHelado.setSize(new Dimension(80,80));
        lHelado.setLocation(500, 20);
        
        rutaHelado = new String("src/resources/helado.png");
        ImageIcon iconoHelado = new ImageIcon(rutaHelado);
        Image imagenHelado = iconoHelado.getImage();
        Image nuevaimagenHelado = imagenHelado.getScaledInstance(lHelado.getWidth(), lHelado.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalHelado = new ImageIcon(nuevaimagenHelado);
        lHelado.setIcon(imagenFinalHelado);
        add(lHelado);
        
        
    }

}
