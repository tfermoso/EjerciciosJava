package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Stack LIFO 10 Strings. Metodo meter. Metodo sacar.
        System.out.println("Que tipo de pila quiere crear? \n" +
                "1-LIFO \n" +
                "2-FIFO");
        Scanner leer = new Scanner(System.in);
        int tipo=leer.nextInt();
        Pila pila=new Pila(tipo);
        boolean saliendo=false;
        do {
            System.out.println("Elije opcion: \n" +
                    "1-Meter cadena \n" +
                    "2-Sacar cadena \n" +
                    "3- Leer pila \n" +
                    "4-Salir");
            int opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca cadena: ");
                    String cadena = leer.nextLine();
                    System.out.println( pila.push(cadena));
                    break;
                case 2:
                    System.out.println(pila.pop());
                    break;
                case 3:
                    System.out.println(pila.toString());
                    break;
                case 4:
                    saliendo=true;
                    break;
                default:
                    break;
            }
        }while (!saliendo);
    }
}