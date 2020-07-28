package com.company;

public interface iCuentas {
    public void crearCuenta(String titular,int saldo);
    public boolean seleccionarCuenta(String titular);
    public void ingresar(double saldo);
    public void retirar(double saldo);
    public double consultarSaldo();
    public String[][] ultimosMovimientos();
    public void setBloqueo();
    public void deseleccionarCuenta();
    public boolean isBloqueo();
}
