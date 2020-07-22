package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
      int a=leer.nextInt();
        System.out.println("Ingresa el segundo Valor: ");
        int b=leer.nextInt();
        int suma=calcularSumaNumeros(a,b);
        System.out.println(suma);
        System.out.println(factorial(suma));
    }

    private static int factorial(int n) {
        int iFactorial = 1;
        for (int i=2;i<=n;i++)
            iFactorial = iFactorial * i;
        return iFactorial;
    }

    private static int calcularSumaNumeros(int a, int b) {
        int inicio = 0, fin = 0, suma=0;
        if (a == b) {
            System.out.println("Datos iguales.");
        } else {
            if (a > b) {
                inicio = b;
                fin = a;
            } else {
                inicio = a;
                fin = b;
            }
        }
        for (int i = inicio+1; i < fin; i++) {
            suma+=i;
        }
        return suma;
    }
    }





