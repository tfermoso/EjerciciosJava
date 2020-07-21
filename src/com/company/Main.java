package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];
        int num = 0, contador = 0;
     //llenar un array de 5 números positivos
        do {
            System.out.println("Introduce un número: ");
            num = leer.nextInt();
            leer.nextLine();
                if (num < 0){
                numeros[contador] = num;
                contador++;
             }

        } while (contador < 5);
        System.out.println("Números introducidos: ");
        for (int i = 4; i > 0 ; i--) {
            System.out.println(numeros[i]+ ",");

            }
        System.out.println("");
    }
}

