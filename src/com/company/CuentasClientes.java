package com.company;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.ArrayList;
import java.util.List;

public class CuentasClientes implements ICuentas {
    private static Object nombre;
    private List<CuentaTitular> cuentas;
    private CuentaTitular cuentaSeleccionada;

    public CuentasClientes() {
        cuentas = new ArrayList<>();
        cuentaSeleccionada = null;
    }

    /*  public static void crearCuenta(nombre) {
          System.out.print("Nombre titular : ");
          nombre = sc.nextLine();
          System.out.print("Número de cuenta : ");
          String numero = sc.nextLine();
      }


      public static void seleccionarCuenta() {
      }
  */
    @Override
    public void crearCuenta(String titular, double saldo) {
        cuentas.add(new CuentaTitular(saldo, titular));

    }

    @Override
    public void seleccionarCuenta(String titular) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTitular().equals(titular)) {
                cuentaSeleccionada = cuentas.get(i);
                return;
            }
        }
        /*
        cuentaSeleccionada=cuentas.stream()
                .filter(cuenta->titular.equals(cuenta.getTitular()))
                .findAny()
                .orElse(null);
                */
    }

    @Override
    public void ingresar(double saldo) {
        if (cuentaSeleccionada != null) {
            cuentaSeleccionada.ingresarM(saldo);
        }

    }

    @Override
    public void retirar(double saldo) {
        if (cuentaSeleccionada != null) {
            cuentaSeleccionada.retirarM(saldo);
        }
    }

    @Override
    public double consultarSaldos() {
        if (cuentaSeleccionada != null) {
            return cuentaSeleccionada.consultarSaldo();
        }
        return 0;
    }


    @Override
    public String[][] ultimosMovimientos() {
        if (cuentaSeleccionada != null) {
            return cuentaSeleccionada.consultarMovimientos();
        }
        return null;
    }

    @Override
    public void bloquear() {
        if (cuentaSeleccionada != null) {
            cuentaSeleccionada.bloquear();
        }

    }

    @Override
    public void desbloquear() {
        if (cuentaSeleccionada != null) {
            cuentaSeleccionada.desbloquear();
        }
    }

    public boolean resultadoUltimaOperacion() {
        if (cuentaSeleccionada != null) {
            return cuentaSeleccionada.resultadoUltimaOperacion();
        }
        return false;
    }

    public boolean cuentaSeleccionada() {
        if (cuentaSeleccionada == null) return false;
        return true;
    }

}