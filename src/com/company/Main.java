package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {//ejercicio
         CuentaMovimientos cuenta=new CuentaMovimientos(100);
         cuenta.ingresarI(300);
         cuenta.ingresarI(1000);
         cuenta.ingresarI(400);
         cuenta.retirarR(1200);
         cuenta.retirarR(3000);
         cuenta.ingresarI(400);
        String[][] movimientos=cuenta.consultarMovimientos();
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]);
        }
    }


}




