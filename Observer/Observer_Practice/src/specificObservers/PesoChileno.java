package specificObservers;

import abstraction.Observer;
import specificSubjects.PesoColombiano;

public class PesoChileno extends Observer {
    
    private static PesoChileno instance;
    
    private PesoChileno(PesoColombiano subject){
        super(subject);
    }
    
    public static PesoChileno getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new PesoChileno(subject);
        }
        return instance;
    }

    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.21370604147881;
    }
    
}
