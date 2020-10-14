package abstraccion;

import java.util.Date;

public abstract class Brownie {
    
    private Date fechaCaducidad;
    private String marca;
    private int precio=2500;

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
