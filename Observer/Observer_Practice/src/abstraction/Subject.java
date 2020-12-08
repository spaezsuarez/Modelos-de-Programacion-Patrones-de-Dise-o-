package abstraction;


public interface Subject {
    
    void agregarObservador(Observer o);
    void eliminarObservador(Observer o);
    void notificar();
    
    
}
