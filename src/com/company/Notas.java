package com.company;

public class Notas {
    private double[] notas=new double[10];
    private int contador=0;

    public boolean añadirNota(double nota) {
        if (contador < 10) {
            notas[contador] = nota;
            contador++;
            return true;
        }else {
            return false;
        }
    }

    public double mostrarMedia(){
        double media=0.0;
        for (int i = 0; i <notas.length ; i++) {
            media+=notas[i];
        }
        media= media/notas.length;
        return media;
    }
    public int mostrarAprobados(){
        int aprobados=0;
        for (int i = 0; i <notas.length ; i++) {
            if (notas[i]>=5.0){
                aprobados++;
            }
        } return aprobados;
    }
    public String mostrarNotas(){
        String notasString="";
        for (int i = 0; i <notas.length ; i++) {
            notasString=notasString+notas[i]+" - ";
        } return notasString;
    }
}
