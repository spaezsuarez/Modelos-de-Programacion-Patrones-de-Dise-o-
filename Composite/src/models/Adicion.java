package models;

import abstraction.Producto;

public class Adicion extends Producto {

    @Override
    public double calcularPrecio() {
       return this.getPrecio();
    }

    @Override
    public String mostrarComposicion() {
        return this.getNombre();
    }
    
}
