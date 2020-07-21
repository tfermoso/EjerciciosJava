package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer=new Scanner(System.in);
        int[] numeros=new int[10];
        System.out.println("Introduce 10 números");
        for (int i = 0; i < 10; i++) {
            numeros[i]=leer.nextInt();
            leer.nextLine();
        }
        System.out.println("Introduce número a buscar");
        int numero=leer.nextInt();
        leer.nextLine();
        int contador=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>numero){
                contador++;
            }
        }
        System.out.println("El número de elementos del array que son mayores que " +
                " "+numero +" son: "+contador);

    }
}
