package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Realizar un algortimo que genere una combinación de la lotería primitiva. El objetivo es
        // generar 6 números aleatorios entre 1 y 49 que no se repitan. Puedes utilizar la
        // función GenerarAleatorio utilizada en los ejemplos del manual
        int contador=0;
        int[] loteria=new int[6];
        Random random = new Random();
        do {
            int upperbound = 49;
            int numero = random.nextInt(upperbound);
            if (numero != 0) {
                if (comprobarArray(numero, loteria, contador) == true) {
                    contador++;
                }
            }
        }while (contador<6);
        for (int i = 0; i <loteria.length ; i++) {
            System.out.println(loteria[i]);
        }
    }

    private static boolean comprobarArray(int numero, int[] loteria,int contador) {
        boolean presente=false;
        for (int i = 0; i <loteria.length ; i++) {
            if (numero==loteria[i]&&numero!=0){
                presente=true;
            }
        } if (presente!=true){
            loteria[contador]=numero;
        }
        return presente;
    }
}