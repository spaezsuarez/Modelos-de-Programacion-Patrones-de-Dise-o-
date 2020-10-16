package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanIntegral;

public class FabricaPanIntegral implements FabricaPan {
    
    public PanIntegral[] devolverPan(int size){
        PanIntegral[] encargo = new PanIntegral[size];
        
        for(int i = 0; i < size; i++){
            encargo[i] = new PanIntegral();
        }
        
        return encargo;
    }

}
