//Crea un código que calcule el área de un triángulo
//usando la base y la altura como variables.

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);

        scanner.close();
    }
}
