package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Desc_Combo extends JPanel {

    private JLabel LblNombreCombo, LblDescCombo;

    public Panel_Desc_Combo() {
        setLayout(null);
        setSize(305, 265);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        initComponents();
    }

    public void initComponents() {
        LblNombreCombo = new JLabel("Nombre del combo");
        LblNombreCombo.setSize(295, 30);
        LblNombreCombo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        LblNombreCombo.setHorizontalAlignment(JLabel.CENTER);
        LblNombreCombo.setLocation(5, 5);
        LblNombreCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(LblNombreCombo);

        LblDescCombo = new JLabel("Descripción del combo");
        LblDescCombo.setSize(295, 220);
        LblDescCombo.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        LblDescCombo.setHorizontalAlignment(JLabel.CENTER);
        LblDescCombo.setLocation(5, 40);
        LblDescCombo.setBorder(BorderFactory.createLineBorder(Color.RED));
        add(LblDescCombo);
    }

    public void setLblNombreCombo(String text) {
        this.LblNombreCombo.setText(text);
    }

    public void setLblDescCombo(String text) {
        this.LblDescCombo.setText(text);
    }

}
