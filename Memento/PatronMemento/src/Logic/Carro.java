package Logic;

public class Carro {

    private String tipoRin;
    private String tipoLlantas;
    private String tipoMotor;
    private String tipoTracción;
    private String tipoTransmisión;

    public String getTipoRin() {
        return tipoRin;
    }

    public void setTipoRin(String tipoRin) {
        this.tipoRin = tipoRin;
    }

    public String getTipoLlantas() {
        return tipoLlantas;
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoTracción() {
        return tipoTracción;
    }

    public void setTipoTracción(String tipoTracción) {
        this.tipoTracción = tipoTracción;
    }

    public String getTipoTransmisión() {
        return tipoTransmisión;
    }

    public void setTipoTransmisión(String tipoTransmisión) {
        this.tipoTransmisión = tipoTransmisión;
    }

    public String toString() {
        return "Rin: " + tipoRin + "\n" + "Llantas: " + tipoLlantas + "\n" + "Motor: " + tipoMotor + "\n" + "Tracción: " + tipoTracción + "\n" + "Transmisión: " + tipoTransmisión + "\n\n";
    }

    public boolean equals(Carro carro) {
        if (!this.getTipoRin().equals(carro.getTipoRin())) {
            return false;
        }
        if (!this.getTipoLlantas().equals(carro.getTipoLlantas())) {
            return false;
        }
        if (!this.getTipoMotor().equals(carro.getTipoMotor())) {
            return false;
        }
        if (!this.getTipoTracción().equals(carro.getTipoTracción())) {
            return false;
        }
        if (!this.getTipoTransmisión().equals(carro.getTipoTransmisión())) {
            return false;
        }
        return true;
    }

}
