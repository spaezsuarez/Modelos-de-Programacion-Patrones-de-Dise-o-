package gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {

    private String moneda;
    private JLabel LblMoneda, LblMonedaConv;
    private JButton BtnSubscribe, BtnUnsubscribe;

    public Panel(String moneda) {
        setLayout(null);
        setSize(200, 145);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.moneda = moneda;
        setVisible(true);
        initComponents();
        initListeners();
    }

    public void initComponents() {
        LblMoneda = new JLabel(moneda);
        LblMoneda.setHorizontalAlignment(JLabel.CENTER);
        LblMoneda.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        LblMoneda.setLocation(5, 5);
        LblMoneda.setSize(190, 30);
        add(LblMoneda);

        LblMonedaConv = new JLabel("- - - - - - - -");
        LblMonedaConv.setHorizontalAlignment(JLabel.CENTER);
        LblMonedaConv.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        LblMonedaConv.setLocation(5, 40);
        LblMonedaConv.setSize(190, 30);
        add(LblMonedaConv);

        BtnSubscribe = new JButton("Subscribe");
        BtnSubscribe.setSize(130, 30);
        BtnSubscribe.setLocation((getWidth() - BtnSubscribe.getWidth()) / 2, 75);
        BtnSubscribe.setFocusable(false);
        add(BtnSubscribe);
        

        BtnUnsubscribe = new JButton("Unsubscribe");
        BtnUnsubscribe.setEnabled(false);
        BtnUnsubscribe.setSize(130, 30);
        BtnUnsubscribe.setLocation((getWidth() - BtnUnsubscribe.getWidth()) / 2, 110);
        add(BtnUnsubscribe);

    }

    public void initListeners() {

    }

}
