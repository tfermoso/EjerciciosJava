package com.company;

import java.util.Arrays;

public class Pila {
    private String[] pila=new String[10];
    private int contador=0;
    public String push(String cadena){
        if (contador<10){
            pila[contador]=cadena;
            contador++;
            return "Cadena agregada";
        }else{
            return "Pila llena";
        }
    }
    public String pop(){
        if (contador>0){
            String cadenaEliminado= pila[contador-1];
            pila[contador-1]="";
            contador--;
            return "La cadena '"+cadenaEliminado+"' ha sido eliminado de la pila";

        }else {
            return "La pila está vacia";
        }
    }
    @Override
    public String toString() {
        return "Pila: " +
                Arrays.toString(pila);
    }
}


