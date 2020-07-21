package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca 10 numeros");
        int[] numeros = new int[10];
        Scanner leer=new Scanner(System.in);
        int primero= leer.nextInt();
        numeros[0]=primero;
        leer.nextLine();
        System.out.println("------------");
        int segundo = leer.nextInt();
        numeros[1]=segundo;
        leer.nextLine();
        System.out.println("------------");
        int tercero= leer.nextInt();
        numeros[2]=tercero;
        leer.nextLine();
        System.out.println("------------");
        int cuarto = leer.nextInt();
        numeros[3]=cuarto;
        leer.nextLine();
        System.out.println("------------");
        int quinto = leer.nextInt();
        numeros[4]=quinto;
        leer.nextLine();
        System.out.println("------------");
        int sexto = leer.nextInt();
        numeros[5]=sexto;
        leer.nextLine();
        System.out.println("------------");
        int septimo = leer.nextInt();
        numeros[6]=septimo;
        leer.nextLine();
        System.out.println("------------");
        int octavo = leer.nextInt();
        numeros[7]=octavo;
        leer.nextLine();
        System.out.println("------------");
        int noveno = leer.nextInt();
        numeros[8]=noveno;
        leer.nextLine();
        System.out.println("------------");
        int decimo = leer.nextInt();
        numeros[9]=decimo;
        leer.nextLine();
        System.out.println("Introduzca numero a comparar");
        int comparacion=leer.nextInt();
        leer.nextLine();
        int contador=0;
        int[] mayores=new int[10];
        System.out.println("Los numeros mayores son: ");
        for (int i = 0; i <numeros.length ; i++) {
            if (numeros[i]>comparacion){
                mayores[contador]=numeros[i];
                contador++;
                System.out.println(mayores[i]);
            }
        }

            }
        }

