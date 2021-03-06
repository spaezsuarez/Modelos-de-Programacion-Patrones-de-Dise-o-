package abstraccion;

import java.util.Date;

public abstract class Galleta {
    
    private Date fechaCaducidad;
    private String marca;
    private int precio=1500;

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }
    
    public abstract boolean estaCaducado();
    
}
