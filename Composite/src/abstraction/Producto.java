package abstraction;


public abstract class Producto {
    
    private String nombre;
    private double precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract double calcularPrecio();
    
    public abstract String mostrarComposicion(); 
    
    
}
