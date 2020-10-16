package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanRollo;

public class FabricaPanRollo implements FabricaPan {
    
    public PanRollo[] devolverPan(int size){
        PanRollo[] encargo = new PanRollo[size];
        
        for(int i = 0; i < size; i++)
            encargo[i] = new PanRollo();
        
        return encargo;
    }

}
