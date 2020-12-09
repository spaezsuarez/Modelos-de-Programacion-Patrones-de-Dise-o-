package specificObservers;

import specificSubjects.PesoColombiano;
import abstraction.Observer;

public class Real extends Observer {
    
    private static Real instance;
    
    private Real(PesoColombiano subject){
        super(subject);
    }
    
    public static Real getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Real(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.0014692116470668;
    }
    
}
