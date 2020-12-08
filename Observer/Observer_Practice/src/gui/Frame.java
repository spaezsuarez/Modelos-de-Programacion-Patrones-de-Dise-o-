package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame {

    private JLabel LblCOP;
    private JTextField TxtFldCOP;
    private Panel panelUSD;

    public Frame() {
        setLayout(null);
        setTitle("Tasas de cambio COP");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
        initListeners();
    }

    public void initComponents() {
        panelUSD = new Panel("EUR");
        panelUSD.setLocation(5,5);
        add(panelUSD);
    }

    public void initListeners() {

    }

}
