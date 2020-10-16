package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Interfaz extends JFrame {

    private JLabel LblImgPanRollo, LblImgBaguette, LblImgPanIntegral, LblImgPanCoco, PrecioPanIntegral, PrecioPanCoco, PrecioBaguette, PrecioPanRollo;
    private JLabel TituloPanRollo, TituloPanCoco, TituloBaguette, TituloPanIntegral;
    private String rutaPanRollo, rutaPanCoco, rutaPanIntegral, rutaBaguette;
    private JTextField[][] MatrizTexts;
    private JButton[][] MatrizBotones1;

    public Interfaz() {
        setLayout(null);
        getContentPane().setBackground(new Color(150, 190, 230));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setSize(new Dimension(553, 375));
        setSize(new Dimension(553, 375));

        initElements();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initElements() {
        setTitle("Panadería");

        TituloPanRollo = new JLabel("Pan Rollo");
        TituloPanRollo.setSize(100, 20);
        TituloPanRollo.setLocation(67, 115);
        TituloPanRollo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(TituloPanRollo);

        TituloBaguette = new JLabel("Pan Baguette");
        TituloBaguette.setSize(100, 20);
        TituloBaguette.setLocation(175, 115);
        TituloBaguette.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(TituloBaguette);

        TituloPanIntegral = new JLabel("Pan Integral");
        TituloPanIntegral.setSize(100, 20);
        TituloPanIntegral.setLocation(298, 115);
        TituloPanIntegral.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(TituloPanIntegral);

        TituloPanCoco = new JLabel("Pan Coco");
        TituloPanCoco.setSize(100, 20);
        TituloPanCoco.setLocation(428, 115);
        TituloPanCoco.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(TituloPanCoco);

        PrecioPanRollo = new JLabel("$2.000");
        PrecioPanRollo.setSize(100, 20);
        PrecioPanRollo.setLocation(73, 155);
        PrecioPanRollo.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(PrecioPanRollo);

        PrecioPanCoco = new JLabel("$1.500");
        PrecioPanCoco.setSize(100, 20);
        PrecioPanCoco.setLocation(193, 155);
        PrecioPanCoco.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(PrecioPanCoco);

        PrecioBaguette = new JLabel("$3.000");
        PrecioBaguette.setSize(100, 20);
        PrecioBaguette.setLocation(313, 155);
        PrecioBaguette.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(PrecioBaguette);

        PrecioPanIntegral = new JLabel("$2.500");
        PrecioPanIntegral.setSize(100, 20);
        PrecioPanIntegral.setLocation(433, 155);
        PrecioPanIntegral.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
        add(PrecioPanIntegral);

        MatrizTexts = new JTextField[1][4];
        for (int j = 0; j < 4; j++) {
            MatrizTexts[0][j] = new JTextField("0");
            MatrizTexts[0][j].setLocation(new Point(j * 120 + 75, 200));
            MatrizTexts[0][j].setSize(new Dimension(40, 40));
            MatrizTexts[0][j].setHorizontalAlignment(JLabel.CENTER);
            MatrizTexts[0][j].setFocusable(false);
            add(MatrizTexts[0][j]);
        }

        MatrizBotones1 = new JButton[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {

                    case 0:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 250));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 197));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }

                        break;

                    case 1:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 250));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 197));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }

                        break;
                    case 2:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 250));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 197));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }

                        break;
                    case 3:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 250));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 75, i * 75 + 197));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }
                        break;
                }
            }
        }

        MatrizBotones1[0][0].addActionListener((ActionEvent e1) -> {
            MatrizTexts[0][0].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][0].getText()) + 1));
        });
        MatrizBotones1[1][0].addActionListener((ActionEvent e2) -> {
            if ((Integer.valueOf(MatrizTexts[0][0].getText())) == 0) {
            } else {
                MatrizTexts[0][0].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][0].getText()) - 1));
            }
        });
        MatrizBotones1[0][1].addActionListener((ActionEvent e3) -> {
            MatrizTexts[0][1].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][1].getText()) + 1));
        });

        MatrizBotones1[1][1].addActionListener((ActionEvent e4) -> {
            if ((Integer.valueOf(MatrizTexts[0][1].getText())) == 0) {
            } else {
                MatrizTexts[0][1].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][1].getText()) - 1));
            }
        });
        MatrizBotones1[0][2].addActionListener((ActionEvent e5) -> {
            MatrizTexts[0][2].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][2].getText()) + 1));
        });
        MatrizBotones1[1][2].addActionListener((ActionEvent e6) -> {
            if ((Integer.valueOf(MatrizTexts[0][2].getText())) == 0) {
            } else {
                MatrizTexts[0][2].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][2].getText()) - 1));
            }
        });
        MatrizBotones1[0][3].addActionListener((ActionEvent e7) -> {
            MatrizTexts[0][3].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][3].getText()) + 1));
        });
        MatrizBotones1[1][3].addActionListener((ActionEvent e8) -> {
            if ((Integer.valueOf(MatrizTexts[0][3].getText())) == 0) {
            } else {
                MatrizTexts[0][3].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][3].getText()) - 1));
            }
        });

        LblImgPanRollo = new JLabel();
        LblImgPanRollo.setSize(new Dimension(80, 80));
        LblImgPanRollo.setLocation(55, 20);

        rutaPanRollo = new String("src/Resources/PanRollo.png");
        ImageIcon instr = new ImageIcon(rutaPanRollo);
        Image imginstr = instr.getImage();
        Image nuevaimagen = imginstr.getScaledInstance(LblImgPanRollo.getWidth(), LblImgPanRollo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaimagen);
        LblImgPanRollo.setIcon(imagen);
        add(LblImgPanRollo);

        LblImgBaguette = new JLabel();
        LblImgBaguette.setSize(new Dimension(80, 80));
        LblImgBaguette.setLocation(175, 20);

        rutaBaguette = new String("src/Resources/Baguette.png");
        ImageIcon iconoGalleta = new ImageIcon(rutaBaguette);
        Image imagenGalleta = iconoGalleta.getImage();
        Image nuevaimagenGalleta = imagenGalleta.getScaledInstance(LblImgBaguette.getWidth(), LblImgBaguette.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalGalleta = new ImageIcon(nuevaimagenGalleta);
        LblImgBaguette.setIcon(imagenFinalGalleta);
        add(LblImgBaguette);

        LblImgPanIntegral = new JLabel();
        LblImgPanIntegral.setSize(new Dimension(100, 80));
        LblImgPanIntegral.setLocation(285, 20);

        rutaPanIntegral = new String("src/resources/PanIntegral.png");
        ImageIcon iconoMalteada = new ImageIcon(rutaPanIntegral);
        Image imagenMalteada = iconoMalteada.getImage();
        Image nuevaimagenMalteada = imagenMalteada.getScaledInstance(LblImgPanIntegral.getWidth(), LblImgPanIntegral.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalMalteada = new ImageIcon(nuevaimagenMalteada);
        LblImgPanIntegral.setIcon(imagenFinalMalteada);
        add(LblImgPanIntegral);

        LblImgPanCoco = new JLabel();
        LblImgPanCoco.setSize(new Dimension(100, 80));
        LblImgPanCoco.setLocation(405, 20);

        rutaPanCoco = new String("src/resources/PanCoco.png");
        ImageIcon iconoHelado = new ImageIcon(rutaPanCoco);
        Image imagenHelado = iconoHelado.getImage();
        Image nuevaimagenHelado = imagenHelado.getScaledInstance(LblImgPanCoco.getWidth(), LblImgPanCoco.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalHelado = new ImageIcon(nuevaimagenHelado);
        LblImgPanCoco.setIcon(imagenFinalHelado);
        add(LblImgPanCoco);
    }

}
