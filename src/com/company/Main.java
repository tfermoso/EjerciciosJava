package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros=new int[5];
        int contador=0;
        do{
        System.out.println("Introduzca numero");
        Scanner leer=new Scanner(System.in);
        int numero=leer.nextInt();
        leer.nextLine();
        if (numero<0) {

        }else {
            numeros[contador]=numero;
            contador++;
        }
        }while (contador<5);
        System.out.println(numeros[4]+"\n"+numeros[3]+"\n"+numeros[2]+"\n"+numeros[1]+"\n"+numeros[0]);
    }
}

