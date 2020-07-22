package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Dado un array de dos dimensiones de 4x6, realizar un programa que lea 24 números
        // y los coloque en el array. Posteriormente, se ordenará el array de menor a mayor
        // (la posición 1,1 tendrá el número más pequeño, mientras que 4,6 tendrá el mayor) y se mostrará ordenado
        int[][] numeros= new int[4][6];
        int[] numerosAux=new int[24];
        numerosAux=meterNumeros(numerosAux);
        ordenarNumeros(numerosAux);
        meterNumerosMatriz(numeros,numerosAux);
        pintarMatriz(numeros);
    }

    private static void pintarMatriz(int[][] numeros) {
        System.out.println("Array ordenada: ");
        for (int i = 0; i <numeros[0].length ; i++) {
            for (int j = 0; j <numeros.length ; j++) {
                System.out.print(numeros[j][i]);
                if (j<3){
                    System.out.print(",");
                }else if(j==3){
                    System.out.print("|");
                }

            }System.out.println("");
        }
    }

    private static void meterNumerosMatriz(int[][] numeros, int[] numerosAux) {
        int contadorH=0;
        int contadorV=0;
        for (int i = 0; i <numerosAux.length ; i++) {
            numeros[contadorH][contadorV]=numerosAux[i];
            contadorH++;
            if (contadorH==4){
                contadorV++;
                contadorH=0;
            }
        }
    }

    private static void ordenarNumeros(int[] numerosAux) {
        int minimo;
        int numAux;
        for (int i = 0; i <numerosAux.length-1 ; i++) {
            minimo=i;
            for (int j = i+1; j <numerosAux.length ; j++) {
                if (numerosAux[j]<numerosAux[minimo]){
                    minimo=j;
                }
            }
            numAux=numerosAux[i];
            numerosAux[i]=numerosAux[minimo];
            numerosAux[minimo]=numAux;
        }
    }

    private static int[] meterNumeros(int[] numerosAux) {
        Scanner leer= new Scanner(System.in);
        for (int i = 0; i <24 ; i++) {
            System.out.println("Introduzca numero");
            int numero=leer.nextInt();
            leer.nextLine();
            numerosAux[i]=numero;
        } return numerosAux;
    }
}