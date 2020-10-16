package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanBaguette;

public class FabricaBaguette implements FabricaPan {

    public PanBaguette devolverPan() {
        return new PanBaguette();
    }

}
