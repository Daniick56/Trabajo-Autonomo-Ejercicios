//Haz un programa que te pida tu nombre y lo muestre
//en la pantalla.

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");

        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + "! Bienvenido.");

        scanner.close();
    }
}
