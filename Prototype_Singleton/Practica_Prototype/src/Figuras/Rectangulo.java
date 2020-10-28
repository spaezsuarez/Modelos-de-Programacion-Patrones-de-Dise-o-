package Figuras;

import Interface.Figuras_geometricas;

public class Rectangulo extends Figuras_geometricas {

    private static Rectangulo instancia;

    private int ancho, altura;

    private Rectangulo() {
    }

    public static Rectangulo getInstance() {
        if (instancia == null) {
            instancia = new Rectangulo();
        }
        return instancia;
    }

    @Override
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public Rectangulo clonar() {
        Rectangulo geometrica = new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.posicion(this.pos_x, this.pos_y);
        geometrica.setAncho(ancho);
        geometrica.setAltura(altura);
        geometrica.setArea();
        geometrica.setArea(area);
        return geometrica;
    }

    @Override
    public void setArea() {
        area = ancho * altura;
    }
    
    public String toString(){
        
        return "<html><body>"+
                "<p>Nombre de la figura: " + Nombre + "</p><br>"
                +"<p>Posicion(x,y): (" +pos_x+","+pos_y+")</p><br>"
                +"<p>Area: "+area+"</p><br>"
                +"<p>Ancho: " + ancho + " alto: " + altura + "</p><br>"
                + "</body></html>";
        
    }

    @Override
    public void establecerDimensiones(double[] valores) {
        setAncho((int) valores[0]);
        setAltura((int) valores[1]);
    }
    
}
