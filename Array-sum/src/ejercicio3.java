/*Escribe una función que reciba un array de enteros y devuelva
un array donde cada elemento es la suma acumulada de los elementos anteriores.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        int[] enteros = {1, 2, 3, 4, 5};
        int[] result = cumulativeSum(enteros);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] cumulativeSum(int[] enteros) {
        int[] resultado = new int[enteros.length];
        int sum = 0;
        for (int i = 0; i < enteros.length; i++) {
            sum += enteros[i];
            resultado[i] = sum;
        }
        return resultado;
    }
}
