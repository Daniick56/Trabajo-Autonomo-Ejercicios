/*Desarrolla un código que convierta grados Fahrenheit a Celsius usando
constantes para la fórmula de conversión.*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        final double FAHRENHEIT_A_CELSIUS_RATIO = 5.0 / 9.0;
        final double CELSIUS_FAHRENHEIT_DIFF = 32.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - CELSIUS_FAHRENHEIT_DIFF) * FAHRENHEIT_A_CELSIUS_RATIO;

        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");

        scanner.close();
    }
}
