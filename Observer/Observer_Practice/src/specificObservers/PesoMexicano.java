package specificObservers;

import abstraction.Observer;
import specificSubjects.PesoColombiano;

public class PesoMexicano extends Observer {
    
    private static PesoMexicano instance;
    
    private PesoMexicano(PesoColombiano subject){
        super(subject);
    }
    
    public static PesoMexicano getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new PesoMexicano(subject);
        }
        return instance;
    }

    @Override
    public void actualizar() {
        this.valorCambio = subject.getValorConversion() * 0.0057;
    }
    
}
