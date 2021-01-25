package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese Cantidad de nros primos: ");
        int count = scn.nextInt();
        int number = 0;
        while (number < count){
            if(IsPrimo(number))
                System.out.println(number);

            number++;
        }
    }
    public static boolean IsPrimo (int numberUser)
    {
        int cicle = 1;
        int countDiv = 0;
        while (cicle <= Math.sqrt(numberUser))
        {
            if(numberUser % cicle == 0)
                countDiv++;

            cicle++;
        }

        return countDiv <  2;
    }
}
