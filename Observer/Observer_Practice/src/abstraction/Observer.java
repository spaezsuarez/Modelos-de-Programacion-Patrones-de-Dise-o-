package abstraction;

import specificSubjects.PesoColombiano;

public abstract class Observer {
    
    protected double valorCambio;
    protected PesoColombiano subject;
    
    public Observer(PesoColombiano subject){
        this.subject = subject;
    }
    
    public double getValorCambio(){
        return valorCambio;
    }
    
    public abstract void actualizar();
    
}
