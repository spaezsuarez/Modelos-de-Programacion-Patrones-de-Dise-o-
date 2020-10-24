package Interface;

/**
 *
 * @author jorge malaver
 */
public interface Figuras_geometricas { //Interfaz referente al prototipo abstracto que delegara la funcion de clonarse
    
    
    /*
        Metodos a que indican el comportamiento que deben tener las figuras que implementen 
        la interfaz Figuras_Geometricas
    */
    public void setNombre(String nombre);
    public String getNombre();
    public void tamaño(int x, int y);
    public void getposicion();
    public double getArea();
   
    
    public Figuras_geometricas clonar(); //Metodo clave del patron, el cual devolvera una copia del objeto
                                         // actual que implemente esta interfaz
}
