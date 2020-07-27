package com.company;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        CuentaMovimiento cuenta=new CuentaMovimiento(0);
        String menu="Operaciones disponibles\n" +
                "1. Ingresar dinero\n" +
                "2. Retirar dinero\n" +
                "3. Consultar saldo\n" +
                "4. Últimos movimientos\n" +
                "5. Bloquear cuenta\n" +
                "6. Desbloquar cuenta\n" +
                "7. Salir\n";
        int opcion;

        do{
            System.out.println(menu);
            opcion=leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1:
                    ingresarDinero(cuenta,leer);
                    break;
                case 2:
                    System.out.println("Cantidad a retirar:");
                    double cantidad=leer.nextDouble();
                    leer.nextLine();
                    cuenta.retirarM(cantidad);
                    mostrarResultadoUltimaOp(cuenta);
                    break;
                case 3:
                    System.out.println("Su saldo es: ");
                    System.out.println(cuenta.consultarSaldo() +" €");
                    break;
                case 4:
                    String[][] movimientos= cuenta.consultarMovimientos();
                    for (int i = 0; i < movimientos.length; i++) {
                        System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]+", Resul: "+movimientos[i][2]+", Msg: "+movimientos[i][3]);
                    }
                    break;
                case 5:
                    cuenta.bloquear();
                    break;
                case 6:
                    cuenta.desbloquear();
                    break;
                case 7:
                    System.out.println("Hasta pronto..");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }while(opcion!=7);

    }

    private static void ingresarDinero(CuentaMovimiento cuenta, Scanner leer) {
        System.out.println("Cantidad a ingresar: ");
        double cantidad=leer.nextDouble();
        leer.nextLine();
        cuenta.ingresarM(cantidad);
        mostrarResultadoUltimaOp(cuenta);
    }

    private static void mostrarResultadoUltimaOp(CuentaMovimiento cuenta){
        if(cuenta.resultadoUltimaOperacion()){
            System.out.println("Operación realizada con éxito");
        }else{
            System.out.println("Error al realizar la operación");
        }
    }
}
