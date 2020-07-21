package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer=new Scanner(System.in);
        int[] numeros=new int[20];
        int num,suma=0;
        for (int i = 0; i < 20; i++) {
            if(suma>100){
                numeros[i]=0;
            }else{
                System.out.println("Introduce número: ");
                num=leer.nextInt();
                leer.nextLine();
                suma+=num;
                numeros[i]=num;
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i]+",");
        }
        System.out.println("");
    }
}
