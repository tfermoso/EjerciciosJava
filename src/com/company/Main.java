package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Punto p=new Punto(4,6);
        System.out.println(p.imprimir());
        p.cambiar();
        System.out.println(p.imprimir());

        Punto3D p3d=new Punto3D(3,5,2);
        System.out.println(p3d.Imprimir());
        p3d.cambiar(3);
        System.out.println(p3d.Imprimir());

    }
}




