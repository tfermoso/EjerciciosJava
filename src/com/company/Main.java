package com.company;



public class Main {

    public static void main(String[] args) {
CuentaMovimientos cuenta=new CuentaMovimientos(100);
cuenta.ingresarM(300);
cuenta.ingresarM(1000);
cuenta.ingresarM(1500);
cuenta.retirarM(200);
cuenta.retirarM(300);
cuenta.ingresarM(400);
cuenta.retirarM(500);
String [][]movimientos=cuenta.consultar();
        for (int i = 0; i <movimientos.length ; i++) {

            System.out.println("Tipo:" + movimientos[i][0]+",Cantidad:" + movimientos[i][1]);

        }
    }
}