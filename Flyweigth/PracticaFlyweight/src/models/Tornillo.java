package models;


public class Tornillo {
    
    private String nombre;
    private boolean estado;
    
    public Tornillo(String nombre){
        this.nombre = nombre;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}
