package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Stack<String> pila = new Stack();
        pila.push("hola");
        pila.push("mundo");
        System.out.println(pila.pop());
        System.out.println(pila.pop());


    }


}
