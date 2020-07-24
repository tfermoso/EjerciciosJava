package com.company;

public class Main {
    public  static void main(String[] args){
        CuentaMovimiento cuenta=new CuentaMovimiento(100);
        cuenta.ingresarM(300);
        cuenta.ingresarM(1000);
        cuenta.ingresarM(460);
        cuenta.retirarM(1200);
        cuenta.retirarM(3000);
        cuenta.ingresarM(400);
        String[][] movimientos=cuenta.consultarMovimientos();
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]);
        }
    }
}
