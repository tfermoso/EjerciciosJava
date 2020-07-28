package com.company;

public interface iCuentas {
    public void crearCuenta(String titular, double saldo);

    public void selectCuenta(String titular);

    public void ingresar(double saldo);

    public void retirar(double saldo);

    public double consultarSaldo();

    public String[][] ultimosMovimientos();

    public void bloquear();

    public void desbloquear();

    boolean cuentaSeleccionada();
}
