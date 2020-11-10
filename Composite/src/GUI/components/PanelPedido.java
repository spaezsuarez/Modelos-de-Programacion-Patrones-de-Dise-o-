package GUI.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.util.ArrayList;


public class PanelPedido extends JPanel {
    
    private ArrayList<JLabel> pedidos;
    private final int ANCHO,ALTO;
    
    public PanelPedido(){
        ANCHO = 250;
        ALTO = 400;

        pedidos = new ArrayList<>();
        setLayout(new GridLayout(0,1));
        setPreferredSize(new Dimension(ANCHO,ALTO));
        setSize(new Dimension(ANCHO,ALTO));
    }

    public int getANCHO() {
        return ANCHO;
    }

    public int getALTO() {
        return ALTO;
    }

    public ArrayList<JLabel> getPedidos() {
        return pedidos;
    }
    
    public void addPedido(String texto){
        JLabel element = new JLabel(texto);
        element.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        element.setPreferredSize(new Dimension(100,20));
        element.setSize(new Dimension(100,20));
        element.setBorder(BorderFactory.createLineBorder(Color.black));
        element.setHorizontalAlignment(JLabel.CENTER);
        pedidos.add(element);
    }
    
    public void render(){
        removeAll();
        
        for(int i = 0; i < pedidos.size(); i++ ){
            add(pedidos.get(i));
        }
        repaint();
    }
    
}
