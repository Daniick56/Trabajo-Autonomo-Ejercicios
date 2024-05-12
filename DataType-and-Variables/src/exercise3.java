//Desarrolla un programa que te diga si un número que ingreses es par o impar.

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        scanner.close();
    }
}
