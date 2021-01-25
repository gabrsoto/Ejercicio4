package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese numero a validar: ");
        var numeroUsuario = scn.nextInt();
        int ciclo = 1;
        int cantidadDivisores = 0;
        while (ciclo <= Math.sqrt(numeroUsuario))
        {
            if(numeroUsuario % ciclo == 0)
                cantidadDivisores++;

            ciclo++;
        }

        if(cantidadDivisores <  2)
            System.out.println("Es Primo");
        else
            System.out.println("No es Primo");
    }
}
