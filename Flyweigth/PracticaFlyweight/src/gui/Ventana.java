package gui;

//Elementos Graficos
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
//Elementos decorativos
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.SwingConstants;

//factory
import factory.FabricaDestornilladores;

public class Ventana extends JFrame implements ActionListener {

    private final int ANCHO, ALTO;
    private final JButton btn;
    private final JLabel title, textUno, textDos, textTres;
    private final JTextField inputUno, inputDos, inputTres;
    private final JComboBox seleccionTamaño;
    private FabricaDestornilladores fabrica;

    public Ventana() {
        ANCHO = 340;
        ALTO = 450;
        btn = new JButton("Seleccionar");
        title = new JLabel("Seleccione un destornillador");
        textUno = new JLabel("Tipo Punta: ");
        textDos = new JLabel("Marca: ");
        textTres = new JLabel("Tamaño: ");
        inputUno = new JTextField();
        inputDos = new JTextField();
        inputTres = new JTextField();
        seleccionTamaño = new JComboBox();
        fabrica = new FabricaDestornilladores();

    }

    public void initElements() {
        btn.setSize(new Dimension(200, 35));
        btn.setLocation((this.getWidth() - btn.getWidth()) / 2, 370);
        btn.setFont(new Font("Arial", Font.BOLD, 15));
        btn.setFocusable(false);
        btn.addActionListener(this);
        add(btn);

        title.setSize(new Dimension(300, 35));
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setLocation(20, 35);
        add(title);

        textUno.setSize(new Dimension(300, 20));
        textUno.setFont(new Font("Arial", Font.BOLD, 15));
        textUno.setLocation(20, 100);
        add(textUno);

        textDos.setSize(new Dimension(300, 20));
        textDos.setFont(new Font("Arial", Font.BOLD, 15));
        textDos.setLocation(20, 200);
        add(textDos);

        textTres.setSize(new Dimension(70, 20));
        textTres.setFont(new Font("Arial", Font.BOLD, 15));
        textTres.setLocation(20, 305);
        add(textTres);

        inputUno.setSize(new Dimension(300, 30));
        inputUno.setFont(new Font("Arial", Font.PLAIN, 15));
        inputUno.setLocation(20, 130);
        add(inputUno);

        inputDos.setSize(new Dimension(300, 30));
        inputDos.setFont(new Font("Arial", Font.PLAIN, 15));
        inputDos.setLocation(20, 230);
        add(inputDos);

        inputTres.setSize(new Dimension(30, 30));
        inputTres.setFont(new Font("Arial", Font.PLAIN, 15));
        inputTres.setHorizontalAlignment(SwingConstants.CENTER);
        inputTres.setLocation(100, 300);
        add(inputTres);

        seleccionTamaño.setSize(new Dimension(100, 30));
        seleccionTamaño.setFont(new Font("Arial", Font.BOLD, 15));
        seleccionTamaño.setLocation(150, 300);
        seleccionTamaño.addItem("cm");
        seleccionTamaño.addItem("in");
        add(seleccionTamaño);
    }

    public void initTemplate() {
        setLayout(null);
        setTitle("Menu");
        setSize(new Dimension(ANCHO, ALTO));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initElements();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            String tipoPunta = inputUno.getText(),marca = inputDos.getText();
            double tamaño = Double.parseDouble(inputTres.getText());

            VentanaDestornillador ventana = new VentanaDestornillador(fabrica.get(marca, tipoPunta, tamaño));
            ventana.initTemplate();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El tamaño debe ser un numero","Error",JOptionPane.ERROR_MESSAGE);
            inputTres.setText("");
        }
    }

}
