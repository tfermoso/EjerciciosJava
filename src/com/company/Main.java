package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {//aplicación en consola

        Scanner leer = new Scanner(System.in);
        //CuentaMovimientos cuenta = new CuentaMovimientos(0);
        CuentasClientes cuentas=new CuentasClientes();
        String menuP="Operaciones disponibles\n" +
                "1. Crear cuenta \n"+
                "2. Seleccionar cuenta \n"+
                "9. Salir \n";

        String menu= "Operaciones disponibles\n" +
                    "1. Crear cuenta \n"+
                    "2. Seleccionar cuenta \n"+
                    "3. Ingresar dinero \n" +
                    "4. Retirar dinero \n" +
                    "5. Consultar saldo disponible \n" +
                    "6. Consultar ultimos movimientos \n" +
                    "7. Bloquear cuenta \n" +
                    "8. Desbloquear cuenta \n" +
                    "9. Salir \n";
            int opcion;

            do {
                if (cuentas.cuentaSeleccionada()){
                    System.out.println(menu);
                }else{
                    System.out.println(menuP);
                }

                System.out.println(menu);
                opcion=leer.nextInt();
                leer.nextLine();
                switch (opcion) {

                case 1:

                    System.out.println("Nombre del titular de la cuenta: ");
                    String nombre= leer.nextLine();
                    cuentas.crearCuenta(nombre,0);
                    break;

                case 2:

                    System.out.println("Titular: ");
                    String titular=leer.nextLine();
                    cuentas.seleccionarCuenta(titular);
                    break;

                case 3:

                    System.out.println("Cantidad a ingresar: ");
                    double cantidad=leer.nextDouble();
                    leer.nextLine();
                    cuentas.ingresar(cantidad);
                    mostrarResultadoUltimaOp(cuentas);
                    break;

                case 4:

                    System.out.println("Cantidad a retirar: ");
                    cantidad=leer.nextDouble();
                    leer.nextLine();
                    cuentas.retirar(cantidad);
                    mostrarResultadoUltimaOp(cuentas);
                    break;

                case 5:

                    System.out.println("Su saldo es: ");
                    System.out.println(cuentas.consultarSaldo() +" €");
                    break;

                    case 6:

                        String[][]movimientos= cuentas.ultimoMovimiento();
                        for (int i = 0; i <movimientos.length ; i++) {
                            System.out.println("Tipo: "+movimientos[i][0]+", cantidad: "+movimientos[i][1]+
                                    ", Resul: "+movimientos[i][2]+", Msg: "+movimientos[i][3]); }
                        break;

                    case 7:

                        cuentas.bloquear();
                        break;

                    case 8:

                        cuentas.desbloquear();
                        break;

                case 9:

                    System.out.println("Hasta pronto...");;
                    break;

                default:

                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion!=7);
    }


    public static void mostrarResultadoUltimaOp(CuentasClientes cuenta){
        if ((cuenta.resultadoUltimaOperacion())){
            System.out.println("Operación realizada con éxito");
        }else{
            System.out.println("Error al realizar la operación");
           // System.out.println("La cuenta está bloqueada");
        }

    }
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






}







