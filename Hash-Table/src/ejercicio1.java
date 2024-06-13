/*Escribe un programa que almacene y luego imprima los nombres y edades de varias personas usando un Hashtable.*/

import java.util.Hashtable;

public class ejercicio1 {
    public static void main(String[] args){
        Hashtable<String, Integer> people = new Hashtable<>();
        people.put("Juan", 25);
        people.put("Ana", 30);
        people.put("Luis", 28);

        for (String name : people.keySet()) {
            System.out.println("Nombre: " + name + ", Edad: " + people.get(name));
        }
    }
}
