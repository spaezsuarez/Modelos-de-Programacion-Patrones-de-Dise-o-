package GUI;

//Elementos Graficos
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JList;

//Elemetos Decorativos
import java.awt.Dimension;
import java.awt.Font;

//Componentes
import GUI.components.PanelPedido;

//Eventos
import java.awt.event.*;

//Persistencia
import Persistence.Lector;
import java.util.ArrayList;

import controllers.ComboController;
import models.Combo;

public class AgregarComponente extends JFrame implements ActionListener {

    private final int ANCHO, ALTO;
    private final JButton btnAgregar, btnTerminar;
    private final JLabel txtCombos, txtAdicion, txtPedidoExtra;
    private PanelPedido panelPedido;
    private JList listCombos, listaAdiciones;
    private Lector lector;

    public AgregarComponente() {
        ANCHO = 1000;
        ALTO = 600;

        btnAgregar = new JButton("Agregar");
        btnTerminar = new JButton("Terminar Pedido");

        txtAdicion = new JLabel("Adiciones");
        txtCombos = new JLabel("Combos");
        txtPedidoExtra = new JLabel("Pedido Actual");

        lector = Lector.getInstance();

        panelPedido = new PanelPedido();
        listCombos = new JList(lector.leerCombos().toArray());
        listaAdiciones = new JList(lector.leerAdiciones().toArray());
    }

    public void initElements() {
        btnAgregar.setSize(new Dimension(200, 40));
        btnAgregar.setLocation(275, 520);
        btnAgregar.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(this);
        add(btnAgregar);

        btnTerminar.setSize(new Dimension(200, 40));
        btnTerminar.setLocation(500, 520);
        btnTerminar.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        btnTerminar.setFocusable(false);
        btnTerminar.addActionListener(this);
        add(btnTerminar);

        txtCombos.setSize(new Dimension(200, 40));
        txtCombos.setLocation(130, 40);
        txtCombos.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(txtCombos);

        txtAdicion.setSize(new Dimension(200, 40));
        txtAdicion.setLocation(430, 40);
        txtAdicion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(txtAdicion);

        txtPedidoExtra.setSize(new Dimension(200, 40));
        txtPedidoExtra.setLocation(720, 40);
        txtPedidoExtra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(txtPedidoExtra);

        panelPedido.setLocation(680, 100);
        JScrollPane jsPedido = new JScrollPane(panelPedido);

        jsPedido.setBounds(680, 100, panelPedido.getANCHO(), panelPedido.getALTO());
        jsPedido.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsPedido.setBorder(new BevelBorder(BevelBorder.LOWERED));
        jsPedido.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        add(jsPedido);

        JScrollPane jsCombos = new JScrollPane(listCombos);
        jsCombos.setBounds(100, 100, 250, 400);
        jsCombos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsCombos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        add(jsCombos);

        JScrollPane jsAdiciones = new JScrollPane(listaAdiciones);
        jsAdiciones.setBounds(420, 100, 200, 400);
        jsAdiciones.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsAdiciones.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        add(jsAdiciones);

    }

    public void initTemplate() {
        setLayout(null);
        setTitle("Realizar Pedido");
        setSize(new Dimension(ANCHO, ALTO));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initElements();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btnAgregar) {

            String adicion = String.valueOf(listaAdiciones.getSelectedValue()), combo = String.valueOf(listCombos.getSelectedValue());

            if (!(adicion.equals("null"))) {
                panelPedido.addPedido(adicion);
            }
            if (!(combo.equals("null"))) {
                panelPedido.addPedido(combo);
            }
            panelPedido.render();

        } else if (event.getSource() == btnTerminar) {

            ComboController controller = new ComboController();
            Factura factura = new Factura();
            factura.initTemplate(controller.initCombo(panelPedido.getPedidos()),panelPedido.getPedidos());
        }
    }

}
