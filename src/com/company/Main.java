package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaMovimientos cuenta = new CuentaMovimientos(1500);
        cuenta.ingresarM(500);
        cuenta.retirarM(200);
        cuenta.ingresarM(120);
        cuenta.retirarM(110);
        cuenta.ingresarM(900);
        cuenta.retirarM(50);
        String[][] movimientos = cuenta.consultarMovimientos();
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println("Tipo: " + movimientos[i][0] + ", cantidad:" + movimientos[i][1]);

        }
        System.out.println("Tu saldo actual es de: " + cuenta.saldo);
    }

}


