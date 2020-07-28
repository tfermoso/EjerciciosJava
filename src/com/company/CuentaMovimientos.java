package com.company;

public class CuentaMovimientos extends Cuenta {
    private String[][] movimientos;
private int contador;
private boolean bloqueo;

    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos=new String[5][4];
        this.contador=0;
        bloqueo=false;

    }
    public void ingresarM(double cantidad){
        if (cantidad<0){
            registrarMovimiento("Ingresar",cantidad,false,"Importe incorrecto");
        }else{
            this.ingresar(cantidad);
            registrarMovimiento("Ingresar",cantidad,true,"");
        }




    }
    public void retirarM(double cantidad) {

        if (saldo >= cantidad & bloqueo==false) {
            this.retirar(cantidad);
            registrarMovimiento("Retirar", cantidad,true," ");
        } else if (bloqueo==true){
            registrarMovimiento("Retirar", cantidad,false,"Cuenta bloqueada");

        }else{
            registrarMovimiento("Retirar", cantidad,false,"Saldo insuficiente");

        }
    }
    private void registrarMovimiento(String tipo,double cantidad, boolean op,String msg){
        if(contador<5){
            movimientos[contador][0]=tipo;
            movimientos[contador][1]=String.valueOf(cantidad);
            movimientos[contador][2]=String.valueOf(op);
            movimientos[contador][3]=msg;
            contador++;


            }else {
            for (int i = 1; i < movimientos.length; i++) {
                movimientos[i-1][0]=movimientos[i][0];
                movimientos[i-1][1]=movimientos[i][1];
                movimientos[i-1][2]=movimientos[i][2];
                movimientos[i-1][3]=movimientos[i][3];
            }

            contador = 4;
            registrarMovimiento(tipo, cantidad,op,msg);
        }
    }
    public String [][] consultarMovimientos(){
        return movimientos;
    }
    public boolean rUltimaOperacion(){
       return Boolean.valueOf(movimientos[contador-1][2]);

    }
    public void bloquear(){
        this.bloqueo=true;
    }
    public void desbloquear(){
        this.bloqueo=false;
    }
    public double consultarSaldo(){
        return saldo;
    }
}