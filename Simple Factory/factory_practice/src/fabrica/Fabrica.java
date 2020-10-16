package fabrica;

import abstraccion.Cuenta;
import cuentas.*;

public class Fabrica {
    
    private String tipoCuenta;
    
    public Fabrica(String cuenta) {
        tipoCuenta = cuenta;
    }
    
    public Cuenta CrearCuenta() {
        if (tipoCuenta.equals("1")) {
            return new CuentaCorriente();
        } else if (tipoCuenta.equals("2")) {
            return new CuentaDeAhorros();
        } else if (tipoCuenta.equals("3")) {
            return new CuentaDeNomina();
        } else if (tipoCuenta.equals("4")){
            return null;
        } else {
            System.out.println("Opción invalida");
            return null;
        }
    }
    
}
