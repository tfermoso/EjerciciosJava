package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Leemos los 24 números
        int[] numeros=new int[24];
        numeros=leerNumeros(numeros);

        //Ordenamos el array de números
        int[] arrayOrdenado;
        arrayOrdenado=ordenarArray(numeros);

        //Llenar la matriz
        int[][] matrizNumeros=new int[4][6];
        matrizNumeros=llenarMatriz(matrizNumeros,arrayOrdenado);

        //mostrar la matriz
        mostrarMatriz(matrizNumeros);

    }

    private static int[][] llenarMatriz(int[][] matrizNumeros, int[] arrayOrdenado) {
        int indice=0;
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                matrizNumeros[i][j]=arrayOrdenado[indice];
                indice++;
            }
        }
        return matrizNumeros;
    }

    private static int[] ordenarArray(int[] numeros) {
        int minimo;
        int aux;
        for (int i = 0; i < numeros.length-1 ; i++) {
            minimo=i;
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[j]<numeros[minimo]) {
                    minimo = j;
                }
            }
            aux=numeros[i];
            numeros[i]=numeros[minimo];
            numeros[minimo]=aux;
        }
        return numeros;
    }

    public static void mostrarMatriz(int[][] matriz){
        //mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length ; j++) {
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println("");
        }
    }

    public static int[] leerNumeros(int[] numeros){
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce número: ");
            numeros[i]=leer.nextInt();
            leer.nextLine();
        }
        return numeros;
    }


}