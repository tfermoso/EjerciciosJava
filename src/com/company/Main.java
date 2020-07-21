package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[20];
        //boolean resultado=false;
        //int contador=0;
        int num, suma = 0;
        //do {
        for (int i = 0; i < 20; i++) {

            //numeros[contador]=numero;
            //contador++;
            //suma+=num;
            //int suma=0;
            //for (int i = 0; i <numeros.length ; i++) {
            //suma+=numeros[i];
            if (suma >= 100) {
                //resultado=true;
                numeros[i] = 0;
            } else {
                System.out.println("Introduce numero: ");
                num = leer.nextInt();
                leer.nextLine();
                suma+=num;
                numeros[i] = num;
            }
        }//while (!resultado);
        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i] + ",");
        }
        //if (numeros[i]!=0){

    }
}




//        int[] numeros=new int[5];
//        System.out.println("Introduce 5 números positivos");
//        int contador=0,num;
//        do{
//            System.out.println("Introduce un número");
//            num=leer.nextInt();
//            leer.nextLine();
//            if(num>0){
//                numeros[contador]=num;
//                contador++;
//            }
//        }while(contador<5);
//        System.out.println("numeros introducidos: ");
//        for (int i = 4; i >=0 ; i--) {
//            System.out.print(numeros[i]+",");
//        }
//        System.out.println("");
//    }

            //if (num<0) {
                //numeros[contador]=num;
            //}else {
                //numeros[contador]=num;
                //contador++;

        //}while (contador<5);
        //System.out.println(numeros[4]+"\n"+numeros[3]+"\n"+numeros[2]+"\n"+numeros[1]+"\n"+numeros[0]);
    //}
        //System.out.println("Introduce número a buscar");
        //int numero=leer.nextInt();
        //leer.nextLine();
        //int contador=0;
        //for (int i = 0; i <numeros.length; i++) {
            //if (numeros[i]>numero){
                //contador++;
            //}

        //}
        //System.out.println("El número de elementos del array que son mayores que "+
               // " "+numero +" son: "+contador);

    //}
    //public static int mayor(int lista[]){
        //int mayor=10;
        //for(int i=0;i<lista.length;i++){
            //if(lista[i]>mayor){
                //mayor=lista[i];
            //}
        //}

        //return mayor;


