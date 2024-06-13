/*Escribe una función que encuentre el elemento máximo en un array de enteros.*/

public class ejercicio2 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("El elemento máximo es: " + findMax(arr));
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
