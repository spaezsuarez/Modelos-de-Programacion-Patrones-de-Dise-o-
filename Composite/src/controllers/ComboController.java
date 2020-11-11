package controllers;

import Persistence.Lector;
import java.util.ArrayList;
import javax.swing.JLabel;
import models.Adicion;
import models.Combo;

public class ComboController {

    public void establecerProductosCombo(String[] composicion, Combo combo) {

        Lector lector = Lector.getInstance();

        for (String txt : composicion) {
            Adicion adicion = new Adicion();
            String precioConvertir = lector.buscarAdicion2(txt, lector.leerAdiciones())[1];

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
                if (!(pedidos.get(i).getText().substring(0, 9).charAt(8) != '-')) {
                    adicion.setPrecio(Double.parseDouble(lector.buscarAdicion1(pedidos.get(i).getText().substring(0, 8), lector.leerAdiciones())[1]));
                } else {
                    adicion.setNombre(lector.buscarAdicion1(pedidos.get(i).getText().substring(0, 9), lector.leerAdiciones())[0]);
                    adicion.setPrecio(Double.parseDouble(lector.buscarAdicion1(pedidos.get(i).getText().substring(0, 9), lector.leerAdiciones())[1]));
                }
                pedidoFinal.agregarProducto(adicion);

            } else if (pedidos.get(i).getText().charAt(0) == 'C') {
                Combo combo = new Combo();
                String[] composiciones = lector.buscarCombo(pedidos.get(i).getText().substring(0, 6), lector.leerCombos())[2].split(",");
                establecerProductosCombo(composiciones, combo);
                pedidoFinal.agregarProducto(combo);
            }
        }

        return pedidoFinal;
    }

}
