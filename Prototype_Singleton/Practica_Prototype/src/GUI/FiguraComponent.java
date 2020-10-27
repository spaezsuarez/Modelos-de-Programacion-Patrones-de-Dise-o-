package GUI;

//Elementos Graficos
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

//Elementos Decorativos
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Font;

//Componentes
import GUI.components.*;


public class FiguraComponent extends JFrame implements ActionListener {
    
    private final int ancho,alto;
    private JButton btnClonar;
    private JPanel test = new JPanel();
    private Component componente;
    
    public FiguraComponent(String nombreFigura){
        ancho = 600;
        alto = 700;
        
        if(nombreFigura.equalsIgnoreCase("Circulo")){
            componente = new CirculoComponent();
        }
        
        btnClonar = new JButton("Clonar");
        
        
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
        btnClonar.setLocation((this.getWidth()-btnClonar.getWidth())/2, 550);
        btnClonar.setFont(new Font("Arial",Font.BOLD,20));
        btnClonar.addActionListener(this);
        add(btnClonar);
       
        componente.setLocation(150, 0);
        componente.repaint();
        add(componente);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent event) {
      
    }
    
    
    
}
