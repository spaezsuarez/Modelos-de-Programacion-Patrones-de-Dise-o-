package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Logica del patrön
import pattern.abstraction.Colleage;
import pattern.concrete.Avion;
import pattern.concrete.AvionComercial;
import pattern.concrete.Avioneta;
import pattern.concrete.Helicoptero;
import pattern.concrete.Jet;
import pattern.concrete.TorreDeControl;

public class Menu extends JFrame {

    private final int ancho, alto;
    private final JButton btnEnviar;
    private final JComboBox<String> comboOpciones;
    private DefaultListModel listModel = new DefaultListModel();
    private final JList lista;
    private final JTextPane texto;
    private final JLabel lablTituloCombo, lablTituloMensaje, lablTituloReceptores, lblImagen;
    private ArrayList<String> nombresVehiculos = new ArrayList<>(List.of("Avión", "Avión comercial", "Avioneta", "Jet", "Helicoptero"));

    public Menu() {
        ancho = 850;
        alto = 575;
        btnEnviar = new JButton("Enviar");
        comboOpciones = new JComboBox();
        lista = new JList(listModel);
        texto = new JTextPane();
        lablTituloCombo = new JLabel("Remitente");
        lablTituloMensaje = new JLabel("Mensaje a trasmitir");
        lablTituloReceptores = new JLabel("Receptores");
        lblImagen = new JLabel();

    }

    public void initComponents() {
        btnEnviar.setSize(200, 30);
        btnEnviar.setLocation((getWidth() - btnEnviar.getWidth()) / 2, 500);
        btnEnviar.setFont(new Font("Arial", Font.BOLD, 20));
        btnEnviar.setFocusable(false);
        add(btnEnviar);

        lablTituloCombo.setSize(200, 20);
        lablTituloCombo.setLocation(5, 35);
        lablTituloCombo.setFont(new Font("Arial", Font.BOLD, 20));
        add(lablTituloCombo);

        comboOpciones.setSize(200, 20);
        comboOpciones.setLocation(5, 75);
        comboOpciones.setFocusable(false);
        comboOpciones.addItem("");
        comboOpciones.addItem("Avión");
        comboOpciones.addItem("Avión comercial");
        comboOpciones.addItem("Avioneta");
        comboOpciones.addItem("Jet");
        comboOpciones.addItem("Helicoptero");
        add(comboOpciones);

        lablTituloMensaje.setSize(200, 20);
        lablTituloMensaje.setLocation((getWidth() - lablTituloMensaje.getWidth()) / 2 - (lablTituloMensaje.getWidth() / 2) + 5, 35);
        lablTituloMensaje.setFont(new Font("Arial", Font.BOLD, 20));
        add(lablTituloMensaje);

        texto.setSize(400, 375);
        texto.setLocation((getWidth() - texto.getWidth()) / 2, 75);
        texto.setFont(new Font("Arial", Font.PLAIN, 20));
        texto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(texto);

        lablTituloReceptores.setSize(200, 20);
        lablTituloReceptores.setLocation(ancho - 200, 35);
        lablTituloReceptores.setFont(new Font("Arial", Font.BOLD, 20));
        add(lablTituloReceptores);

        lista.setSize(175, 375);
        lista.setLocation(ancho - 210, 75);
        lista.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lista.setSelectionBackground(new Color(255, 222, 173));
        add(lista);

        lblImagen.setSize(200, 200);
        lblImagen.setLocation(5, 150);
        String rutaBase = "src/resources/control-tower.png";
        ImageIcon instr = new ImageIcon(rutaBase);
        Image imginstr = instr.getImage();
        Image nuevaimagen = imginstr.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaimagen);
        lblImagen.setIcon(imagen);
        add(lblImagen);

    }

    public Colleage getSelectedColleage(String value) {
        switch (value) {
            case "Avión":
                return new Avion();
            case "Avión comercial":
                return new AvionComercial();
            case "Avioneta":
                return new Avioneta();
            case "Jet":
                return new Jet();
            case "Helicoptero":
                return new Helicoptero();
        }

        return null;

    }

    public void initListeners() {
        btnEnviar.addActionListener((event) -> {

            String message = texto.getText();
            if (!message.equals("")) {
                List arregloOpciones = lista.getSelectedValuesList();

                Colleage[] receptores = new Colleage[arregloOpciones.size()];

                Colleage emisor = getSelectedColleage(String.valueOf(comboOpciones.getSelectedItem()));

                int contador = 0;

                for (Object e : arregloOpciones) {
                    receptores[contador] = getSelectedColleage(String.valueOf(e));
                    contador++;
                }
                emisor.enviarMensaje(receptores, message);
                JOptionPane.showMessageDialog(null,emisor.getMediator().getResult(),"Notificación",JOptionPane.INFORMATION_MESSAGE);
                

            }else{
                JOptionPane.showMessageDialog(null, "El mensaje no puede ser vacio","Error",JOptionPane.ERROR_MESSAGE);
            }

        });

        comboOpciones.addItemListener((event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                listModel = new DefaultListModel();
                for (String e : nombresVehiculos) {
                    if (!(e.equals(String.valueOf(comboOpciones.getSelectedItem())))) {
                        listModel.addElement(e);
                    }
                }
                lista.setModel(listModel);
                repaint();
            }

        });
    }

    public void initTemplate() {
        setLayout(null);
        setSize(ancho, alto);
        getContentPane().setBackground(new Color(245, 255, 250));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Mediator");
        initComponents();
        initListeners();
        setVisible(true);
    }

}
