package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduce un número: ");
        int b = leer.nextInt();
        leer.nextLine();
        int suma = calcularSumaNumeros(a, b);
        System.out.println(suma);

    }

    private static int calcularSumaNumeros(int a, int b) {
        int inicio, fin, suma = 0;
        if (a > b) {
            inicio = b;
            fin = a;
        } else {
            inicio=a;
            fin=b;
        }
        for (int i = 0; i < inicio+1 ; i++) {
            suma+=1;

        }
        return suma;

        }
    }





