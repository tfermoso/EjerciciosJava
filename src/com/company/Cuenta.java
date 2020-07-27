package com.company;

public class Cuenta {

    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double i) {
        this.saldo += i;
    }

    public void retirar(double r) {

        this.saldo -= r;
    }
}