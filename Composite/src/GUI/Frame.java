package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.plaf.BorderUIResource;
import Persistence.Lector;

public class Frame extends JFrame {

    private Lector lectorArchvs = new Lector();
    private Panel_Combos panelCombos = new Panel_Combos(new GridLayout(0, 1, 5, 5));
    private Panel_Desc_Combo panelDescCombos = new Panel_Desc_Combo();
    private JLabel Lbltitulo, LblCombosDisponibles, LblDescripciónCombo;
    private JButton BtnAgregarCombo, BtnModificarCombo;
    private JScrollPane jsp;

    private JList listaCombos;

    public Frame() {
        setLayout(null);
        setSize(535, 420);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Tienda - Composite");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getData();
        initComponents();
        initListeners();
    }

    public void initListeners() {
        BtnAgregarCombo.addActionListener((ae) -> {

        });

        BtnModificarCombo.addActionListener((ae) -> {

        });
    }

    public void initComponents() {

        Lbltitulo = new JLabel("Bienvenido a nuestra tienda");
        Lbltitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        Lbltitulo.setSize(510, 30);
        Lbltitulo.setLocation(5, 5);
        Lbltitulo.setHorizontalAlignment(JLabel.CENTER);
        Lbltitulo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(Lbltitulo);

        LblCombosDisponibles = new JLabel("Combos disponibles");
        LblCombosDisponibles.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        LblCombosDisponibles.setSize(200, 30);
        LblCombosDisponibles.setLocation(5, 40);
        LblCombosDisponibles.setHorizontalAlignment(JLabel.CENTER);
        LblCombosDisponibles.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(LblCombosDisponibles);

        LblDescripciónCombo = new JLabel("Información del combo");
        LblDescripciónCombo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        LblDescripciónCombo.setSize(305, 30);
        LblDescripciónCombo.setLocation(210, 75);
        LblDescripciónCombo.setHorizontalAlignment(JLabel.CENTER);
        LblDescripciónCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(LblDescripciónCombo);

        BtnAgregarCombo = new JButton("Agregar combo");
        BtnAgregarCombo.setSize(150, 30);
        BtnAgregarCombo.setLocation(210, 40);
        add(BtnAgregarCombo);

        BtnModificarCombo = new JButton("Modificar combo");
        BtnModificarCombo.setSize(150, 30);
        BtnModificarCombo.setLocation(365, 40);
        add(BtnModificarCombo);

        jsp = new JScrollPane(listaCombos);
        jsp.setBounds(5, 75, 200, 300);
        jsp.setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK));
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(jsp);

        add(panelDescCombos);
        panelDescCombos.setLocation(210, 110);

    }

    public void getData() {

        listaCombos = new JList(lectorArchvs.leerCombos().toArray());
        System.out.println(listaCombos.getSize());
//        for (int i = 0; i < listaCombos.getSize(); i++) {
//
//        }
        ArrayList<String> arreglo = new ArrayList<>();
        String sports[] = {"Tennis", "Archery", "Football", "Fencing", "Cricket", "Squash", "Hockey", "Rugby"};
    }

}
