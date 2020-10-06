package main;

import abstraccion.Cuenta;
import fabrica.Fabrica;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {
        String Lectura;
        Scanner entrada;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yy");
        do {
            entrada = new Scanner(System.in);
            System.out.println("Ingrese la cuenta que desea abrir: ");
            System.out.println("1. Cuenta corriente");
            System.out.println("2. Cuenta de ahorros");
            System.out.println("3. Cuenta de nomina");
            Lectura = entrada.nextLine();
            Fabrica fabrica = new Fabrica(Lectura);
            Cuenta nuevaCuenta = fabrica.CrearCuenta();
            if (nuevaCuenta != null) {
                System.out.println("Su cuenta de tipo: " + nuevaCuenta.getClass().getSimpleName() + " con número de identificación " + nuevaCuenta.getNumeroCuenta() + " y fecha de expiración: " + formatter.format(nuevaCuenta.getFechaCorte()) + "Ha sido creada");
            } else if (Lectura.equals("4")) {
                System.out.println("Vuelva pronto");
            }
        } while (!Lectura.equals("4"));
        entrada.close();
    }
}
