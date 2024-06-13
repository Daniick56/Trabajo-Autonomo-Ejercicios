/*Escribe una función que encuentre el índice de un elemento específico en un ArrayList.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int element = 1;
        System.out.println("El índice de " + element + " es: " + findIndex(list, element));
    }

    private static int findIndex(ArrayList<Integer> list, int element) {
        return list.indexOf(element);
    }
}
