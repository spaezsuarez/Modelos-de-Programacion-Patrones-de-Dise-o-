package Figuras;

import Interface.Figuras_geometricas;

public class Circulo implements Figuras_geometricas {
    
    private static Circulo instancia;
    
    private String nombre;
    private int ancho,alto;
    private double radio,area;
    
    private Circulo() {}
    
    public static Circulo getInstance(){
        if(instancia == null){
            instancia = new Circulo();
        }     
        return instancia;
    
    }

    @Override
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void tamaño(int x, int y) {
        this.ancho = x;
        this.alto = y;
    }

    @Override
    public void getposicion() {
        System.out.println("Altura del rectangulo .." + this.ancho);
        System.out.println("Ancho del rectangulo...." + this.alto);  
    }

    @Override
    public Figuras_geometricas clonar() {
        Figuras_geometricas figura = new Circulo();
        figura.setNombre(this.nombre);
        figura.tamaño(this.ancho, this.alto);
        return figura;
    }

    @Override
    public double getArea() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public double getRadio(){
        return radio;
    }
    
}
