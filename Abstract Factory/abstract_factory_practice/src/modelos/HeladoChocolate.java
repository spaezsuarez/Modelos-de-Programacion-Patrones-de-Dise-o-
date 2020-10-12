package modelos;

import abstraccion.Helado;
import java.util.Date;

public class HeladoChocolate extends Helado {

    @Override
    public boolean estaCaducado() {
         if (getFechaCaducidad().before(new Date(System.currentTimeMillis()))) {
            return true;
        } else {
            return false;
        }
    }
    
}
