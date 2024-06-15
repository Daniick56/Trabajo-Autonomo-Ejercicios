/*Escribe un programa que cuente el número de palabras en una cadena dada por el usuario.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        char continuar;

        do {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            suma += numero;
            contador++;

            System.out.print("¿Quieres introducir otro número? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        double promedio = (double) suma / contador;
        System.out.println("El promedio de los números introducidos es: " + promedio);
    }
}
