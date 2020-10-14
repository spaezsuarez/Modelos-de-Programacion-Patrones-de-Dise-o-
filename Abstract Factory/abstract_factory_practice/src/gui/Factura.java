package gui;

import abstraccion.Batido;
import abstraccion.Brownie;
import abstraccion.Galleta;
import abstraccion.Helado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import modelos.*;

public class Factura extends JFrame {

    private JLabel total;
    private JPanel componentes = new JPanel();
    JScrollPane jsp = new JScrollPane(componentes);

    private Helado[] arregloHelado;
    private Batido[] arregloBatido;
    private Galleta[] arregloGalleta;
    private Brownie[] arregloBrownie;

    public void setArregloBrownie(BrownieChocolate[] arregloChocolate, BrownieFresa[] arregloFresa) {
        this.arregloBrownie = new Brownie[arregloChocolate.length + arregloFresa.length];
        for (int i = 0; i < arregloChocolate.length; i++) {
            arregloBrownie[i] = arregloChocolate[i];
        }
        for (int i = 0; i < arregloFresa.length; i++) {
            arregloBrownie[arregloChocolate.length + i] = arregloFresa[i];
        }
    }

    public void setArregloHelado(HeladoChocolate[] arregloChocolate, HeladoFresa[] arregloFresa) {
        this.arregloHelado = new Helado[arregloChocolate.length + arregloFresa.length];
        for (int i = 0; i < arregloChocolate.length; i++) {
            arregloHelado[i] = arregloChocolate[i];
        }
        for (int i = 0; i < arregloFresa.length; i++) {
            arregloHelado[arregloChocolate.length + i] = arregloFresa[i];
        }
    }

    public void setArregloBatido(BatidoChocolate[] arregloChocolate, BatidoFresa[] arregloFresa) {
        this.arregloBatido = new Batido[arregloChocolate.length + arregloFresa.length];
        for (int i = 0; i < arregloChocolate.length; i++) {
            arregloBatido[i] = arregloChocolate[i];
        }
        for (int i = 0; i < arregloFresa.length; i++) {
            arregloBatido[arregloChocolate.length + i] = arregloFresa[i];
        }
    }

    public void setArregloGalleta(GalletaChocolate[] arregloChocolate, GalletaFresa[] arregloFresa) {
        this.arregloGalleta = new Galleta[arregloChocolate.length + arregloFresa.length];
        for (int i = 0; i < arregloChocolate.length; i++) {
            arregloGalleta[i] = arregloChocolate[i];
        }
        for (int i = 0; i < arregloFresa.length; i++) {
            arregloGalleta[arregloChocolate.length + i] = arregloFresa[i];
        }
    }

    public Factura() {
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setSize(new Dimension(235, 375));
        setSize(new Dimension(235, 375));

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initComponents() {
        setTitle("Factura");

        total = new JLabel();
        total.setSize(200, 35);
        total.setLocation(10, 10);
        total.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        total.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        total.setBorder(BorderFactory.createLineBorder(Color.black));

        add(total);

        jsp.setSize(200, 275);
        jsp.setLocation(10, 50);
        jsp.setBorder(BorderFactory.createLineBorder(Color.black));
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(jsp);

        int a;

        int Total = ((arregloBrownie.length * 2500)
                + (arregloGalleta.length * 1500)
                + (arregloBatido.length * 3000)
                + (arregloHelado.length * 2000));

        total.setText("Total: $" + Total);

        componentes.setLayout(new GridLayout(0, 1));

        for (a = 0; a < arregloBrownie.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arregloBrownie[a].getClass().getSimpleName()) + " x $" + Math.round(arregloBrownie[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
        for (a = 0; a < arregloGalleta.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arregloGalleta[a].getClass().getSimpleName()) + " x $" + Math.round(arregloGalleta[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
        for (a = 0; a < arregloBatido.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arregloBatido[a].getClass().getSimpleName()) + " x $" + Math.round(arregloBatido[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
        for (a = 0; a < arregloHelado.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arregloHelado[a].getClass().getSimpleName()) + " x $" + Math.round(arregloHelado[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
    }
}
