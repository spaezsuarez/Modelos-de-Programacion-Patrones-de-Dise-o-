package abstraction;


public abstract class Producto {
    
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract double calcularPrecio();
    
    public abstract String mostrarComposicion(); 
    
    
}
