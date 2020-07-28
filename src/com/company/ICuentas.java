package com.company;

public interface ICuentas {
    public void crearCuenta(String titular, double saldo);

    public void seleccionarCuenta(String titular);

    public void ingresar(double saldo);

    public void retirar(double saldo);

    public double consultarSaldos();

    public String[][] ultimosMovimientos();

    public void bloquear();

    public void desbloquear();
}
