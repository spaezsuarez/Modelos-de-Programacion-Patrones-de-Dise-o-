package Logic;

public class Memento {

    private Carro carro;

    public Memento(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }
}
