/*Crea un programa que calcule el área de un círculo
usando una constante para el valor de PI.*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = PI * radio * radio;

        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        scanner.close();
    }
}
