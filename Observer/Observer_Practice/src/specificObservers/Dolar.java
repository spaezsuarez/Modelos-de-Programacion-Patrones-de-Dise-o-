package specificObservers;

import abstraction.Observer;
import specificSubjects.PesoColombiano;

public class Dolar implements Observer {
    
    private static Dolar instance;
    private PesoColombiano subject;
    
    private Dolar(PesoColombiano subject){
        this.subject = subject;
    }
    
    public static Dolar getInstance(PesoColombiano subject){
        if(instance == null){
            instance = new Dolar(subject);
        }
        return instance;
    }
    
    
    @Override
    public void actualizar() {
    }

    @Override
    public double conversion() {
        return 0;
    }
    
}
