package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese cantidad de los primeros numeros a mostrar: ");
        int countNumber = scn.nextInt();

        System.out.println("Ingrese cantidad de digitos: ");
        int cantDigito = scn.nextInt();

        System.out.println("Ingrese digito a buscar: ");
        int numeroBuscar = scn.nextInt();

        int countGet = 1;
        int result = 0;
        while(result < countNumber){
            if(CumpleCondicion(countGet, cantDigito, numeroBuscar))
            {
                System.out.println(countGet);
                result++;
            }
            countGet++;
        }

    }

    public static boolean CumpleCondicion(int numero, int digitos, int numeroValidar)
    {
        String sCountGet = Integer.toString(numero);
        String numeroBuscar = Integer.toString(numeroValidar);
        int countRepeat = 0;
        for (int i = 0; i < sCountGet.length(); i++) {
            if(Character.toString(sCountGet.charAt(i)).equals(numeroBuscar))
                countRepeat++;
        }

        return sCountGet.length() >= digitos && countRepeat >= digitos;
    }
}
