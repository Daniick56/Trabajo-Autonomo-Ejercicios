/*Crea un HashMap que almacene nombres de personas como claves y sus edades como valores.
Verifica si un nombre específico existe en el mapa e imprime un mensaje apropiado.*/

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Juan", 25);
        people.put("Ana", 30);
        people.put("Luis", 28);

        String keyToCheck = "Ana";
        if (people.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " está en el HashMap.");
        } else {
            System.out.println(keyToCheck + " no está en el HashMap.");
        }
    }
}
