package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        CuentaMovimiento cuenta=new CuentaMovimiento(100);
        cuenta.ingresar(300);
        cuenta.ingresar(800);
        cuenta.ingresar(700);
        cuenta.retirar(500);
        cuenta.retirar(200);
        String[][] movimientos=cuenta.consultaMovimientos();

        for (int i = 0; i < movimientos.length ; i++) {
            System.out.println("Tipo: "+movimientos[i][0] + "cantidad: "+ movimientos[i][0]);

        }

    }
}


