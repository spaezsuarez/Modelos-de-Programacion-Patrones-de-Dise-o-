package modelos;

import abstraccion.Batido;
import java.util.Date;

public class BatidoChocolate extends Batido {

    @Override
    public boolean estaCaducado() {
          if (getFechaCaducidad().before(new Date(System.currentTimeMillis()))) {
            return true;
        } else {
            return false;
        }
    }
    
}
