package models;

import abstraction.Producto;
import java.util.ArrayList;

public class Combo extends Producto {
    
    private ArrayList<Producto> productos = new ArrayList<>();

    @Override
    public void calcularPrecio() {
        
    }

    @Override
    public String mostrarComposicion() {
        return "";
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void eliminarProducto(Producto p){
        productos.forEach((producto) -> {
            if(p == producto){
                productos.remove(p);
            }
        });
    }   
    
}
