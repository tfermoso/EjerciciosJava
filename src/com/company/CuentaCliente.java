package com.company;

import java.util.ArrayList;
import java.util.List;

public class CuentaCliente implements Icuentas {
    private List<CuentaTitular> cuentas;
    private CuentaTitular cuentaseleccionada;

    public CuentaCliente() {
        cuentas = new ArrayList<>();
        cuentaseleccionada = null;
    }


    @Override
    public void crearCuenta(String titular, double saldo) {
        cuentas.add(new CuentaTitular(saldo, titular));
    }

    @Override
    public void seleccionarCuenta(String titular) {
        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getTitular().equals(titular)) {
                cuentaseleccionada = cuentas.get(i);
                return;
            }

        }

        /* cuentas.stream().filter(cuenta -> titular.equals(cuenta.getTitular())).findAny().orElse(null);*/
    }

    @Override
    public void ingresar(double saldo) {
        if (cuentaseleccionada != null) {
            cuentaseleccionada.ingresar(saldo);
        }
    }

    @Override
    public void retirar(double saldo) {
        if (cuentaseleccionada != null) {
            cuentaseleccionada.retirar(saldo);
        }
    }

    @Override
    public double consultaSaldo() {
        if (cuentaseleccionada != null) {

            return cuentaseleccionada.consultaSaldo();
        }
        return 0;
    }

    @Override
    public String[][] consultar() {
        if (cuentaseleccionada != null) {

            return cuentaseleccionada.consultar();
        }
        return null;
    }

    @Override
    public void bloquear() {
        if (cuentaseleccionada != null) {
            cuentaseleccionada.bloquear();
        }
    }

    @Override
    public void desbloquear() {
        if (cuentaseleccionada != null) {
            cuentaseleccionada.desbloquear();
        }
    }

    @Override
    public boolean resultadoUltimaOperacio() {
        if (cuentaseleccionada != null) {
            return cuentaseleccionada.resultadoUltimaOperacio();
        }

        return false;
    }

    public boolean cuentaselecionada() {
        if (cuentaseleccionada == null) return false;
        return true;

    }

}

