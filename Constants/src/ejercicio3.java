/*Implementa un programa que use una constante para definir la edad mínima
para ser considerado mayor de edad, y determine si una persona es mayor de edad o no.*/

import java.util.Scanner;

public class ejercicio3 {
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
