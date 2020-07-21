package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] loteria = new int[6];
        int contador = 0;
        do {
            //Genera número aleatorio
            Random rand = new Random();
            Integer numero = rand.nextInt(50);
            //comprueba si ya está

            if (comprobarArray(numero, loteria)) {
                loteria[contador] = numero;
                contador++;
            }

        } while (contador < 6);
        for (int i = 0; i < loteria.length; i++) {
            System.out.println(loteria[i] + ",");

        }
        System.out.println("");

    }
    private static boolean comprobarArray(Integer numero, int[] loteria) {
        for (int i = 0; i < loteria.length ; i++) {
            if (loteria[i]==numero) return true;

        }
        return false;
    }
}




