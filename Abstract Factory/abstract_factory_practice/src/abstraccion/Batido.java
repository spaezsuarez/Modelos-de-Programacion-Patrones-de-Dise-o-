package abstraccion;

import java.util.Date;

public abstract class Batido {
    
    private Date fechaCaducidad;
    private String marca;

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getMarca() {
        return marca;
    }
    
    public abstract boolean estaCaducado();
    
}