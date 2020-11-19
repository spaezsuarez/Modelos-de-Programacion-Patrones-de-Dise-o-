package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.*;

import models.Tornillo;
import abstraction.Destornillador;
import java.awt.Image;
import javax.swing.ImageIcon;

public class VentanaDestornillador extends JFrame implements ActionListener {

    private final int ANCHO, ALTO;
    private final JButton btnDesatornillar;
    private final JLabel title;
    private final JComboBox inputUno;
    private JLabel panel;

    private Tornillo tornillo;
    private Destornillador destornillador;

    public VentanaDestornillador(Destornillador destornillador) {
        ANCHO = 450;
        ALTO = 450;
        btnDesatornillar = new JButton("Desatornillar");
        inputUno = new JComboBox();
        title = new JLabel("Ingrese tipo de destornillador: ");
        panel = new JLabel();

        this.destornillador = destornillador;
    }

    public void initElements() {
        btnDesatornillar.setSize(new Dimension(150, 35));
        btnDesatornillar.setLocation((this.getWidth() - btnDesatornillar.getWidth()) / 2, 350);
        btnDesatornillar.setFont(new Font("Arial", Font.BOLD, 15));
        btnDesatornillar.setFocusable(false);
        btnDesatornillar.addActionListener(this);
        add(btnDesatornillar);

        title.setSize(new Dimension(250, 35));
        title.setFont(new Font("Arial", Font.BOLD, 15));
        title.setLocation(20, 35);
        add(title);

        panel.setSize(new Dimension(200, 200));
        panel.setLocation((this.getWidth() - panel.getWidth()) / 2, 100);
        add(panel);

        inputUno.addItemListener((ae) -> {
            String nombre = String.valueOf(inputUno.getSelectedItem());
            tornillo = new Tornillo(nombre);
            setImage("estado_uno");
        });

        inputUno.setSize(new Dimension(150, 30));
        inputUno.setFont(new Font("Arial", Font.BOLD, 15));
        inputUno.setLocation(250, 35);
        inputUno.addItem("Tornillo_uno");
        inputUno.addItem("Tornillo_dos");
        inputUno.addItem("Tornillo_tres");
        add(inputUno);
    }

    public void initTemplate() {
        setLayout(null);
        setTitle("Destornillador");
        setSize(new Dimension(ANCHO, ALTO));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        initElements();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setImage(String folder) {

        String ruta = new String("src/resources/" + folder + "/" + tornillo.getNombre() + ".png");
        ImageIcon icono = new ImageIcon(ruta);
        Image imagen = icono.getImage();
        Image nuevaImagen = imagen.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinal = new ImageIcon(nuevaImagen);
        panel.setIcon(imagenFinal);
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnDesatornillar) {
            destornillador.desatornillar(tornillo);
            if (tornillo.getEstado()) {
                setImage("estado_uno");
            } else {
                setImage("estado_dos");
            }
        }
    }
}
