package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //practica 9.1
        int []numeros=new int[24];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            System.out.println("Introduce el texto: ");
            numeros[i] = leer.nextInt();
        }





        //Ordenar el Array;
        int minimo;
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            minimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j;
                }
            }
            aux = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = aux;

        }
        //Llenar la matriz;
        int[][]matrizNumeros=new int[4][6];
        int indice=0;
        //nºfilas;
        for (int i = 0; i <matrizNumeros.length ; i++) {
            //nºcolumnas;
            for (int j = 0; j <matrizNumeros[0].length ; j++) {
                matrizNumeros[i][j]=numeros[indice];
                indice++;

            }

        }

            //Pintar la matriz
        for (int i = 0; i <matrizNumeros.length ; i++) {
            //nºcolumnas;
            for (int j = 0; j <matrizNumeros[0].length ; j++) {
                System.out.print(matrizNumeros[i][j]+",");
            }
            System.out.println("----------");
        }
    }
}