package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[][] temperaturas=new String[10][2];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre ciudad: ");
            String ciudad=leer.nextLine();
            System.out.println("Temperatura: ");
            String temp=leer.nextLine();
            temperaturas[i][0]=ciudad;
            temperaturas[i][1]=temp;
        }
        double media=0.0;
        for (int i = 0; i < temperaturas.length; i++) {
            media+=convertirEntero(temperaturas[i][1]);
        }
        media=media/10;
        System.out.println("La temperatura media es: "+media);

        for (int i = 0; i < temperaturas.length; i++) {
            if(convertirEntero(temperaturas[i][1])<media){
                System.out.println("Ciudad: "+temperaturas[i][0]+", temperatura: "+temperaturas[i][1]);
            }
        }

    }

    public static int convertirEntero(String valor){
        return Integer.parseInt(valor);
    }

}
