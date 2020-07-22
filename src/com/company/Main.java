package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //leemos 24 numeros
        int[] numeros = new int[24];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            System.out.println("Introduce numero: ");
            numeros[i] = leer.nextInt();
            leer.nextLine();
        }
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

//llenar la matriz
        int indice = 0;
        int[][] matrizNumeros = new int[4][6];
        for (int i = 0; i < matrizNumeros.length; i++)
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                matrizNumeros[i][j] = numeros[indice];
                indice++;
            }
        //mostrar matriz
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[0].length; j++) {
                System.out.println(matrizNumeros[i][j] + "/");


            }
        }
        System.out.println("");

    }
    }





