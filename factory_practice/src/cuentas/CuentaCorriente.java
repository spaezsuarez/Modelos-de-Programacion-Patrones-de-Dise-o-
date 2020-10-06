package cuentas;

import abstraccion.Cuenta;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Random;

public class CuentaCorriente extends Cuenta {

    private String comisionPorTransaccion = "0.2";

    public CuentaCorriente() {
        setAplica4x1000(true);
        BigInteger random = new BigInteger(54, new Random());
        setNumeroCuenta(random);
        Calendar calendar = Calendar.getInstance();
        int mes = (int) (Math.random() * 12 + 1);
        int año = (int)(Math.floor(Math.random()*(30-20+1)+20));
        calendar.set(Calendar.MONTH, mes);
        calendar.set(Calendar.YEAR, año);
        java.util.Date fechaUTIL = calendar.getTime();
        setFechaCorte(fechaUTIL);
    }

    @Override
    public void retirarCantidad(long cantidad) {
        setSaldoActual(getSaldoActual() - cantidad);
    }

    @Override
    public void ingresarCantidad(long cantidad) {
        setSaldoActual(getSaldoActual() + cantidad);
    }

    @Override
    public long consultarSaldo() {
        return getSaldoActual();
    }

    @Override
    public void transferirSaldo(Cuenta cuentaATransferir, long valorATransferir) {
        cuentaATransferir.setSaldoActual(cuentaATransferir.getSaldoActual() + valorATransferir);
        setSaldoActual(getSaldoActual() - valorATransferir);
        setSaldoActual(getSaldoActual() - valorATransferir * Long.parseLong(comisionPorTransaccion));
    }

}
