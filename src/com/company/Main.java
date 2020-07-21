package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer=new Scanner(System.in);
        int[] numeros=new int[5];
        System.out.println("Introduce 5 números positivos");
        int contador=0,num;
        do{
            System.out.println("Introduce un número");
            num=leer.nextInt();
            leer.nextLine();
            if(num>0){
                numeros[contador]=num;
                contador++;
            }
        }while(contador<5);
        System.out.println("numeros introducidos: ");
        for (int i = 4; i >=0 ; i--) {
            System.out.print(numeros[i]+",");
        }
        System.out.println("");
    }
}
