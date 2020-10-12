package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame {

    private JLabel lBrownie, lGalleta, lMalteada, lHelado, lFresa, lChocolate;
    private String rutaBrownie, rutaHelado, rutaMalteada, rutaGalleta;
    private JTextField[][] MatrizTexts;
    private JButton[][] MatrizBotones1, MatrizBotones2;
    private JButton Pagar, Precio;

    public Menu() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setSize(new Dimension(700, 375));
        setSize(new Dimension(700, 375));

        initElements();

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void initElements() {

        Pagar = new JButton("Pagar");
        Pagar.setSize(new Dimension(150, 40));
        Pagar.setLocation(new Point(30, 20));
        Pagar.addActionListener((ActionEvent ae1) -> {

        });
        add(Pagar);

        Precio = new JButton("Precio actual");
        Precio.setSize(new Dimension(150, 40));
        Precio.setLocation(new Point(30, 70));
        Precio.addActionListener((ActionEvent ae2) -> {

        });
        add(Precio);

        MatrizTexts = new JTextField[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                MatrizTexts[i][j] = new JTextField("0");
                MatrizTexts[i][j].setLocation(new Point(j * 120 + 230, i * 75 + 160));
                MatrizTexts[i][j].setSize(new Dimension(40, 40));
                MatrizTexts[i][j].setHorizontalAlignment(JLabel.CENTER);
                MatrizTexts[i][j].setFocusable(false);
                add(MatrizTexts[i][j]);
            }
        }

        MatrizBotones1 = new JButton[2][4];

        MatrizBotones2 = new JButton[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {

                    case 0:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 159));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 106));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }

                        break;

                    case 1:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 159));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 106));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }

                        break;
                    case 2:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 159));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 106));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);
                        }

                        break;
                    case 3:
                        if (i == 0) {
                            MatrizBotones1[i][j] = new JButton("+");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 159));
                            MatrizBotones1[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones1[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones1[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones1[i][j]);

                        } else if (i == 1) {
                            MatrizBotones1[i][j] = new JButton("-");
                            MatrizBotones1[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 106));
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
            if ((Integer.valueOf(MatrizTexts[0][0].getText())) == 10) {
            } else {
                MatrizTexts[0][0].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][0].getText()) + 1));
            }
        });
        MatrizBotones1[1][0].addActionListener((ActionEvent e2) -> {
            if ((Integer.valueOf(MatrizTexts[0][0].getText())) == 0) {
            } else {
                MatrizTexts[0][0].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][0].getText()) - 1));
            }
        });
        MatrizBotones1[0][1].addActionListener((ActionEvent e3) -> {
            if ((Integer.valueOf(MatrizTexts[0][1].getText())) == 10) {
            } else {
                MatrizTexts[0][1].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][1].getText()) + 1));
            }
        });

        MatrizBotones1[1][1].addActionListener((ActionEvent e4) -> {
            if ((Integer.valueOf(MatrizTexts[0][1].getText())) == 0) {
            } else {
                MatrizTexts[0][1].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][1].getText()) - 1));
            }
        });
        MatrizBotones1[0][2].addActionListener((ActionEvent e5) -> {
            if ((Integer.valueOf(MatrizTexts[0][2].getText())) == 10) {
            } else {
                MatrizTexts[0][2].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][2].getText()) + 1));
            }
        });
        MatrizBotones1[1][2].addActionListener((ActionEvent e6) -> {
            if ((Integer.valueOf(MatrizTexts[0][2].getText())) == 0) {
            } else {
                MatrizTexts[0][2].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][2].getText()) - 1));
            }
        });
        MatrizBotones1[0][3].addActionListener((ActionEvent e7) -> {
            if ((Integer.valueOf(MatrizTexts[0][3].getText())) == 10) {
            } else {
                MatrizTexts[0][3].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][3].getText()) + 1));
            }
        });
        MatrizBotones1[1][3].addActionListener((ActionEvent e8) -> {
            if ((Integer.valueOf(MatrizTexts[0][3].getText())) == 0) {
            } else {
                MatrizTexts[0][3].setText(String.valueOf(Integer.valueOf(MatrizTexts[0][3].getText()) - 1));
            }
        });

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {

                    case 0:
                        if (i == 0) {
                            MatrizBotones2[i][j] = new JButton("+");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 234));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);

                        } else if (i == 1) {
                            MatrizBotones2[i][j] = new JButton("-");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 181));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);
                        }

                        break;

                    case 1:
                        if (i == 0) {
                            MatrizBotones2[i][j] = new JButton("+");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 234));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);

                        } else if (i == 1) {
                            MatrizBotones2[i][j] = new JButton("-");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 181));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);
                        }

                        break;
                    case 2:
                        if (i == 0) {
                            MatrizBotones2[i][j] = new JButton("+");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 234));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);

                        } else if (i == 1) {
                            MatrizBotones2[i][j] = new JButton("-");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 181));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);
                        }

                        break;
                    case 3:
                        if (i == 0) {
                            MatrizBotones2[i][j] = new JButton("+");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 234));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);

                        } else if (i == 1) {
                            MatrizBotones2[i][j] = new JButton("-");
                            MatrizBotones2[i][j].setLocation(new Point(j * 120 + 270, i * 75 + 181));
                            MatrizBotones2[i][j].setSize(new Dimension(40, 20));
                            MatrizBotones2[i][j].setHorizontalAlignment(JLabel.CENTER);
                            MatrizBotones2[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
                            add(MatrizBotones2[i][j]);
                        }
                        break;
                }
            }
        }

        MatrizBotones2[0][0].addActionListener((ActionEvent e1) -> {
            if ((Integer.valueOf(MatrizTexts[1][0].getText())) == 10) {
            } else {
                MatrizTexts[1][0].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][0].getText()) + 1));
            }
        });
        MatrizBotones2[1][0].addActionListener((ActionEvent e2) -> {
            if ((Integer.valueOf(MatrizTexts[1][0].getText())) == 0) {
            } else {
                MatrizTexts[1][0].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][0].getText()) - 1));
            }
        });
        MatrizBotones2[0][1].addActionListener((ActionEvent e3) -> {
            if ((Integer.valueOf(MatrizTexts[1][1].getText())) == 10) {
            } else {
                MatrizTexts[1][1].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][1].getText()) + 1));
            }
        });

        MatrizBotones2[1][1].addActionListener((ActionEvent e4) -> {
            if ((Integer.valueOf(MatrizTexts[1][1].getText())) == 0) {
            } else {
                MatrizTexts[1][1].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][1].getText()) - 1));
            }
        });
        MatrizBotones2[0][2].addActionListener((ActionEvent e5) -> {
            if ((Integer.valueOf(MatrizTexts[1][2].getText())) == 10) {
            } else {
                MatrizTexts[1][2].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][2].getText()) + 1));
            }
        });
        MatrizBotones2[1][2].addActionListener((ActionEvent e6) -> {
            if ((Integer.valueOf(MatrizTexts[1][2].getText())) == 0) {
            } else {
                MatrizTexts[1][2].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][2].getText()) - 1));
            }
        });
        MatrizBotones2[0][3].addActionListener((ActionEvent e7) -> {
            if ((Integer.valueOf(MatrizTexts[1][3].getText())) == 10) {
            } else {
                MatrizTexts[1][3].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][3].getText()) + 1));
            }
        });
        MatrizBotones2[1][3].addActionListener((ActionEvent e8) -> {
            if ((Integer.valueOf(MatrizTexts[1][3].getText())) == 0) {
            } else {
                MatrizTexts[1][3].setText(String.valueOf(Integer.valueOf(MatrizTexts[1][3].getText()) - 1));
            }
        });

        String rutaFresa = new String("src/resources/fresa_1.png");;
        ImageIcon iconoFresa = new ImageIcon(rutaFresa);
        Image imagenFresa = iconoFresa.getImage();
        Image nuevaImagenFresa = imagenFresa.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon imagenFinalFresa = new ImageIcon(nuevaImagenFresa);

        lFresa = new JLabel("Sabor Fresa", imagenFinalFresa, JLabel.CENTER);
        lFresa.setSize(new Dimension(150, 60));
        lFresa.setLocation(20, 150);
        add(lFresa);

        String rutaChocolate = new String("src/resources/chocolate.png");;
        ImageIcon iconoChocolate = new ImageIcon(rutaChocolate);
        Image imagenChocolate = iconoChocolate.getImage();
        Image nuevaImagenChocolate = imagenChocolate.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon imagenFinalChocolate = new ImageIcon(nuevaImagenChocolate);

        lChocolate = new JLabel("Sabor Chocolate", imagenFinalChocolate, JLabel.CENTER);
        lChocolate.setSize(new Dimension(165, 60));
        lChocolate.setLocation(20, 230);
        add(lChocolate);

        lBrownie = new JLabel();
        lBrownie.setSize(new Dimension(80, 80));
        lBrownie.setLocation(230, 20);

        rutaBrownie = new String("src/resources/duende.png");
        ImageIcon instr = new ImageIcon(rutaBrownie);
        Image imginstr = instr.getImage();
        Image nuevaimagen = imginstr.getScaledInstance(lBrownie.getWidth(), lBrownie.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaimagen);
        lBrownie.setIcon(imagen);
        add(lBrownie);

        lGalleta = new JLabel();
        lGalleta.setSize(new Dimension(80, 80));
        lGalleta.setLocation(350, 20);

        rutaGalleta = new String("src/resources/galleta.png");
        ImageIcon iconoGalleta = new ImageIcon(rutaGalleta);
        Image imagenGalleta = iconoGalleta.getImage();
        Image nuevaimagenGalleta = imagenGalleta.getScaledInstance(lGalleta.getWidth(), lGalleta.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalGalleta = new ImageIcon(nuevaimagenGalleta);
        lGalleta.setIcon(imagenFinalGalleta);
        add(lGalleta);

        lMalteada = new JLabel();
        lMalteada.setSize(new Dimension(80, 80));
        lMalteada.setLocation(470, 20);

        rutaMalteada = new String("src/resources/malteada.png");
        ImageIcon iconoMalteada = new ImageIcon(rutaMalteada);
        Image imagenMalteada = iconoMalteada.getImage();
        Image nuevaimagenMalteada = imagenMalteada.getScaledInstance(lMalteada.getWidth(), lMalteada.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalMalteada = new ImageIcon(nuevaimagenMalteada);
        lMalteada.setIcon(imagenFinalMalteada);
        add(lMalteada);

        lHelado = new JLabel();
        lHelado.setSize(new Dimension(80, 80));
        lHelado.setLocation(590, 20);

        rutaHelado = new String("src/resources/helado.png");
        ImageIcon iconoHelado = new ImageIcon(rutaHelado);
        Image imagenHelado = iconoHelado.getImage();
        Image nuevaimagenHelado = imagenHelado.getScaledInstance(lHelado.getWidth(), lHelado.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagenFinalHelado = new ImageIcon(nuevaimagenHelado);
        lHelado.setIcon(imagenFinalHelado);
        add(lHelado);

    }

}
