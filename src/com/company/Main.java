package com.company;

public class Main {
    public  static void main(String[] args){
        CuentaMovimiento cuenta=new CuentaMovimiento(100);
        cuenta.ingresar(300);
        cuenta.ingresar(1000);
        cuenta.ingresar(460);
        cuenta.retirar(1200);
        cuenta.retirar(3000);
        cuenta.ingresar(400);
        String[][] movimientos=cuenta.consultarMovimientos();
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]);
        }
    }
}
