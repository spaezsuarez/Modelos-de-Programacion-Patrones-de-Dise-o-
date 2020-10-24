package practica_prototype;

/**
 *
 * @author jorge malaver
 */
import Figuras.Circulo;
import Figuras.Rectangulo;
import java.util.Scanner;
import Interface.Figuras_geometricas;

public class Practica_Prototype {

   
    public static void main(String[] args) {

        int op, posx, posy;
        Scanner sc = new Scanner(System.in);
        
        Rectangulo rectangulo = Rectangulo.getInstance();
        Circulo circulo = Circulo.getInstance();
        
        Figuras_geometricas geometrica = null;

        rectangulo.setNombre("Rectangulo");
        rectangulo.tamaño(18, 25);

        circulo.setNombre("Circulo");
        circulo.tamaño(15, 30);
        circulo.setRadio(5);

        System.out.println("......ORIGINAL.....");
        System.out.println("Figura Geometrica....." + rectangulo.getNombre());
        System.out.println("Area figura geometrica: " + rectangulo.getArea());
        System.out.println("......TAMAÑO ORIGINAL");
        rectangulo.getposicion();

        System.out.println("\n");

        System.out.println("......ORIGINAL.....");
        System.out.println("Figura Geometrica....." + circulo.getNombre());
        System.out.println("Radio circulo ....." + circulo.getRadio());
        System.out.println("Area figura geometrica: " + rectangulo.getArea());
        System.out.println("......TAMAÑO ORIGINAL");
        circulo.getposicion();

        System.out.println("\n");
        //  figura clonada
        System.out.println("escoja la figura que desea clonar.....");
        System.out.println("1. Rectangulo");
        System.out.println("2. Circulo");
        op = sc.nextInt();

        if (op == 1) {
            geometrica = rectangulo.clonar();
        } else {
            geometrica = circulo.clonar();
        }

        geometrica.setNombre(geometrica.getNombre() + "Figura Clonada");
        System.out.print("Digite el nuevo alto...");
        posx = sc.nextInt();
        System.out.print("Digite el nuevo ancho...");
        posy = sc.nextInt();
        geometrica.tamaño(posx, posy);

        // figura clonada
        System.out.println("....FIGURA CLONADA...");
        System.out.println("Figura Geometrica....." + geometrica.getNombre());
        System.out.println("Area figura geometrica: " + geometrica.getArea());
        System.out.println("...Esta es la posicion...");
        geometrica.getposicion();

        // figura original
        if (op == 1) {
            System.out.println("......ORIGINAL.....");
            System.out.println("Figura Geometrica....." + rectangulo.getNombre());
            System.out.println("Area figura geometrica: " + rectangulo.getArea());
            System.out.println("......TAMAÑO ORIGINAL");
            rectangulo.getposicion();
        } else {
            System.out.println("......ORIGINAL.....");
            System.out.println("Figura Geometrica....." + circulo.getNombre());
            System.out.println("Radio circulo ....." + circulo.getRadio());
            System.out.println("Area figura geometrica: " + rectangulo.getArea());
            System.out.println("......TAMAÑO ORIGINAL");
            circulo.getposicion();
        }
    }

}
