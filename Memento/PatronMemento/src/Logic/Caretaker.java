package Logic;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    public ArrayList<Memento> getMementos() {
        return mementos;
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public boolean compCarro(Carro carro) {
        for (Memento a : mementos) {
            if (a.getCarro().equals(carro)) {
                return true;
            }
        }
        return false;
    }
}
