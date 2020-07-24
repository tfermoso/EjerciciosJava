package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        Punto punto=new Punto(4,6);
        System.out.println(punto.imprimir());
        punto.cambiar();
        System.out.printf(punto.imprimir());
        Punto3D punto3D=new Punto3D(4,5,6);
        System.out.println(punto3D.imprimir());
        punto3D.cambiar(20);
        System.out.println(punto3D.imprimir());

    }
}


