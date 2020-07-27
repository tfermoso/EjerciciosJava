package com.company;



public class Cuenta {
    protected double saldo;
    protected boolean bloqueo;
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public  void  ingresar(double cantidad){
        this.saldo+=cantidad;
    }

    public void retirar (double cantidad){
        this.saldo-=cantidad;
    }

    public boolean isBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(boolean bloqueo) {
        this.bloqueo = bloqueo;
    }
}

