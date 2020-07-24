package com.company;

public class Main {
    public static void main(String[] args) {

        CuentaMovimientos cuenta = new CuentaMovimientos(100);
        cuenta.ingresarM(300);
        cuenta.ingresarM(400);
        cuenta.ingresarM(500);
        cuenta.ingresarM(300);
        cuenta.ingresarM(800);
        cuenta.ingresarM(300);
        cuenta.retirarM(1000);


        String[][] movimientos = cuenta.consultarMovimientos();
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println("Tipo: " + movimientos[i][0] + ",Cantidad: " + movimientos[i][1]);

        }
    }

}


