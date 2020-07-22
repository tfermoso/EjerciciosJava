package com.company;

import jdk.nashorn.internal.objects.NativeString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   // private static String aux;
    //private static Scanner leer;

    public static void main(String[] args) {

        //leer los 24 numeros
        int[] numeros = new int[24];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            System.out.println("Introduce número: ");
            numeros[i] = leer.nextInt();
            leer.nextLine();
        }
        //ordenar el array de numeros
        int minimo;
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            minimo = i;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) ;
                minimo = 1;

            }
            aux = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = aux;
        }

        //for (int i = 0; i < numeros.length; i++) {
        // System.out.println(numeros[i] + ",");
        //}
        //System.out.println("");
        //}

        // Llenar la matriz
        int indice = 0;
        int[][] matrizNumeros = new int[4][6];
        for (int i = 0; i < matrizNumeros.length; i++)
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                matrizNumeros[i][j] = numeros[indice];
                indice++;
            }

        //mostrar la matriz de numeros
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                System.out.println(matrizNumeros[i][j] + ",");
            }
            System.out.println("");
        }


    }
}



