package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.plaf.BorderUIResource;
import Persistence.Lector;
import java.util.ArrayList;

public class Frame extends JFrame {

    private Lector lectorArchvs = Lector.getInstance();
    private Panel_Desc_Combo panelDescCombos = new Panel_Desc_Combo();
    private JLabel Lbltitulo, LblCombosDisponibles, LblDescripciónCombo;
    private JButton BtnAgregarCombo;
    private JScrollPane scrollPane;

    private JList listaCombos;
    private ArrayList<String> combos = lectorArchvs.leerCombos();

    public Frame() {
        setLayout(null);
        setSize(535, 420);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Tienda - Composite");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();
        initListeners();
    }

    public void initListeners() {
        BtnAgregarCombo.addActionListener((ae) -> {
            AgregarComponente menu = new AgregarComponente();
            menu.initTemplate();
        });

        listaCombos.addListSelectionListener((lse) -> {
            if (lse.getValueIsAdjusting() && (listaCombos.getSelectedValue() != null)) {
                String[] desc = lectorArchvs.buscarCombo(listaCombos.getSelectedValue().toString(), combos);
                panelDescCombos.setLblNombreCombo(desc[0]);
                panelDescCombos.setLblDescCombo("<html><center><h1>Precio</h1><h2>" + desc[1] + "$</h2><h1>Composición</h1><h4>" + desc[2] + "</h4></center></html>");
            }
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
        BtnAgregarCombo.setSize(305, 30);
        BtnAgregarCombo.setLocation(210, 40);
        add(BtnAgregarCombo);

        listaCombos = new JList(lectorArchvs.getData());
        listaCombos.setSelectionBackground(Color.orange);

        scrollPane = new JScrollPane(listaCombos);
        scrollPane.setBounds(5, 75, 200, 300);
        scrollPane.setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane);
        scrollPane.updateUI();

        add(panelDescCombos);
        panelDescCombos.setLocation(210, 110);

    }

}
