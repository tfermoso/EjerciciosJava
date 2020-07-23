package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila("FIFO");
        pila.push("sergio");
        pila.push("valverde");


        System.out.println(pila.pop());
        System.out.println(pila.pop());



    }


}
