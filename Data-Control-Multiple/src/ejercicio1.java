/*Crea un programa que solicite al usuario ingresar un número
del 1 al 7 y luego imprima el día de la semana correspondiente.*/

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7 para conocer el día de la semana: ");
        int numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido. Ingresa un número del 1 al 7.";
                break;
        }

        System.out.println("El día correspondiente al número " + numero + " es: " + dia);

        scanner.close();
    }
}
