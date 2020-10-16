package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanBaguette;

public class FabricaBaguette implements FabricaPan {

    public PanBaguette[] devolverPan(int size) {
        
        PanBaguette[] encargo = new PanBaguette[size];
        
        for(int i  = 0; i < size; i++){
            encargo[i] = new PanBaguette();
        }
        
        return encargo;
    }

}
