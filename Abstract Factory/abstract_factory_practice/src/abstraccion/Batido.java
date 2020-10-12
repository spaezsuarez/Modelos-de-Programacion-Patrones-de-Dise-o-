package abstraccion;

import java.util.Date;

public abstract class Batido {
    
    private Date fechaCaducidad;
    private String marca;
    private double precio;

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getMarca() {
        return marca;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public abstract boolean estaCaducado();
    
}
