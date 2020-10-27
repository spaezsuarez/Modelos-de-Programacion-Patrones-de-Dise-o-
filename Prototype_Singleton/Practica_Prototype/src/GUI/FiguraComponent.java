package GUI;

//Elementos Graficos
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
//Elementos Decorativos
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Font;

//Componentes
import GUI.components.*;

//Logica
import Figuras.*;
import Interface.Figuras_geometricas;

public class FiguraComponent extends JFrame implements ActionListener {
    
    private final int ancho,alto;
    private JButton btnClonar;
    private Component componente;
    private Figuras_geometricas figura;
    private JLabel stats;
    
    public FiguraComponent(String nombreFigura){
        ancho = 600;
        alto = 800;
        
        setTitle(nombreFigura);
        
        if(nombreFigura.equalsIgnoreCase("Circulo")){
            componente = new CirculoComponent();
            figura = Circulo.getInstance();
            figura.setNombre(nombreFigura);
        }else{
            componente = new RectanguloComponent();
            figura = Rectangulo.getInstance();
            figura.setNombre(nombreFigura);
        }
        
        btnClonar = new JButton("Clonar");
        stats = new JLabel();
        
        
    }
    
    public void initTemplate(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(ancho,alto));
        setResizable(false);
        setMaximumSize(new Dimension(ancho,alto));
        setMinimumSize(new Dimension(ancho,alto));
        
        initElements();
      
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public void initElements(){
        btnClonar.setSize(new Dimension(200,40));
        btnClonar.setLocation((this.getWidth()-btnClonar.getWidth())/2, 600);
        btnClonar.setFont(new Font("Arial",Font.BOLD,20));
        btnClonar.addActionListener(this);
        add(btnClonar);
       
        componente.setLocation(150, 0);
        componente.repaint();
        add(componente);
        
        stats.setSize(new Dimension(200,300));
        stats.setText(figura.toString());
        stats.setLocation((this.getWidth()-stats.getWidth())/2, 300);
        stats.setFont(new Font("Arial",Font.PLAIN,15));
        add(stats);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent event) {
      
    }
    
    
    
}
