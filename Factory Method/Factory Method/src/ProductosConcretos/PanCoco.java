package ProductosConcretos;

import Abstracciones.Pan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class PanCoco extends Pan {
    
    public PanCoco(){
        super();
        this.precio = 3000;
    }

    @Override
    public void iniciarDescomposicion() {
       timer = new Timer(500,new ActionListener() {
            private int contador = 0;
            @Override
            public void actionPerformed(ActionEvent ae) {
                 contador++;
               if(contador == 999999){
                   PanCoco.this.setEstadoDescomposicion(true);
                   PanCoco.this.timer.stop();
               }
            }
        });
        timer.start();
    }
    
}
