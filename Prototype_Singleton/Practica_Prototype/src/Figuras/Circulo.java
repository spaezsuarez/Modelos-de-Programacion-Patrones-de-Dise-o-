package Figuras;

import Interface.Figuras_geometricas;

public class Circulo extends Figuras_geometricas {
    
    private static Circulo instancia;
    
    private double radio;
    
    private Circulo() {
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public static Circulo getInstance() {
        if (instancia == null) {
            instancia = new Circulo();
        }
        return instancia;
    }
    
    public void tamaño(double radio) {
        this.radio = radio;
    }
    
    @Override
    public Figuras_geometricas clonar() {
        Circulo figura = new Circulo();
        figura.setNombre(Nombre);
        figura.tamaño(radio);
        figura.posicion(pos_x, pos_y);
        figura.setRadio(radio);
        figura.setArea();
        return figura;
    }
    
    public double getRadio() {
        return radio;
    }
    
    @Override
    public void setArea() {
        area = Math.pow(radio, 2) * Math.PI;
    }
    
}
