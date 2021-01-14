package ProductosConcretos;

import Abstracciones.Pan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class PanIntegral extends Pan {
    
    public PanIntegral(){
        super();
        this.precio = 2000;
    }

    @Override
    public void iniciarDescomposicion() {
        timer = new Timer(500,new ActionListener() {
            private int contador = 0;
            @Override
            public void actionPerformed(ActionEvent ae) {
                 contador++;
               if(contador == 9999999){
                   PanIntegral.this.setEstadoDescomposicion(true);
                   PanIntegral.this.timer.stop();
               }
            }
        });
        timer.start();
    }
    
}
