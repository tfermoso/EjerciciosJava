package com.company;
import java.util.ArrayList;
import java.util.List;

public class ListaCuentas implements iCuentas{
    private List<CuentaTitular> lista;
   private CuentaTitular cuentaSeleccionada;

    public ListaCuentas() {
        lista=new ArrayList<>();
        cuentaSeleccionada=null;
    }

    @Override
    public void crearCuenta(String titular, int saldo) {
        lista.add(new CuentaTitular(saldo,titular));
    }

    @Override
    public boolean seleccionarCuenta(String titular) {
        for (int i = 0; i <lista.size() ; i++) {
            if (lista.get(i).getTitular().equals(titular)){
                cuentaSeleccionada=lista.get(i);
                return true;
            }
        } return false;
    }

    @Override
    public void ingresar(double saldo) {
        if (cuentaSeleccionada!=null){
        if (saldo<0){
            cuentaSeleccionada.registrarMovimiento("Ingresar",saldo,false,"Ingreso negativo");
        }else {
            if (cuentaSeleccionada.isBloqueo()) {
                cuentaSeleccionada.registrarMovimiento("Ingresar", saldo, false, "Cuenta bloqueada");
            } else {
                cuentaSeleccionada.setSaldo(cuentaSeleccionada.getSaldo()+saldo);
                cuentaSeleccionada.registrarMovimiento("Ingresar", saldo, true, "Realizado con exito");
            }
        }
        }
    }

    @Override
    public void retirar(double saldo) {
        if (cuentaSeleccionada!=null)
            if (saldo<0){
                cuentaSeleccionada.registrarMovimiento("Retirar",saldo,false,"Retiro negativo");
            }else {
                if (cuentaSeleccionada.isBloqueo()){
                    cuentaSeleccionada.registrarMovimiento("Retirar",saldo,false,"Cuenta bloqueada");
                }else {
                    cuentaSeleccionada.setSaldo(cuentaSeleccionada.getSaldo()-saldo);
                    cuentaSeleccionada.registrarMovimiento("Retirar",saldo,true,"Realizado con exito");
                }
            }

    }

    @Override
    public double consultarSaldo() {
        if (cuentaSeleccionada != null) {
            return cuentaSeleccionada.getSaldo();
        }return 0;
    }

    @Override
    public String[][] ultimosMovimientos() {
        if (cuentaSeleccionada != null) {
            String[][]  movimientos = cuentaSeleccionada.consultarMovimientos();
            return movimientos;
        }return null;
    }

    @Override
    public void setBloqueo() {
        if (cuentaSeleccionada.isBloqueo()){
            cuentaSeleccionada.setBloqueo(false);
        }else {
            cuentaSeleccionada.setBloqueo(true);
        }
    }

    @Override
    public void deseleccionarCuenta() {
        cuentaSeleccionada=null;
    }

    @Override
    public boolean isBloqueo() {
        return cuentaSeleccionada.isBloqueo();
    }

    public String resultadoUltima() {
        return cuentaSeleccionada.resultadoUltima();
    }
}
