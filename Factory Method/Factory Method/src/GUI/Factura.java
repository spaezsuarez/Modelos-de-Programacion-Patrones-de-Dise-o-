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

        int Total = ((arrBaguette.length * 1500)
                + (arrCoco.length * 3000)
                + (arrIntegral.length * 2000)
                + (arrRollos.length * 3500));
        total.setText("Total: $" + Total);
        componentes.setLayout(new GridLayout(0, 1));

        for (a = 0; a < arrBaguette.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arrBaguette[a].getClass().getSimpleName()) + " x $" + Math.round(arrBaguette[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
        for (a = 0; a < arrCoco.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arrCoco[a].getClass().getSimpleName()) + " x $" + Math.round(arrCoco[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
        for (a = 0; a < arrIntegral.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arrIntegral[a].getClass().getSimpleName()) + " x $" + Math.round(arrIntegral[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
        for (a = 0; a < arrRollos.length; a++) {
            JLabel labelNuevo = new JLabel(String.valueOf(arrRollos[a].getClass().getSimpleName()) + " x $" + Math.round(arrRollos[a].getPrecio()));
            labelNuevo.setBorder(BorderFactory.createLineBorder(Color.black));
            labelNuevo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            componentes.add(labelNuevo);
        }
    }
}
