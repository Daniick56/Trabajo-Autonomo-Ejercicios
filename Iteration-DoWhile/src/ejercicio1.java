/*Crea un juego donde la computadora selecciona un número aleatorio entre 1 y 100,
 y el usuario tiene que adivinarlo.
 El programa debe seguir solicitando intentos hasta que el usuario adivine correctamente.*/

import java.util.Scanner;
import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroAleatorio);

        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}
