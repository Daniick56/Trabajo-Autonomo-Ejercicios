/*Escribe una función que verifique si un array de enteros contiene un número específico.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        System.out.println(contains(arr, target));
    }

    private static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
