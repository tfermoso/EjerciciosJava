package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        int [] num =new int[24];
       num=leerNUmeros(num);

        //ordenar el array de numeros
        int[] arrayOrdenado;
        arrayOrdenado=ordenarArray(num);

        //llenar la matriz


        int [][]numerosMatriz = new int[4][6];
    numerosMatriz=llenarMatriz(numerosMatriz,arrayOrdenado);

        //mostrar la matriz
       mostrarMatriz(numerosMatriz);
    }

    private static int[][] llenarMatriz(int[][] numerosMatriz, int[] arrayOrdenado) {
        int indice=0;
        for (int i = 0; i <numerosMatriz.length ; i++) {
            for (int j = 0; j <numerosMatriz[0].length; j++) {
                numerosMatriz[i][j] = arrayOrdenado[indice];
                indice++;
            }


        }
        return numerosMatriz;
    }

    private static int[] ordenarArray(int[] num) {
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
        return num;
    }

    public static void mostrarMatriz(int[][]numerosMatriz){
        for (int i = 0; i <numerosMatriz.length ; i++) {
            for (int j = 0; j <numerosMatriz[0].length ; j++) {
                System.out.print(numerosMatriz[i][j]+ "|");

            }
            System.out.println("");
        }
    }
   public static int[] leerNUmeros(int[]num) {
       Scanner leer = new Scanner(System.in);
       for (int i = 0; i < num.length; i++) {
           System.out.println("Escribe un numero: ");
           num[i] = leer.nextInt();
           leer.nextLine();
       }
       return num;
   }
    }


