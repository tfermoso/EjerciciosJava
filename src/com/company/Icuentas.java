package com.company;

public interface Icuentas {

    public void crearCuenta(String titular,double saldo);
    public  void seleccionarCuenta(String titular);
    public void ingresar(double saldo);
    public void retirar (double saldo);
    public double consultaSaldo();
    public String[][]consultar();
    public void bloquear();
    public void desbloquear();
    public boolean resultadoUltimaOperacio();



}
