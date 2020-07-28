package com.company;

import java.util.ArrayList;
import java.util.List;

public class CuentasClientes implements iCuentas{
    private List<CuentaTitular>cuentas;
    private CuentaTitular cuentaSelect;

    public CuentasClientes() {
        cuentas=new ArrayList<>();
        cuentaSelect=null;
    }

    @Override
    public void crearCuenta(String titular, double saldo) {
        cuentas.add(new CuentaTitular(saldo, titular));
    }

    @Override
    public void selectCuenta(String titular) {
        for (int i = 0; i < cuentas.size(); i++) {
            if( cuentas.get(i).getTitular().equals(titular)){
                cuentaSelect=cuentas.get(i);
                return;
            }

        }
       // cuentaSelect=cuentas.stream().filter(cuenta->titular.equals(cuenta.getTitular())).findAny().orElse(null);

    }

    @Override
    public void ingresar(double saldo) {
        if(cuentaSelect!=null){
            cuentaSelect.ingresarM(saldo);

        }

    }

    @Override
    public void retirar(double saldo) {
        if(cuentaSelect!=null){
            cuentaSelect.retirarM(saldo);
        }
    }

    @Override
    public double consultarSaldo() {
        if (cuentaSelect != null) {
            return cuentaSelect.getSaldo();
        }
        return 0;
    }

    @Override
    public String[][] ultimosMovimientos() {
        if (cuentaSelect != null) {
       return cuentaSelect.consultarMovimientos();
    }
        return new String[0][];
    }

    @Override
    public void bloquear() {
        if (cuentaSelect != null) {
            cuentaSelect.bloquear();
        }

    }

    @Override
    public void desbloquear() {
        if (cuentaSelect != null) {
            cuentaSelect.desbloquear();
        }

    }

    @Override
    public boolean cuentaSeleccionada() {
        if(cuentaSelect!=null){
            return true;
        }
        return false;
    }

    public boolean rUltimaOperacion() {
        if (cuentaSelect != null) {
            return cuentaSelect.rUltimaOperacion();
        }
        return false;
    }

}
