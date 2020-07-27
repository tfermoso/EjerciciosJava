package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        //ejercicio
         //CuentaMovimientos cuenta=new CuentaMovimientos(100);
         //cuenta.ingresarI(-300);
         //cuenta.ingresarI(1000);
         //cuenta.ingresarI(400);
         //cuenta.retirarR(12000);
         //mostrarResultadoUltimaOp(cuenta);
         //cuenta.retirarR(100);
         //mostrarResultadoUltimaOp(cuenta);
         //cuenta.bloquear();
         //cuenta.retirarR(3000);
         //cuenta.ingresarI(400);
        //cuenta.ingresarI(-300);
        //mostrarResultadoUltimaOp(cuenta);
        //String[][] movimientos=cuenta.consultarMovimientos();
        //for (int i = 0; i < movimientos.length; i++) {
            //System.out.println("Tipo: "+movimientos[i][0]+", Cantidad: "+movimientos[i][1]+", Resultado: "+movimientos[i][2]+", msg: "+movimientos[i][3]);
        //}
        Scanner leer = new Scanner(System.in);
        CuentaMovimientos cuenta = new CuentaMovimientos(0);
        String menu="Operaciones disponibles\n" +
                    "1. Ingresar dinero \n" +
                    "2. Retirar dinero \n" +
                    "3. Consultar saldo disponible \n" +
                    "4. Consultar ultimos movimientos \n" +
                    "5. Bloquear cuenta \n" +
                    "6. Desbloquear cuenta \n" +
                    "7. Salir";
            int opcion;

            do {
                System.out.println(menu);
                opcion=leer.nextInt();
                leer.nextLine();
                switch (opcion) {
                case 1:
                    System.out.println("Cantidad a ingresar: ");
                    double cantidad=leer.nextDouble();
                    leer.nextLine();
                    cuenta.ingresarI(cantidad);
                    mostrarResultadoUltimaOp(cuenta);
                    break;
                case 2:
                    System.out.println("Cantidad a retirar: ");
                    cantidad=leer.nextDouble();
                    leer.nextLine();
                    cuenta.retirarR(cantidad);
                    mostrarResultadoUltimaOp(cuenta);
                    break;
                case 3:
                    System.out.println("Su saldo es: ");
                    System.out.println(cuenta.consultarSaldo() +" €");
                    break;
                case 4:
                    String[][]movimientos= cuenta.consultarMovimientos();
                    for (int i = 0; i <movimientos.length ; i++) {
                        System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]+
                                ", Result: "+movimientos[i][2]+", msg: "+movimientos[i][3]); }
                    break;
                case 5:
                    cuenta.bloquear();
                    break;
                    case 6:
                        cuenta.desbloquear();
                        break;
                case 7:
                    System.out.println("Hasta pronto...");;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion!=7);
    }




    public static void mostrarResultadoUltimaOp(CuentaMovimientos cuenta){
        if ((cuenta.resultadoUltimaOperacion())){
            System.out.println("Operación realizada con éxito");
        }else{
            System.out.println("Error al realizar la operación");
           // System.out.println("La cuenta está bloqueada");
        }

    }







}







