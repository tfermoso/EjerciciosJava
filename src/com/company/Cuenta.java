package com.company;


public class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
        this.saldo += cantidad;

    }

    public void retirar(double cantidad) {
        if(saldo>=cantidad){
            this.saldo -= cantidad;
        }else{
            System.out.println("Saldo insuficiente");
        }


    }
}


