package abstraccion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public abstract class Cuenta {

    private String banco;

    private BigInteger numeroCuenta;

    private ArrayList<String> propietarios;

    private long saldoActual;

    private Date fechaCorte;

    private boolean Aplica4x1000 = true;

    private boolean AplicaReteFuente = false;

    public BigInteger getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(BigInteger numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public ArrayList<String> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<String> propietarios) {
        this.propietarios = propietarios;
    }

    public long getSaldoActual() {
        return saldoActual;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setSaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public boolean isAplica4x1000() {
        return Aplica4x1000;
    }

    public void setAplica4x1000(boolean Aplica4x1000) {
        this.Aplica4x1000 = Aplica4x1000;
    }

    public boolean isAplicaReteFuente() {
        return AplicaReteFuente;
    }

    public void setAplicaReteFuente(boolean AplicaReteFuente) {
        this.AplicaReteFuente = AplicaReteFuente;
    }

    public abstract void retirarCantidad(long cantidad);

    public abstract void ingresarCantidad(long cantidad);

    public abstract long consultarSaldo();

    public abstract void transferirSaldo(Cuenta cuentaATransferir, long valorATransferir);

}
