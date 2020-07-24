package com.company;


import java.util.*;

public class Capa1 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       Empleado empleado=new Empleado();//objeto
        int opcion;
       String menu="---------Menú----------\n"  +
               "1. Añadir nota\n" +
               "2. Mostrar media\n" +
               "3. Total aprobados\n" +
               "4. Mostrar notas introducidas\n" +
               "5. Salir";
       do {
           System.out.println(menu);
           opcion=leer.nextInt();
           leer.nextLine();
           switch (opcion){
               case 1:
                   System.out.println("Introduce la nota: ");
                   int nota= leer.nextInt();
                   leer.nextLine();
                   empleado.añadirNota(nota);
                   break;
               case 2:
                   System.out.println("La media de notas es: "+empleado.mostrarMedia());

                   break;
               case 3:
                   System.out.println("El número total de aprobados es: "+empleado.totalAprobados());

                   break;
               case 4:
                   int[]arrayNotas=empleado.mostrarNotas();
                   System.out.println("El listado de notas introducidas es: ");
                   for (int i = 0; i < arrayNotas.length; i++) {
                       System.out.print(arrayNotas[i]+",");
                   }
                   System.out.println("");
                   break;
               case 5:
                   System.out.println("Saliendo de la aplicación ");

                   break;

           }
       }while (opcion!=5);

    }


}




