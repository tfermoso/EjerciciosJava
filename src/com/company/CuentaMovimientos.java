package com.company;

public class CuentaMovimientos extends Cuenta{
    private String[][] movimientos;
    private int contador;
    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos=new String[5][2];
        this.contador=0;
    }

    public void ingresar(double cantidad){
        this.saldo+=cantidad;
       registrarMovimiento("Ingresas",cantidad);
    }
    public void retirar(double cantidad){
        this.saldo-=cantidad;
        registrarMovimiento("Retirar",cantidad);
    }
    private void registrarMovimiento(String tipo,double cantidad){
if (contador<5){
    movimientos[contador][0]=tipo;
    movimientos[contador][1]=String.valueOf(cantidad);
    contador++;
}else{
            for (int i = 1; i <movimientos.length ; i++) {
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
