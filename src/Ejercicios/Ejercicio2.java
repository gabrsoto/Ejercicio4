package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.printf("Ingrese Numero a validar: ");
        int cantidad = scn.nextInt();

        System.out.printf("Ingrese Numero validador: ");
        int numeroValidador = scn.nextInt();

        int numeroReturn = 0;

        while (numeroReturn < cantidad)
        {
            if(EsMultiplo(numeroReturn, numeroValidador))
                System.out.println(numeroReturn);
            numeroReturn++;
        }
    }

    public static boolean EsMultiplo(int numero, int numeroControl)
    {
        return   ((numero % numeroControl) == 0);
    }
}
