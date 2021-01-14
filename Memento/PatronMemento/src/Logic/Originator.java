package Logic;

public class Originator {

    private Carro carro;
    
    public Originator(){
        carro = new Carro();
    }
    
    public Memento createMemento() {
        Memento memento = new Memento(carro);
        carro = new Carro();
        return memento;
    }

    public void setMemento(Memento memento) {
        this.carro = memento.getCarro();
    }

    public Carro getCarro() {
        return carro;
    }

}
