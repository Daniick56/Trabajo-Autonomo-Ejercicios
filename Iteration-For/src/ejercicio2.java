/*Crea un programa que calcule la suma de todos los números pares del 1 al 100.*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares del 1 al 100 es: " + suma);
    }
}
