package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.plaf.BorderUIResource;
//
import Logic.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Frame extends JFrame {

    private JLabel lblImgRin, lblImgLlantas, lblImgMotor, lblImgTracc, lblImgTrans;
    private JLabel lblRin, lblLlantas, lblMotor, lblTracc, lblTrans, lblDescMemento;
    private JComboBox comboRin, comboLlantas, comboMotor, comboTracc, comboTrans;
    private JButton BtnSave, BtnRestore;
    private JScrollPane scrollPane;

    private DefaultListModel listModel = new DefaultListModel();
    private JList listaMementos = new JList(listModel);

    private Caretaker caretaker = new Caretaker();
    private Originator originator = new Originator();

    public Frame() {
        setLayout(null);
        setSize(620, 425);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Memento");
        initComponents();
        initListeners();
        setVisible(true);
    }

    public void initComponents() {
        lblImgRin = new JLabel();
        lblImgRin.setSize(100, 100);
        lblImgRin.setLocation(5, 5);
        setImagen(lblImgRin, "Rin.png");

        lblImgLlantas = new JLabel();
        lblImgLlantas.setSize(100, 100);
        lblImgLlantas.setLocation(110, 5);
        setImagen(lblImgLlantas, "Llanta.png");

        lblImgMotor = new JLabel();
        lblImgMotor.setSize(100, 100);
        lblImgMotor.setLocation(215, 5);
        setImagen(lblImgMotor, "Motor.png");

        lblImgTracc = new JLabel();
        lblImgTracc.setSize(100, 100);
        lblImgTracc.setLocation(((175 - lblImgTracc.getWidth()) / 2) + 320, 5);
        setImagen(lblImgTracc, "Tracción.png");

        lblImgTrans = new JLabel();
        lblImgTrans.setSize(100, 100);
        lblImgTrans.setLocation(500, 5);
        setImagen(lblImgTrans, "Transmisión.png");

        lblRin = new JLabel("Rines");
        lblRin.setSize(100, 30);
        lblRin.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblRin.setLocation(5, 110);
        lblRin.setHorizontalAlignment(JLabel.CENTER);
        lblRin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(lblRin);

        lblLlantas = new JLabel("Llantas");
        lblLlantas.setSize(100, 30);
        lblLlantas.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblLlantas.setLocation(110, 110);
        lblLlantas.setHorizontalAlignment(JLabel.CENTER);
        lblLlantas.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(lblLlantas);

        lblMotor = new JLabel("Motor");
        lblMotor.setSize(100, 30);
        lblMotor.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblMotor.setLocation(215, 110);
        lblMotor.setHorizontalAlignment(JLabel.CENTER);
        lblMotor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(lblMotor);

        lblTracc = new JLabel("Tracción");
        lblTracc.setSize(175, 30);
        lblTracc.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTracc.setLocation(320, 110);
        lblTracc.setHorizontalAlignment(JLabel.CENTER);
        lblTracc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(lblTracc);

        lblTrans = new JLabel("Transmisión");
        lblTrans.setSize(100, 30);
        lblTrans.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTrans.setLocation(500, 110);
        lblTrans.setHorizontalAlignment(JLabel.CENTER);
        lblTrans.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(lblTrans);

        lblDescMemento = new JLabel();
        lblDescMemento.setHorizontalAlignment(JLabel.CENTER);

        lblDescMemento.setSize(205, 200);
        lblDescMemento.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblDescMemento.setLocation(395, 180);
        lblDescMemento.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(lblDescMemento);

        comboRin = new JComboBox();
        comboRin.setSize(100, 30);
        comboRin.setLocation(5, 145);
        comboRin.setFocusable(false);
        comboRin.addItem("- -");
        comboRin.addItem("Aluminio");
        comboRin.addItem("Acero");
        comboRin.addItem("Magnesio");
        comboRin.addItem("Aleación");
        add(comboRin);

        comboLlantas = new JComboBox();
        comboLlantas.setSize(100, 30);
        comboLlantas.setLocation(110, 145);
        comboLlantas.setFocusable(false);
        comboLlantas.addItem("- -");
        comboLlantas.addItem("Radiales");
        comboLlantas.addItem("Direccionales");
        comboLlantas.addItem("Alto desempeño");
        comboLlantas.addItem("Diagonal");
        comboLlantas.addItem("Perfil bajo");
        add(comboLlantas);

        comboMotor = new JComboBox();
        comboMotor.setSize(100, 30);
        comboMotor.setLocation(215, 145);
        comboMotor.setFocusable(false);
        comboMotor.addItem("- -");
        comboMotor.addItem("Gasolina");
        comboMotor.addItem("Eléctrico");
        comboMotor.addItem("Diesel");
        comboMotor.addItem("Híbrido");
        comboMotor.addItem("GLP / GNC");
        add(comboMotor);

        comboTracc = new JComboBox();
        comboTracc.setSize(175, 30);
        comboTracc.setLocation(320, 145);
        comboTracc.setFocusable(false);
        comboTracc.addItem("- -");
        comboTracc.addItem("FWD (Front Wheel Drive)");
        comboTracc.addItem("RWD (Rear Wheel Drive)");
        comboTracc.addItem("4WD (Four Wheel Drive)");
        comboTracc.addItem("4X4 (Tracción clasica)");
        add(comboTracc);

        comboTrans = new JComboBox();
        comboTrans.setSize(100, 30);
        comboTrans.setLocation(500, 145);
        comboTrans.setFocusable(false);
        comboTrans.addItem("- -");
        comboTrans.addItem("Manual");
        comboTrans.addItem("Automatizada");
        comboTrans.addItem("CVT");
        comboTrans.addItem("Doble embrague");
        add(comboTrans);

        listaMementos = new JList();
        listaMementos.setSelectionBackground(Color.orange);

        scrollPane = new JScrollPane(listaMementos);
        scrollPane.setSize(205, 200);
        scrollPane.setLocation(5, 180);
        scrollPane.setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane);
        scrollPane.updateUI();

        BtnSave = new JButton("Guardar");
        BtnSave.setSize(100, 30);
        BtnSave.setLocation((getWidth() - BtnSave.getWidth()) / 2, 230);
        BtnSave.setBackground(new Color(42, 205, 112));
        BtnSave.setFocusable(false);
        add(BtnSave);

        BtnRestore = new JButton("Restaurar");
        BtnRestore.setSize(100, 30);
        BtnRestore.setLocation((getWidth() - BtnSave.getWidth()) / 2, 270);
        BtnRestore.setBackground(new Color(255, 128, 0));
        BtnRestore.setFocusable(false);
        add(BtnRestore);
    }

    public void setImagen(JLabel label, String nombreImg) {
        String rutaBase = "src/Resources/" + nombreImg;
        ImageIcon instr = new ImageIcon(rutaBase);
        Image imginstr = instr.getImage();
        Image nuevaimagen = imginstr.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaimagen);
        label.setIcon(imagen);
        add(label);
    }

    public void initListeners() {
        listaMementos.addListSelectionListener((lse) -> {
            if (lse.getValueIsAdjusting() && (listaMementos.getSelectedValue() != null)) {
                Carro carro = caretaker.getMemento(listaMementos.getSelectedIndex()).getCarro();
                lblDescMemento.setText("<html><body><center><h3>Rines: " + carro.getTipoRin() + "</h3><h3>Llantas: " + carro.getTipoLlantas() + "</h3><h3>Motor: " + carro.getTipoMotor() + "</h3><h3>Tracción: " + carro.getTipoTracción() + "</h3><h3>Transmisión: " + carro.getTipoTransmisión() + "</h3></center></body></html>");
            }
        });

        BtnSave.addActionListener((ae) -> {
            Memento memento = originator.createMemento();
            if (!(comboRin.getSelectedItem().equals("- -"))
                    && !(comboLlantas.getSelectedItem().equals("- -"))
                    && !(comboMotor.getSelectedItem().equals("- -"))
                    && !(comboTracc.getSelectedItem().equals("- -"))
                    && !(comboTrans.getSelectedItem().equals("- -"))) {
                if (!caretaker.compCarro(memento.getCarro())) {
                    listModel.addElement("Estado  " + (caretaker.getMementos().size() + 1));
                    listaMementos.setModel(listModel);
                    caretaker.addMemento(memento);
                } else {
                    JOptionPane.showMessageDialog(null, "Combinación ya usada", "Error", JOptionPane.ERROR_MESSAGE);
                }
                setNewCarro();
            } else {
                JOptionPane.showMessageDialog(null, "Opciones invalidas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        BtnRestore.addActionListener((ae) -> {
            if (!listaMementos.getSelectedValue().equals(null)) {
                comboRin.setSelectedItem(caretaker.getMemento(listaMementos.getSelectedIndex()).getCarro().getTipoRin());
                comboLlantas.setSelectedItem(caretaker.getMemento(listaMementos.getSelectedIndex()).getCarro().getTipoLlantas());
                comboMotor.setSelectedItem(caretaker.getMemento(listaMementos.getSelectedIndex()).getCarro().getTipoMotor());
                comboTracc.setSelectedItem(caretaker.getMemento(listaMementos.getSelectedIndex()).getCarro().getTipoTracción());
                comboTrans.setSelectedItem(caretaker.getMemento(listaMementos.getSelectedIndex()).getCarro().getTipoTransmisión());
            }
        }); 

        comboRin.addItemListener((iL) -> {
            if (!comboRin.getSelectedItem().equals("- -") && iL.getStateChange() == 1) {
                originator.getCarro().setTipoRin(comboRin.getSelectedItem().toString());
            }
        });

        comboLlantas.addItemListener((iL) -> {
            if (!comboLlantas.getSelectedItem().equals("- -") && iL.getStateChange() == 1) {
                originator.getCarro().setTipoLlantas(comboLlantas.getSelectedItem().toString());
            }
        });

        comboMotor.addItemListener((iL) -> {
            if (!comboMotor.getSelectedItem().equals("- -") && iL.getStateChange() == 1) {
                originator.getCarro().setTipoMotor(comboMotor.getSelectedItem().toString());
            }
        });

        comboTracc.addItemListener((iL) -> {
            if (!comboTracc.getSelectedItem().equals("- -") && iL.getStateChange() == 1) {
                originator.getCarro().setTipoTracción(comboTracc.getSelectedItem().toString());
            }
        });

        comboTrans.addItemListener((iL) -> {
            if (!comboTrans.getSelectedItem().equals("- -") && iL.getStateChange() == 1) {
                originator.getCarro().setTipoTransmisión(comboTrans.getSelectedItem().toString());
            }
        });

    }

    public void setNewCarro() {
        originator.getCarro().setTipoRin(comboRin.getSelectedItem().toString());
        originator.getCarro().setTipoLlantas(comboLlantas.getSelectedItem().toString());
        originator.getCarro().setTipoMotor(comboMotor.getSelectedItem().toString());
        originator.getCarro().setTipoTracción(comboTracc.getSelectedItem().toString());
        originator.getCarro().setTipoTransmisión(comboTrans.getSelectedItem().toString());
    }

}
