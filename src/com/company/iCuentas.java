package com.company;

public interface iCuentas {//interfaz y metodos
    public void crearCuenta(String titular, double saldo);
    public void seleccionarCuenta(String titular);
    public void ingresar(double saldo);
    public void retirar(double saldo);
    public double consultarSaldo();
    public String[][] ultimoMovimiento();
    public void bloquear();
    public void desbloquear();

}
