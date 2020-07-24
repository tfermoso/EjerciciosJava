package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Punto p = new Punto(3, 5);
        System.out.println(p.imprimir());
        p.cambiar();
        System.out.println(p.imprimir());
        Punto3D p3=new Punto3D(2,5,8);
        System.out.println(p3.imprimir());
        p3.cambiar();
        System.out.println(p3.imprimir());
    }
}