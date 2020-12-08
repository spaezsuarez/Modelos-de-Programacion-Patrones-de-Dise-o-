package gui;

import abstraction.Observer;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {

    private Observer observer;
    private JLabel LblMoneda, LblMonedaConv;
    private JButton BtnSubscribe, BtnUnsubscribe;

    public Panel(Observer observer) {
        setLayout(null);
        setSize(200, 145);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.observer = observer;
        setVisible(true);
        initComponents();
        initListeners();
    }

    public void initComponents() {
        LblMoneda = new JLabel(observer.getClass().getSimpleName());
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
        BtnUnsubscribe.setFocusable(false);
        add(BtnUnsubscribe);

    }

    public void initListeners() {

        BtnSubscribe.addActionListener((ae) -> {
            observer.getSubject().agregarObservador(observer);
            BtnUnsubscribe.setEnabled(true);
            BtnSubscribe.setEnabled(false);
        });

        BtnUnsubscribe.addActionListener((ae) -> {
            observer.getSubject().eliminarObservador(observer);
            BtnSubscribe.setEnabled(true);
            BtnUnsubscribe.setEnabled(false);
        });

    }

    public JButton getBtnSubscribe() {
        return BtnSubscribe;
    }
    
    public void actualizarLabel(){
        LblMonedaConv.setText(String.valueOf(observer.getValorCambio()));
    }

}
