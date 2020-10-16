package gui;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import ProductosConcretos.*;

public class Factura extends JFrame {

    private PanBaguette[] arrBaguette;
    private PanRollo[] arrRollos;
    private PanIntegral[] arrIntegral;
    private PanCoco[] arrCoco;
    private JLabel total;
    private JPanel componentes = new JPanel();
    JScrollPane jsp = new JScrollPane(componentes);

    public void setArregloBaguette(PanBaguette[] arrBaguetteRef) {
        this.arrBaguette = new PanBaguette[arrBaguetteRef.length];
        for (int i = 0; i < arrBaguetteRef.length; i++) {
            arrBaguette[i] = arrBaguetteRef[i];
        }
    }

    public void setArregloCoco(PanCoco[] arrCocoRef) {
        this.arrCoco = new PanCoco[arrCocoRef.length];
        for (int i = 0; i < arrCocoRef.length; i++) {
            arrCoco[i] = arrCocoRef[i];
        }
    }

    public void setArregloRollo(PanRollo[] arrRolloRef) {
        this.arrRollos = new PanRollo[arrRolloRef.length];
        for (int i = 0; i < arrRolloRef.length; i++) {
            arrRollos[i] = arrRolloRef[i];
        }
    }

    public void setArregloIntegral(PanIntegral[] arrIntegralRef) {
        this.arrIntegral = new PanIntegral[arrIntegralRef.length];
        for (int i = 0; i < arrIntegralRef.length; i++) {
            arrIntegral[i] = arrIntegralRef[i];
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

//        int Total = ((arregloBrownie.length * 2500)
//                + (arregloGalleta.length * 1500)
//                + (arregloBatido.length * 3000)
//                + (arregloHelado.length * 2000));
//        total.setText("Total: $" + Total);
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
