package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Pila {
   private Stack<String> lifo;
   private LinkedList<String> fifo;
   private String tipo;

   public Pila(int tipo){
       if (tipo==1){
           this.tipo="LIFO";
           this.lifo=new Stack<>();
       }else if (tipo==2){
           this.tipo="FIFO";
           this.fifo=new LinkedList<>();
       }else {
           try {
               throw new Exception();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }
   public String pop(){
      if (tipo.equals("FIFO")){
          return fifo.removeLast();
      }else{
         return lifo.pop();
      }

   }
   public String push(String cadena) {
        if (tipo.equals("LIFO")){
            if (lifo.size()<10) {
                lifo.push(cadena);
                return "Cadena añadida";
            }else {
                return "Pila llena";
            }
        }else {
            if (fifo.size()<10) {
                fifo.push(cadena);
                return "Cadena añadida";
            } else  {
                return "Pila llena";
            }
        }
   }

    @Override
    public String toString() {
       if (tipo.equals("LIFO")){
           return "Pila{ \n" +lifo;
       }else {
           return "Pila{ \n "+fifo;
       }
    }
}


