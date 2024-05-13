/*Implementa un programa que calcule el costo de envío según
una zona especificada por el usuario utilizando `switch-case`*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zonas disponibles para envío:");
        System.out.println("1. Zona A");
        System.out.println("2. Zona B");
        System.out.println("3. Zona C");
        System.out.print("Selecciona la zona de envío (1-3): ");
        int zona = scanner.nextInt();

        double costoEnvio;

        switch (zona) {
            case 1:
                costoEnvio = 10.0; // Costo de envío para Zona A
                break;
            case 2:
                costoEnvio = 15.0; // Costo de envío para Zona B
                break;
            case 3:
                costoEnvio = 20.0; // Costo de envío para Zona C
                break;
            default:
                System.out.println("Zona no válida. Debes seleccionar una zona del 1 al 3.");
                scanner.close();
                return;
        }

        System.out.println("El costo de envío para la Zona " + zona + " es: $" + costoEnvio);

        scanner.close();
    }
}
