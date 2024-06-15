/*Escribe un programa que cuente el número de palabras en una cadena dada por el usuario.*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        int contadorPalabras = 0;
        int i = 0;

        while (i < cadena.length()) {
            while (i < cadena.length() && cadena.charAt(i) == ' ') {
                i++;
            }
            if (i < cadena.length() && cadena.charAt(i) != ' ') {
                contadorPalabras++;
                while (i < cadena.length() && cadena.charAt(i) != ' ') {
                    i++;
                }
            }
        }

        System.out.println("El número de palabras en la cadena es: " + contadorPalabras);
    }
}
