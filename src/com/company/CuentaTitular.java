package com.company;

import java.util.ArrayList;
import java.util.List;

public class CuentaTitular extends CuentaMovimientos {

    String titular;



    public CuentaTitular(double saldo, String titular) {
        super(saldo);
        this.titular=titular;

    }
    public String getTitular() {
        return titular;
    }
}
