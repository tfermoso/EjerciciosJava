package com.company;

public class CuentaMovimientos extends Cuenta{
    private String[][] movimientos;
    private int contador;
    public CuentaMovimientos(double saldo) {
        super(saldo);
        this.movimientos=new String[5][4];
        this.contador=0;
    }

    public void ingresar(double cantidad) {
        if (cantidad<0){
                registrarMovimiento("Ingresar",cantidad,false,"Ingreso negativo");
        }else {
            if (this.bloqueo) {
                registrarMovimiento("Ingresar", cantidad, false, "Cuenta bloqueada");
            } else {
                this.saldo += cantidad;
                registrarMovimiento("Ingresar", cantidad, true, "Realizado con exito");
            }
        }
    }

    public void retirar(double cantidad){
        if (cantidad<0) {
            registrarMovimiento("Retirar",cantidad,false,"Retiro negativo");
        } else {
            if (this.bloqueo){
            registrarMovimiento("Retirar",cantidad,false,"Cuenta bloqueada");
        }else {
            if (this.saldo - cantidad >= 0) {
                this.saldo -= cantidad;
                registrarMovimiento("Retirar", cantidad, true, "Realizado con exito");
            } else {
                registrarMovimiento("Retirar", cantidad, false, "Sin suficiente saldo");
            }
        }
        }
    }
    private void registrarMovimiento(String tipo, double cantidad, boolean okey,String msg){
if (contador<5){
    movimientos[contador][0]=tipo;
    movimientos[contador][1]=String.valueOf(cantidad);
    movimientos[contador][2]=String.valueOf(okey);
    movimientos[contador][3]=msg;
    contador++;
}else{
            for (int i = 1; i <movimientos.length ; i++) {
                movimientos[i-1][0]=movimientos[i][0];
                movimientos[i-1][1]=movimientos[i][1];
                movimientos[i-1][2]=movimientos[i][2];
                movimientos[i-1][3]=movimientos[i][3];
            }
            contador=4;
            registrarMovimiento(tipo,cantidad,okey,msg);
        }
    }

    public String[][] consultarMovimientos(){
        return movimientos;
    }
    public String resultadoUltima() {
        return movimientos[contador-1][3];
    }

}
