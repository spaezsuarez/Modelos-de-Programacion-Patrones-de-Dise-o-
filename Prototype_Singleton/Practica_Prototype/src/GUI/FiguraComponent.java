package GUI;

//Elementos Graficos
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
//Elementos Decorativos
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Font;

//Componentes
import GUI.components.*;

//Logica
import Figuras.*;
import Interface.Figuras_geometricas;
import javax.swing.JOptionPane;

public class FiguraComponent extends JFrame implements ActionListener {

    private final int ancho, alto;
    private JButton btnClonar;
    private Component componente;
    private Figuras_geometricas figura;
    private JLabel stats;
    private String nombreFigura;

    public FiguraComponent(String nombreFiguraRef) {
        nombreFigura = nombreFiguraRef;

        ancho = 500;
        alto = 650;

        setTitle(nombreFigura);

        if (nombreFigura.equalsIgnoreCase("Circulo")) {
            componente = new CirculoComponent();
            figura = Circulo.getInstance();
            System.out.println(figura.getClass().getSimpleName());
            figura.setNombre(nombreFigura);
            figura.posicion(15, 30);
            figura.establecerDimensiones(new double[]{5});
            figura.setArea();
        } else {
            componente = new RectanguloComponent();
            figura = Rectangulo.getInstance();
            figura.setNombre(nombreFigura);
            System.out.println(figura.getClass().getSimpleName());
            figura.posicion(18, 25);
            figura.establecerDimensiones(new double[]{10, 20});
            figura.setArea();
        }
        btnClonar = new JButton("Clonar");
        stats = new JLabel();
    }

    public void initTemplate() {
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(new Dimension(ancho, alto));
        setResizable(false);
        setMaximumSize(new Dimension(ancho, alto));
        setMinimumSize(new Dimension(ancho, alto));

        initElements();

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void initElements() {
        btnClonar.setSize(new Dimension(200, 40));
        btnClonar.setLocation((this.getWidth() - btnClonar.getWidth()) / 2, 530);
        btnClonar.setFont(new Font("Arial", Font.BOLD, 20));
        btnClonar.addActionListener(this);
        add(btnClonar);

        componente.setLocation(100, 0);
        componente.repaint();
        add(componente);

        stats.setSize(new Dimension(300, 300));
        stats.setText(figura.toString());
        stats.setLocation((this.getWidth() - stats.getWidth()) / 2, 250);
        stats.setFont(new Font("Arial", Font.PLAIN, 15));
        add(stats);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals(btnClonar.getActionCommand())) {
            Figuras_geometricas asd = figura.clonar();
            asd.posicion(Integer.parseInt(JOptionPane.showInputDialog("Métame la coordenada X")), Integer.parseInt(JOptionPane.showInputDialog("Métame la coordenada Y")));
            if (nombreFigura.equals("Circulo")) {
                asd.establecerDimensiones(new double[]{Double.parseDouble(JOptionPane.showInputDialog("Metame el radio"))});
                asd.setArea();
                JOptionPane.showMessageDialog(null, asd.toString(), "Copia círculo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                asd.establecerDimensiones(new double[]{Double.parseDouble(JOptionPane.showInputDialog("Metame el ancho")), Double.parseDouble(JOptionPane.showInputDialog("Metame el largo"))});
                asd.setArea();
                JOptionPane.showMessageDialog(null, asd.toString(), "Copia rectángulo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
