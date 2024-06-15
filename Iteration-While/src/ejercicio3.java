/*Escribe un programa que calcule el factorial de un número dado por el usuario.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int i = numero;

        while (i > 1) {
            factorial *= i;
            i--;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
