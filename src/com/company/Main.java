package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       //
        CuentaMovimientos cuenta=new CuentaMovimientos(0);
        boolean salir=false;
        do {
            System.out.println("Menu: \n" +
                    "1-Ingresar saldo\n" +
                    "2-Retirar saldo \n" +
                    "3-Bloquear/Desbloquear cuenta \n" +
                    "4-Comprobar saldo\n" +
                    "5-Ultimos 5 movimiento \n" +
                    "10-Salir");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuanto se ingresa?");
                    int ingreso= leer.nextInt();
                    cuenta.ingresar(ingreso);
                    System.out.println(comprobacion(cuenta));
                    break;
                case 2:
                    System.out.println("¿Cuanto se retira?");
                    int retiro=leer.nextInt();
                    cuenta.retirar(retiro);
                    System.out.println(comprobacion(cuenta));
                    break;
                case 3:
                    if (cuenta.isBloqueo()){
                        cuenta.setBloqueo(false);
                        System.out.println("Cuenta desbloqueada");
                    }else {
                        cuenta.setBloqueo(true);
                        System.out.println("Cuenta bloqueda");
                    }
                    break;
                case 4:
                    System.out.println("Saldo: "+ cuenta.getSaldo());
                    break;
                case 5:
                    String[][] movimientos= cuenta.consultarMovimientos();
                    for (int i = 0; i <movimientos.length ; i++) {
                        System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]+", Succesful: "+movimientos[i][2]);
                    }
                    break;
                case 10: salir=true;
                    break;
            }
        }while (!salir);
    }
    public static String comprobacion(CuentaMovimientos cuenta) {
        return cuenta.resultadoUltima();
    }

}