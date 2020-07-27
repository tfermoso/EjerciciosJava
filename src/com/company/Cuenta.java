package com.company;

public class Cuenta {

    protected double saldo;
    public Cuenta(double inicial) {

        saldo = inicial;
    }
    public void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }
    public void extraer(double cantidad) {
        saldo = saldo - cantidad;
    }
    public double saldo() {
        return saldo;

    }
}

