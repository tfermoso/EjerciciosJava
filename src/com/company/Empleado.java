package com.company;

import java.util.List;
import java.util.ArrayList;

public class Empleado implements Icapa2 {
    private List<Integer>notas;

    public Empleado() {
        this.notas = new ArrayList<>();
    }

    @Override
    public void añadirNota(int nota) {
        notas.add(nota);
    }

    @Override
    public int mostrarMedia() {
        int media=0;
        for (int i = 0; i <notas.size() ; i++) {
            media+=notas.get(i);

        }
        return media/notas.size();
    }

    @Override
    public int totalAprobados() {
        int aprobados=0;
        for (int i = 0; i <notas.size() ; i++) {
            if(notas.get(i)>=5){
                aprobados++;
            }

        }
        return aprobados;
    }

    @Override
    public int[] mostrarNotas() {
        int[] n=new int[notas.size()];
        for (int i = 0; i < notas.size(); i++) {
            n[i]=notas.get(i);

        }
        return n;
    }
}
