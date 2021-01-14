package gui;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import specificObservers.*;
import specificSubjects.*;

public class Frame extends JFrame {

    private PesoColombiano pesoCOP;
    private JLabel LblCOP;
    private JTextField TxtFldCOP;
    private ArrayList<Panel> arregloPaneles = new ArrayList<>();
    private String font = "Montserrat";

    public Frame() {
        setLayout(null);
        setTitle("Tasas de cambio COP");
        setSize(635, 530);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
        initListeners();
        setVisible(true);
    }

    public void initComponents() {
        pesoCOP = new PesoColombiano();

        arregloPaneles.add(new Panel(Dolar.getInstance(pesoCOP)));
        arregloPaneles.get(0).setLocation(5, 5);
        add(arregloPaneles.get(0));

        arregloPaneles.add(new Panel(Euro.getInstance(pesoCOP)));
        arregloPaneles.get(1).setLocation(210, 5);
        add(arregloPaneles.get(1));

        arregloPaneles.add(new Panel(Franco.getInstance(pesoCOP)));
        arregloPaneles.get(2).setLocation(415, 5);
        add(arregloPaneles.get(2));

        arregloPaneles.add(new Panel(PesoArgentino.getInstance(pesoCOP)));
        arregloPaneles.get(3).setLocation(5, 155);
        add(arregloPaneles.get(3));

        arregloPaneles.add(new Panel(PesoChileno.getInstance(pesoCOP)));
        arregloPaneles.get(4).setLocation(210, 155);
        add(arregloPaneles.get(4));

        arregloPaneles.add(new Panel(PesoMexicano.getInstance(pesoCOP)));
        arregloPaneles.get(5).setLocation(415, 155);
        add(arregloPaneles.get(5));

        arregloPaneles.add(new Panel(Real.getInstance(pesoCOP)));
        arregloPaneles.get(6).setLocation(5, 305);
        add(arregloPaneles.get(6));

        arregloPaneles.add(new Panel(Yen.getInstance(pesoCOP)));
        arregloPaneles.get(7).setLocation(210, 305);
        add(arregloPaneles.get(7));

        arregloPaneles.add(new Panel(Yuan.getInstance(pesoCOP)));
        arregloPaneles.get(8).setLocation(415, 305);
        add(arregloPaneles.get(8));

        LblCOP = new JLabel("Valor en pesos colombianos");
        LblCOP.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        LblCOP.setHorizontalAlignment(JLabel.CENTER);
        LblCOP.setSize(200, 30);
        LblCOP.setLocation(5, 455);
        LblCOP.setFont(new Font(font,Font.PLAIN,13));
        add(LblCOP);

        TxtFldCOP = new JTextField();
        TxtFldCOP.setHorizontalAlignment(JTextField.CENTER);
        TxtFldCOP.setSize(405, 30);
        TxtFldCOP.setLocation(210, 455);
        add(TxtFldCOP);

    }

    public void initListeners() {
        TxtFldCOP.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                try {
                    String texto = TxtFldCOP.getText();
                    double valor = Double.valueOf(texto);
                    pesoCOP.setValorConversion(valor);
                    for (int i = 0; i < arregloPaneles.size(); i++) {
                        if (!arregloPaneles.get(i).getBtnSubscribe().isEnabled()) {
                            arregloPaneles.get(i).actualizarLabel();
                        }
                    }
                } catch (NumberFormatException ae) {
                   
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

}
