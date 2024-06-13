/*Escribe una función que elimine un elemento específico de un ArrayList */

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int element = 3;
        removeElement(list, element);
        System.out.println("Lista después de eliminar " + element + ": " + list);
    }

    private static void removeElement(ArrayList<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }
}
