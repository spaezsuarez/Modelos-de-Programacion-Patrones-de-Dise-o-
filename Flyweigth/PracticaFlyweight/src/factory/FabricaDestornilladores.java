package factory;

import abstraction.Destornillador;
import models.DesatornilladorConcreto;
import java.util.ArrayList;

public class FabricaDestornilladores {
    
    private ArrayList<Destornillador> herramientas;
    
    public FabricaDestornilladores(){
        herramientas = new ArrayList<>();
    }
    
    public Destornillador get(String marca,String tipoPunta,double tamaño){
        
       for(Destornillador e:herramientas){
           if(e.getMarca().equals(marca) && e.getTamaño() == tamaño && e.getTipoPunta().equals(tipoPunta)){
                return e;
            }
       }
        
       DesatornilladorConcreto destornillador = new DesatornilladorConcreto(tipoPunta,marca,tamaño);
       herramientas.add(destornillador);
       
       return destornillador;
    }
    
    
}
