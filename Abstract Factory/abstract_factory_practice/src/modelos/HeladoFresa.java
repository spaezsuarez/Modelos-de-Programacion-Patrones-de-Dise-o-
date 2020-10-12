package modelos;

import abstraccion.Helado;

public class HeladoFresa extends Helado {

    @Override
    public boolean estaCaducado() {
        return true;
    }
    
}
