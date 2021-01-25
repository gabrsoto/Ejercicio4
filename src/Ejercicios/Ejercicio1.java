package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese Cantidad de Pares: ");
        int cantidad = scn.nextInt();

        int par = 0;
        while (par < cantidad)
        {
            if(EsPar(par))
                System.out.println(par);
            par++;
        }
    }

    public static boolean EsPar(int numero){
        return (numero%2 == 0);
    }
}
