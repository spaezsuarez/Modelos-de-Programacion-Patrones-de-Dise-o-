package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanIntegral;

public class FabricaPanIntegral implements FabricaPan {
    
    public PanIntegral devolverPan(){
        return new PanIntegral();
    }

}
