/*Desarrolla un programa que compare dos números ingresados y te diga cuál es el mayor.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo número (" + num2 + ").");
        } else if (num1 < num2) {
            System.out.println("El segundo número (" + num2 + ") es mayor que el primer número (" + num1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }
}
