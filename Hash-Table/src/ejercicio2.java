/*Escribe una función que verifique si una clave específica existe en una Hashtable.*/

import java.util.Hashtable;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Juan", 25);
        table.put("Ana", 30);

        String key = "Ana";
        System.out.println("¿Contiene la clave " + key + "? " + containsKey(table, key));
    }

    private static boolean containsKey(Hashtable<String, Integer> table, String key) {
        return table.containsKey(key);
    }
}
