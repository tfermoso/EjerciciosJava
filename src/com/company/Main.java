package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

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
            for (int i = 0; i <loteria.length ; i++) {
                    if (numero!=loteria[1]&&numero!=loteria[2]&&numero!=loteria[3]&&numero!=loteria[4]
                            &&numero!=loteria[5]&&numero!=loteria[0]&& numero!=0){
                        loteria[contador]=numero;
                        contador++;
                    }
                }
        }while (contador<6);
        for (int i = 0; i <loteria.length ; i++) {
            System.out.println(loteria[i]);
        }
    }
}

