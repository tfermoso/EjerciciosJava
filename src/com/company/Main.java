package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numeros=new int[5];
        int contador=0;
        do{
            System.out.println("Introduzca un numero");
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

    }
    //public static int mayor(int lista[]){
        //int mayor=10;
        //for(int i=0;i<lista.length;i++){
            //if(lista[i]>mayor){
                //mayor=lista[i];
            //}
        //}

        //return mayor;


