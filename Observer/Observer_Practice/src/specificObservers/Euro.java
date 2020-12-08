package specificObservers;

import specificSubjects.PesoColombiano;
import abstraction.Observer;

public class Euro extends Observer{
    
    private static Euro instance;
    
    private Euro(PesoColombiano subject){
        super(subject);
    }
    
    public static Euro getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Euro(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.00024;
    }
    
}
