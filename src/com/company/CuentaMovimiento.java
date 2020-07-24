package com.company;

public class CuentaMovimiento extends Cuenta {
    private String[][] movimientos;
    private int contador;

    public CuentaMovimiento(double saldo) {
        super(saldo);
        this.movimientos=new String[5][2];
        this.contador=0;
    }

    public void ingresarM(double cantidad){
        this.ingresar(cantidad);
        registrarMovimiento("Ingresar",cantidad);
    }
    public void retirarM(double cantidad){
        this.retirar(cantidad);
        registrarMovimiento("Retirar",cantidad);
    }

    private void registrarMovimiento(String tipo,double cantidad){
        if(contador<5){
            movimientos[contador][0]=tipo;
            movimientos[contador][1]=String.valueOf(cantidad);
            contador++;
        }else{
            for (int i = 1; i < movimientos.length ; i++) {
                movimientos[i-1][0]=movimientos[i][0];
                movimientos[i-1][1]=movimientos[i][1];
            }
            contador=4;
            registrarMovimiento(tipo,cantidad);
        }
    }
    public String[][] consultarMovimientos(){
        return movimientos;
    }

}
