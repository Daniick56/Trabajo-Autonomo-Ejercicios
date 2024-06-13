/**/

import java.util.Hashtable;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Juan", 25);
        table.put("Ana", 30);
        table.put("Luis", 28);

        String key = "Ana";
        removeEntry(table, key);
        System.out.println("Hashtable después de eliminar la clave " + key + ": " + table);
    }

    private static void removeEntry(Hashtable<String, Integer> table, String key) {
        table.remove(key);
    }
}
