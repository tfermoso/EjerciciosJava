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
        System.out.println(factorial(suma));

    }

    private static int factorial(int n) {//Recursiva
        if (n<=1) return 1;
        return n*factorial(n-1);

    }
    private static int factorialIterativo(int n){//No recursivo
        int producto=1;
        while (n>1){
            producto=producto*n;
            n--;
        }
        return producto;
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





