package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.BorderUIResource;

public class Frame extends JFrame {

    private JLabel LblTxtTitle, LblImgCirculo, LblImgRectangulo;
    private JButton BtnFiguraCirculo, BtnFiguraRectangulo;
    private String rutaCirculo, rutaRectangulo;
    
    private static Frame instance;

    private Frame() {
        setLayout(null);
        setTitle("Menú");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        initListeners();
        setVisible(true);
    }
    
    public static Frame getInstance(){
        if(instance == null){
            instance = new Frame();
        }
        
        return instance;
    }
    

    public void initListeners() {
        BtnFiguraCirculo.addActionListener((ActionEvent ae) -> {
            FiguraComponent circuloFrame = new FiguraComponent("Circulo");
            circuloFrame.initTemplate();
        });

        BtnFiguraRectangulo.addActionListener((ActionEvent ae) -> {
            FiguraComponent RectanguloFrame = new FiguraComponent("Rectangulo");
            RectanguloFrame.initTemplate();
        });
    }

    public void initComponents() {

        LblTxtTitle = new JLabel("Escoja su figura");
        LblTxtTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        LblTxtTitle.setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK));
        LblTxtTitle.setSize(200, 50);
        LblTxtTitle.setLocation(40, 25);
        LblTxtTitle.setVisible(true);
        LblTxtTitle.setHorizontalAlignment(JLabel.CENTER);
        LblTxtTitle.setFocusable(false);
        add(LblTxtTitle);

        LblImgCirculo = new JLabel();
        LblImgCirculo.setSize(100, 100);
        rutaCirculo = new String("src/Resources/Círculo.png");
        ImageIcon instr = new ImageIcon(rutaCirculo);
        Image imginstr = instr.getImage();
        Image nuevaimagen = imginstr.getScaledInstance(LblImgCirculo.getWidth(), LblImgCirculo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen = new ImageIcon(nuevaimagen);
        LblImgCirculo.setIcon(imagen);
        LblImgCirculo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        LblImgCirculo.setLocation(30, 90);
        LblImgCirculo.setVisible(true);
        LblImgCirculo.setHorizontalAlignment(JLabel.CENTER);
        add(LblImgCirculo);

        LblImgRectangulo = new JLabel();
        LblImgRectangulo.setSize(140, 140);
        rutaRectangulo = new String("src/Resources/Rectángulo.png");
        ImageIcon instr2 = new ImageIcon(rutaRectangulo);
        Image imginstr2 = instr2.getImage();
        Image nuevaimagen2 = imginstr2.getScaledInstance(LblImgRectangulo.getWidth(), LblImgRectangulo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagen2 = new ImageIcon(nuevaimagen2);
        LblImgRectangulo.setIcon(imagen2);
        LblImgRectangulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        LblImgRectangulo.setLocation(130, 70);
        LblImgRectangulo.setVisible(true);
        LblImgRectangulo.setHorizontalAlignment(JLabel.CENTER);
        add(LblImgRectangulo);

        BtnFiguraCirculo = new JButton("Círculo");
        BtnFiguraCirculo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        BtnFiguraCirculo.setSize(100, 20);
        BtnFiguraCirculo.setLocation(30, 215);
        BtnFiguraCirculo.setVisible(true);
        add(BtnFiguraCirculo);

        BtnFiguraRectangulo = new JButton("Rectángulo");
        BtnFiguraRectangulo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        BtnFiguraRectangulo.setSize(115, 20);
        BtnFiguraRectangulo.setLocation(140, 215);
        BtnFiguraRectangulo.setVisible(true);
        add(BtnFiguraRectangulo);
    }
}
