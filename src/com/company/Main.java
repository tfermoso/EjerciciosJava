package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Leemos los 24 números
        int[] numeros=new int[24];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            System.out.println("Introduce número: ");
            numeros[i]=leer.nextInt();
            leer.nextLine();
        }

        //Ordenamos el array de números
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

        //Llenar la matriz
        int indice=0;
        int[][] matrizNumeros=new int[4][6];
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                matrizNumeros[i][j]=numeros[indice];
                indice++;
            }
        }

        //mostrar la matriz
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length ; j++) {
                System.out.print(matrizNumeros[i][j]+"|");
            }
            System.out.println("");
        }

    }


}
