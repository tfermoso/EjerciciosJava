package com.company;

public class CuentaTitular extends CuentaMovimientos {//hereda de cuentamovimiento
    private String titular;
    public CuentaTitular(double saldo, String titular) {
        super(saldo);//padre
        this.titular=titular;
    }

    public String getTitular() {//base
        return titular;
    }
}
