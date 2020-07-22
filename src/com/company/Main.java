package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce numero: ");
        int a = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduce numero: ");
        int b = leer.nextInt();
        int suma = calcularSumaNumeros(a, b);
        System.out.println(suma);
    }

    private static int calcularSumaNumeros(int a, int b) {
        int inicio, fin, suma = 0;
        if (a > b) {
            inicio = b;
            fin = a;

        } else {
            inicio = a;
            fin = b;
        }
        for (int i = inicio + 1; i < fin; i++) {
            suma += i;

        }
        return suma;
    }


}




