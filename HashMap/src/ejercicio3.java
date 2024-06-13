/*Crea un HashMap que almacene nombres de personas como claves y sus edades como valores.
Elimina un nombre específico del mapa e imprime el contenido restante del HashMap.*/

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Juan", 25);
        people.put("Ana", 30);
        people.put("Luis", 28);

        System.out.println("Ingresa el nombre para ser eliminado: ");
        String keyToRemove = input.next();
        people.remove(keyToRemove);

        for (String name : people.keySet()) {
            System.out.println("Nombre: " + name + ", Edad: " + people.get(name));
        }
    }
}
