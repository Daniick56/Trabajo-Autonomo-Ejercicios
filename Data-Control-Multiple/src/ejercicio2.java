/* Desarrolla un código que permita al usuario seleccionar una
opción de un menú utilizando `switch-case`.*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú:");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.print("Selecciona una opción (1-3): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la Opción 1");
                break;
            case 2:
                System.out.println("Seleccionaste la Opción 2");
                break;
            case 3:
                System.out.println("Seleccionaste la Opción 3");
                break;
            default:
                System.out.println("Opción no válida. Debes seleccionar una opción del 1 al 3.");
                break;
        }

        scanner.close();
    }
}
