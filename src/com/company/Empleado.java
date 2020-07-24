package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empleado implements Icapa2  {

    private List<Integer>notas;

    public Empleado() {
        this.notas = new ArrayList<>();
    }




    public int mostrarMedia() {
        int media=0;
        for (int i = 0; i <notas.size() ; i++) {
            media+=notas.get(i);
            }
           return media/notas.size();

    }

    public int totalAprovados() {
        int aprovados=0;
        for (int i = 0; i <notas.size() ; i++) {
            if(notas.get(i)>=5){
                aprovados++;
            }

        }
        return aprovados;
    }

    public int[] mostrarNotas() {
        int[]n=new int[notas.size()];
        for (int i = 0; i <notas.size() ; i++) {
            n[i]=notas.get(i);

        }
        return n ;
    }

    public void añadirNotas(int nota) {
        notas.add(nota);
    }
}

