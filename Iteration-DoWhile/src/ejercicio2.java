/*Crea un programa que calcule el promedio de una serie de números introducidos por el usuario.
El usuario puede decidir cuándo dejar de introducir números.*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 3);
    }
}
