package com.company;

public class Punto3D extends Punto {
    private int Z;


    public Punto3D(int x, int y,int z) {
        super(x, y);
        this.Z=z;
    }
    public String imprimir(){
        return "X= "+X+" | Y= "+Y+" | Z="+Z;
    }
    public void cambiar(int z){
        this.cambiar();
        this.Z=z;
    }
}
