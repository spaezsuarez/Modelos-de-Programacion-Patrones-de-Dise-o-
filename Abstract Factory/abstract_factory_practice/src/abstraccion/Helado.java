package abstraccion;

import java.util.Date;

public abstract class Helado {

    private Date fechaCaducidad;
    private String marca;
    private int precio = 2000;

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
