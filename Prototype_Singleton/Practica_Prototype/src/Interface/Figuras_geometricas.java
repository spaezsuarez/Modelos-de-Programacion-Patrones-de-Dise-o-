package Interface;

public abstract class Figuras_geometricas { //Interfaz referente al prototipo abstracto que delegara la funcion de clonarse

    /*
        Metodos a que indican el comportamiento que deben tener las figuras que implementen 
        la interfaz Figuras_Geometricas
     */
    protected String Nombre;
    protected int pos_x, pos_y;
    protected double area;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void posicion(int x, int y) {
        pos_x = x;
        pos_y = y;
    }
    
    public abstract void setArea();
    
    public abstract void establecerDimensiones(double[] valores);

    public abstract Figuras_geometricas clonar(); //Metodo clave del patron, el cual devolvera una copia del objeto actual que implemente esta interfaz
}
