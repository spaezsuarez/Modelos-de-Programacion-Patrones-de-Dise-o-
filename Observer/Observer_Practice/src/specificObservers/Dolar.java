package specificObservers;

import abstraction.Observer;
import specificSubjects.PesoColombiano;

public class Dolar extends Observer {
    
    private static Dolar instance;
    
    private Dolar(PesoColombiano subject){
        super(subject);
    }
    
    public static Dolar getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Dolar(subject);
        }
        return instance;
    }
    
    @Override
    public void actualizar() {
        valorCambio = subject.getValorConversion() * 0.00029;
    }
}
