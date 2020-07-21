package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        System.out.println("Introduce 10 números");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = leer.nextInt();
            leer.nextLine();
        }
        System.out.println("Introduce número a buscar");
        int numero = leer.nextInt();
        leer.nextLine();
        int contador=0;


    //Recorrer el array
        for( i =0;i< numeros.length; i++)
            if (numeros[i]>numero) {
                contador++;
            }
    }


    }
}