package specificObservers;

import specificSubjects.PesoColombiano;
import abstraction.Observer;

public class PesoArgentino extends Observer{
    
    private static PesoArgentino instance;
    
    private PesoArgentino(PesoColombiano subject){
        super(subject);
    }
    
    public static PesoArgentino getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new PesoArgentino(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.023414344991108;
    }
    
    
    
}
