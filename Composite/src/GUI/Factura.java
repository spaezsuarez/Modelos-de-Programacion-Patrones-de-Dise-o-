package GUI;

//Elementos Graficos
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

//Decoradores
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

import java.util.ArrayList;

//Logica
import models.Combo;

public class Factura extends JFrame {

    private final int ANCHO, ALTO;
    private final JPanel panel;
    private final JScrollPane jsp;
    private final JLabel total;

    public Factura() {
        ANCHO = 235;
        ALTO = 375;

        panel = new JPanel();
        total = new JLabel();
        jsp = new JScrollPane(panel);

    }

    public void initElements(Combo pedido,ArrayList<JLabel> elementos) {

        panel.setLayout(new GridLayout(0, 1));

        int Total = 0;

        for (int i = 0; i < pedido.getProductos().size(); i++) {
            Total += pedido.getProductos().get(i).calcularPrecio();
            panel.add(elementos.get(i));
        }
        
        jsp.setSize(200, 275);
        jsp.setLocation(10, 50);
        jsp.setBorder(BorderFactory.createLineBorder(Color.black));
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(jsp);
        
        total.setSize(200, 35);
        total.setLocation(10, 10);
        total.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        total.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        total.setBorder(BorderFactory.createLineBorder(Color.black));
        total.setText("Total: $" + Total);
        add(total);

    }

    public void initTemplate(Combo pedido,ArrayList<JLabel> elementos) {
        setLayout(null);
        setTitle("Factura");
        setSize(new Dimension(ANCHO, ALTO));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        initElements(pedido,elementos);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
