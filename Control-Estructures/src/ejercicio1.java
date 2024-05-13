/*Haz un programa que te diga si eres mayor de edad o no, dependiendo de
tu edad ingresada.*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        final int EDAD_MINIMA_MAYOR_EDAD = 18;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= EDAD_MINIMA_MAYOR_EDAD) {
            System.out.println("¡Eres mayor de edad!");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }
}
