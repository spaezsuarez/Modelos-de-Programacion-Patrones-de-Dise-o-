package models;

import abstraction.Destornillador;

public class DesatornilladorConcreto implements Destornillador {
    
    private String tipoPunta,marca;
    private double tamaño;

    public DesatornilladorConcreto(String tipoPunta, String marca,double tamaño) {
        this.tipoPunta = tipoPunta;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    @Override
    public String getTipoPunta() {
       return tipoPunta;
    }

    @Override
    public double getTamaño() {
        return tamaño;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void desatornillar(Tornillo tipoTornillo) {
        tipoTornillo.setEstado(!tipoTornillo.getEstado());
    }
    
}
