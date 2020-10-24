package practica_prototype;

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
        rectangulo.posicion(18, 25);
        rectangulo.setAncho(10);
        rectangulo.setAltura(20);
        rectangulo.setArea();

        circulo.setNombre("Circulo");
        circulo.posicion(15, 30);
        circulo.setRadio(5);
        circulo.setArea();

        System.out.println("......ORIGINAL.....");
        System.out.println("Figura Geometrica....." + rectangulo.getNombre());
        System.out.println("Area figura geometrica: " + rectangulo.getArea());
        System.out.println("Ancho figura geometrica: " + rectangulo.getAncho());
        System.out.println("Altura figura geometrica: " + rectangulo.getAltura());
        System.out.println("Posiciones (x,y): (" + rectangulo.getPos_x() + "," + rectangulo.getPos_y() + ")");

        System.out.println("\n");

        System.out.println("......ORIGINAL.....");
        System.out.println("Figura Geometrica....." + circulo.getNombre());
        System.out.println("Radio circulo ....." + circulo.getRadio());
        System.out.println("Area figura geometrica: " + circulo.getArea());
        System.out.println("Posiciones (x,y): (" + circulo.getPos_x() + "," + circulo.getPos_y() + ")");

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
        geometrica.setArea();

        geometrica.setNombre(geometrica.getNombre() + "Figura Clonada");
        System.out.print("Digite la nueva coordenada x...");
        posx = sc.nextInt();
        System.out.print("Digite la nueva coordenada y...");
        posy = sc.nextInt();
        geometrica.posicion(posx, posy);

        // figura clonada
        System.out.println("....FIGURA CLONADA...");
        System.out.println("Figura Geometrica....." + geometrica.getNombre());
        System.out.println("Area figura geometrica: " + geometrica.getArea());
        System.out.println("...Esta es la posicion...");
        System.out.println("Posiciones (x,y): (" + geometrica.getPos_x() + "," + geometrica.getPos_y() + ")");

        // figura original
        if (op == 1) {
            System.out.println("......ORIGINAL.....");
            System.out.println("Figura Geometrica....." + rectangulo.getNombre());
            System.out.println("Area figura geometrica: " + rectangulo.getArea());
            System.out.println("Ancho figura geometrica: " + rectangulo.getAncho());
            System.out.println("Altura figura geometrica: " + rectangulo.getAltura());
            System.out.println("Posiciones (x,y): (" + rectangulo.getPos_x() + "," + rectangulo.getPos_y() + ")");
        } else {
            System.out.println("......ORIGINAL.....");
            System.out.println("Figura Geometrica....." + circulo.getNombre());
            System.out.println("Radio circulo ....." + circulo.getRadio());
            System.out.println("Area figura geometrica: " + circulo.getArea());
            System.out.println("Posiciones (x,y): (" + circulo.getPos_x() + "," + circulo.getPos_y() + ")");
        }
    }

}
