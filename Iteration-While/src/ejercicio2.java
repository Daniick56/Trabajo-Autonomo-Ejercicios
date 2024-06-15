/*Crea un programa que solicite una contraseña al usuario y no permita avanzar hasta que la contraseña sea correcta.*/

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final String CONTRASENA_CORRECTA = "12345";
        String contrasena;

        System.out.println("Introduce la contraseña: ");
        contrasena = scanner.nextLine();

        while (!contrasena.equals(CONTRASENA_CORRECTA)) {
            System.out.println("Contraseña incorrecta. Inténtalo de nuevo: ");
            contrasena = scanner.nextLine();
        }

        System.out.println("Contraseña correcta. Acceso concedido.");
    }
}
