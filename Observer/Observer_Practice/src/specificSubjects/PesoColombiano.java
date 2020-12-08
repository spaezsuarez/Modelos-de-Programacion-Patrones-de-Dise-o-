package specificSubjects;

import abstraction.Subject;
import abstraction.Observer;
import java.util.ArrayList;

public class PesoColombiano implements Subject {
    
    private ArrayList<Observer> observadores;
    private double valorConversion;

    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observer o) {
        observadores.forEach((e) -> {
            if(e == o)
                observadores.remove(e);
        });
    }

    @Override
    public void notificar() {
        for(int i = 0; i < observadores.size(); i++){
            observadores.get(i).actualizar();
        }
    }
    
    public void setValorConversion(double valor){
        this.valorConversion = valor;
        notificar();
    }
    
    public double getValorConversion(){
        return valorConversion;
    }
    
    
    
}
