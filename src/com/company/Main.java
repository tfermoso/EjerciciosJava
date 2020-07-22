package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //dar 2 numeros. Dar la suma de los numeros entre medias
        Scanner leer=new Scanner(System.in);
        int numero1=leerNumero();
        int numero2=leerNumero();
        int suma =devolverSuma(numero1,numero2);
        System.out.println(suma);
        int factorial=factorialNumero(suma);
        String factorialSinCalcular=factorialSinCalcular(suma);
        System.out.println(factorial);
        System.out.println(factorialSinCalcular);
    }

    private static String factorialSinCalcular(int suma) {
        String factorial=String.valueOf(suma);
        for (int i = 1; i < suma; i++) {
            factorial+="·"+String.valueOf(suma-i);
        }
        return factorial;
    }

    private static int factorialNumero(int suma) {
        int factorial=1;
        for (int i = 2; i <=suma ; i++) {
            factorial= factorial*i;
            }
        return factorial;
    }

    private static int devolverSuma(int numero1, int numero2) {
       int suma=0;
       if (numero1<numero2) {
           for (int i = numero1+1; i <numero2; i++) {
                suma+=i;
           }
       }else if (numero2<numero1){
           for (int i = numero2+1; i <numero1 ; i++) {
               suma+=i;
           }
       }
       return suma;
    }

    private static int leerNumero() {
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca numero");
        int numer=leer.nextInt();
        return numer;
    }
}