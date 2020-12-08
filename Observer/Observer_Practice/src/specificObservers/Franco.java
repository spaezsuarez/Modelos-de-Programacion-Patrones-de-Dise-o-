package specificObservers;

import specificSubjects.PesoColombiano;
import abstraction.Observer;

public class Franco extends Observer {
    
    private static Franco instance;
    
    private Franco(PesoColombiano subject){
        super(subject);
    }
    
    public static Franco getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Franco(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.00025;
    }
    
}
