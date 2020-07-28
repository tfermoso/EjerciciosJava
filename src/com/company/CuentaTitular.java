package com.company;

public class CuentaTitular extends CuentaMovimientos {
    private String titular;
    public CuentaTitular(double saldo, String titular) {
        super(saldo);
        this.titular=titular;
    }

    public String getTitular() {
        return titular;
    }

}
