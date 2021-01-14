package Abstracciones;

import javax.swing.Timer;

public abstract class Pan {

    private double cantidadHarina;
    private double cantidadAzucar;
    private boolean estadoDescomposicion;
    protected double precio;
    
    protected Timer timer;
    
    public Pan(){
        iniciarDescomposicion();
        this.estadoDescomposicion = false;
    }

    public double getCantidadHarina() {
        return cantidadHarina;
    }

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }
    
    public double getPrecio(){
        return precio;
    }

    public void setCantidadHarina(double cantidadHarina) {
        this.cantidadHarina = cantidadHarina;
    }

    public void setCantidadAzucar(double cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public void setEstadoDescomposicion(boolean estadoDescomposicion) {
        this.estadoDescomposicion = estadoDescomposicion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract void iniciarDescomposicion();
    
    public boolean estaDescompuesto(){
        if(estadoDescomposicion){
            return true;
        }
        return false;
    }
    
    

}
