package ProductosConcretos;

import Abstracciones.Pan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class PanRollo extends Pan {
    
    public PanRollo(){
        super();
        this.precio = 3500;
    }

    @Override
    public void iniciarDescomposicion() {
        timer = new Timer(300000, new ActionListener() {
            private int contador = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
                if (contador == 99999) {
                    PanRollo.this.setEstadoDescomposicion(true);
                    PanRollo.this.timer.stop();
                }
            }
        });
        timer.start();
    }
    
}
