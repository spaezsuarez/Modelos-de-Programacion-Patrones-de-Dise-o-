package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanRollo;

public class FabricaPanRollo implements FabricaPan {
    
    public PanRollo devolverPan(){
        return new PanRollo();
    }

}
