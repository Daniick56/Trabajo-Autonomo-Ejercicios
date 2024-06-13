/*Escribe una función que calcule la suma de los elementos en un ArrayList de enteros.*/

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

        System.out.println("La suma de los elementos es: " + sumArrayList(list));
    }

    private static int sumArrayList(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
