package controllers;

import Persistence.Lector;
import java.util.ArrayList;
import javax.swing.JLabel;
import models.Adicion;
import models.Combo;

public class ComboController {

    public void establecerProductosCombo(String[] composicion, Combo combo) {

        Lector lector = Lector.getInstance();
        //System.out.println("Lector: " +lector);

        for (String txt : composicion) {
            Adicion adicion = new Adicion();
            //System.out.println("txt: " + txt);
            //lector.leerAdiciones().forEach((e) -> {System.out.println(e);});
            String precioConvertir = lector.buscarAdicion(txt, lector.leerAdiciones())[1];
            
            adicion.setPrecio(Double.parseDouble(precioConvertir));
            combo.agregarProducto(adicion);
        }
    }

    public Combo initCombo(ArrayList<JLabel> pedidos) {

        Lector lector = Lector.getInstance();
        Combo pedidoFinal = new Combo();

        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getText().charAt(0) == 'A') {
                Adicion adicion = new Adicion();
                if (i + 1 <= 9) {
                    adicion.setPrecio(Double.parseDouble(lector.buscarAdicion(pedidos.get(i).getText().substring(0, 8), lector.leerAdiciones())[1]));
                } else {
                    adicion.setNombre(lector.buscarAdicion(pedidos.get(i).getText().substring(0, 9), lector.leerAdiciones())[0]);
                    adicion.setPrecio(Double.parseDouble(lector.buscarAdicion(pedidos.get(i).getText().substring(0, 9), lector.leerAdiciones())[1]));
                }
                pedidoFinal.agregarProducto(adicion);

            } else if (pedidos.get(i).getText().charAt(0) == 'C') {
                Combo combo = new Combo();
                String[] composiciones = lector.buscarCombo(pedidos.get(i).getText().substring(0, 6), lector.leerCombos())[2].split(",");
                establecerProductosCombo(composiciones, combo);
                pedidoFinal.agregarProducto(combo);

            }
        }
        
        pedidoFinal.getProductos().forEach((r) -> {
            System.out.println(r);
        });
        return pedidoFinal;
    }

}
