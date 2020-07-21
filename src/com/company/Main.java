package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.printf("Introduce 5 numeros positivos");
        int num, contador = 0;
        do {
            do {
                System.out.println("introducir un numero");
                num = leer.nextInt();
                leer.nextLine();
            } while (num < 0);
            numeros[contador] = num;
            contador++;


        } while (contador < 5);
        System.out.println("numeros introducidos: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i] + "  ");

        }

        System.out.println("");
    }
}
