package models;

import abstraction.Producto;
import java.util.ArrayList;

public class Combo extends Producto {

    private ArrayList<Producto> productos = new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double precio = 0;
        for(Producto prodc: productos){
            precio+=prodc.getPrecio();
        }
        return precio;
    }

    @Override
    public String mostrarComposicion() {
        String comp = "";
        for(Producto prodc: productos){
            comp.concat(prodc.getNombre() + " + ");
        }
        return comp;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.forEach((producto) -> {
            if (p == producto) {
                productos.remove(p);
            }
        });
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

}
