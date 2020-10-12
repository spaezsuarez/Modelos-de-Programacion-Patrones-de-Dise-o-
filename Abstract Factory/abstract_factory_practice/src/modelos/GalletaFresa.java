package modelos;

import abstraccion.Galleta;
import java.util.Date;

public class GalletaFresa extends Galleta{

    @Override
    public boolean estaCaducado() {
         if (getFechaCaducidad().before(new Date(System.currentTimeMillis()))) {
            return true;
        } else {
            return false;
        }
    }
    
}
