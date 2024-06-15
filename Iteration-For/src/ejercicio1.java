/*Escribe un programa que pida al usuario un número y luego genere
y muestre la tabla de multiplicar de ese número desde el 1 hasta el 10.*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
