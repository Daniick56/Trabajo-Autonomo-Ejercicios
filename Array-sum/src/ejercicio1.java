/*Escribe una función que calcule la suma de los elementos de un array de enteros.*/

public class ejercicio1 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("La suma de los elementos es: " + sumArray(arr));
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}
