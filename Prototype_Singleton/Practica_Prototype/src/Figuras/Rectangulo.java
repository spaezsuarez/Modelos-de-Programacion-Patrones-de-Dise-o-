package Figuras;

/**
 *
 * @author jorge malaver
 */
import Interface.Figuras_geometricas;

public class Rectangulo implements Figuras_geometricas{
    
    private static Rectangulo instancia;
    
    private String Nombre;
    private int pos_x, pos_y;
    private double area;
    
    private Rectangulo(){}
    
    public static Rectangulo getInstance(){
        if(instancia == null){
            instancia = new Rectangulo();
        }
        
        return instancia;
        
    }
    
    @Override
    public void setNombre(String nombre){
     this.Nombre = nombre;   
    }
    @Override
    public String getNombre(){
        return Nombre;
    }
     
    @Override
    public void tamaño(int x, int y){
           pos_x = x;
           pos_y = y;
        
    }
    
    @Override
    public void getposicion(){
       System.out.println("Altura del rectangulo .." + this.pos_y);
       System.out.println("Ancho del rectangulo...." + this.pos_x);  
    }
    
    @Override
    public Figuras_geometricas clonar(){
       
        Figuras_geometricas geometrica= new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }

    @Override
    public double getArea() {
        area = (pos_x*pos_y)/2;
        return area;
    }
}
