package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Dado un array de dos dimensiones de 4x6, realizar un programa que lea 24 números
        // y los coloque en el array. Posteriormente, se ordenará el array de menor a mayor
        // (la posición 1,1 tendrá el número más pequeño, mientras que 4,6 tendrá el mayor) y se mostrará ordenado
        int[][] numeros= new int[4][6];
        int[] numerosAux=new int[24];
        Scanner leer= new Scanner(System.in);
        for (int i = 0; i <24 ; i++) {
            System.out.println("Introduzca numero");
            int numero=leer.nextInt();
            leer.nextLine();
           numerosAux[i]=numero;
        }
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
        System.out.println("Array ordenada: ");
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(numeros[j][i]+",");

            }System.out.println("");
        }
    }
}