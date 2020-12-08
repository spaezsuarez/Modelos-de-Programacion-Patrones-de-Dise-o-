package specificObservers;

import specificSubjects.PesoColombiano;
import abstraction.Observer;

public class Yuan extends Observer {
    
    private static Yuan instance;
    
    private Yuan(PesoColombiano subject){
        super(subject);
    }
    
    public static Yuan getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Yuan(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.0019;
    }
    
}
