package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] num=new int[10];
        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < 10; i++) {

            num[i] = leer.nextInt();
            leer.nextLine();
        }
        System.out.println("Numero a comparar: ");
        int numero=leer.nextInt();
        leer.nextLine();
        int contador=0;
        leer.nextLine();
        for (int i = 0; i < num.length   ; i++) {
            if(num[i]>numero){
                contador++;
            }

        }
        System.out.println("Los números del array que son mayores que: " + numero + "son: " + +contador);
    }
}
