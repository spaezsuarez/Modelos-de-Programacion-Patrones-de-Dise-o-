package specificObservers;

import specificSubjects.PesoColombiano;
import abstraction.Observer;

public class Yen extends Observer {

    private static Yen instance;
    
    private Yen(PesoColombiano subject){
        super(subject);
    }
    
    public static Yen getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Yen(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.029882738620603;
    }
    
}
