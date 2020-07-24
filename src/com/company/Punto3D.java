package com.company;

public class Punto3D extends Punto {
    private int Z;


    public Punto3D(int x, int y,int z) {
        super(x, y);
        Z=z;
    }
    public String imprimir(){
        return "X= "+this.X+" | Y= "+this.Y+" | Z="+this.Z;
    }
    public void cambiar(int z){
        int aux=0;
        aux=this.X;
        this.X=this.Y;
        this.Y=aux;
        this.Z=z;
    }
}
