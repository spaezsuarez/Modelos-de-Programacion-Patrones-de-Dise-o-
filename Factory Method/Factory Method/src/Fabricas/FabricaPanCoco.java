package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanCoco;

public class FabricaPanCoco implements FabricaPan {
    
    public PanCoco devolverPan(){
        return new PanCoco();
    }

}
