package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int [] num =new int[24];


        for (int i = 0; i <24 ; i++) {
            System.out.println("Escribe un numero: ");
          num[i]=leer.nextInt();
           leer.nextLine();

        }
        int menor;
        int aux;
        for (int i = 0; i <num.length-1 ; i++) {
            menor=i;
            for (int j = i+1; j <num.length ; j++) {
                if(num[j]<num[menor]){
                    menor=j;
                }

            }
            aux=num[i];
            num[i]=num[menor];
            num[menor]=aux;
        }
      int indice=0;
        int [][]numerosMatriz = new int[4][6];
        for (int i = 0; i <numerosMatriz.length ; i++) {
            for (int j = 0; j <numerosMatriz[0].length; j++) {
               numerosMatriz[i][j]=num[indice];
               indice ++;

            }

        }
        //mostrar la matriz
        for (int i = 0; i <numerosMatriz.length ; i++) {
            for (int j = 0; j <numerosMatriz[0].length ; j++) {
                System.out.print(numerosMatriz[i][j]+ "|");

            }
            System.out.println("");
        }
    }
    }
