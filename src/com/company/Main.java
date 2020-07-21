package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[20];
        int num;
        int suma = 0;
        //leer y llenar un array de 20 números cuya suma no supere 100

        for (int i = 0; i < 20; i++) {
                if (suma>100){
                    numeros[i] = 0;
                } else{
                    System.out.println("Introduce un número: ");
                    num = leer.nextInt();
                    leer.nextLine();
                    suma += num;
                    numeros[i] = num;

            }
        }
            for (int i = 0; i < 20; i++) {
                System.out.println(numeros[i]+",");

        }
            System.out.println(numeros.toString());



        }
    }




