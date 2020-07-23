package com.company;

import java.util.Scanner;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila("FIFO");

        pila.push("hola");
        pila.push("mundo");
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }

}


       /* pila.push("hola");
        pila.push("Raimundo");
        pila.push("Perez");
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());*/




