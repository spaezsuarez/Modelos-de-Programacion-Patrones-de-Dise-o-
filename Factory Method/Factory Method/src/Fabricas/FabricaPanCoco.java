package Fabricas;

import Abstracciones.FabricaPan;
import ProductosConcretos.PanCoco;

public class FabricaPanCoco implements FabricaPan {
    
    @Override
    public PanCoco[] devolverPan(int size){
        PanCoco[] encargo = new PanCoco[size];
        
        for(int i = 0; i < size; i++){
            encargo[i] = new PanCoco();
        }
        
        return encargo;
    }

}
