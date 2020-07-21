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


