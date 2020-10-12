package modelos;

import abstraccion.Brownie;
import java.util.Date;

public class BrownieFresa extends Brownie  {

    @Override
    public boolean estaCaducado() {
         if (getFechaCaducidad().before(new Date(System.currentTimeMillis()))) {
            return true;
        } else {
            return false;
        }
    }
    
}
