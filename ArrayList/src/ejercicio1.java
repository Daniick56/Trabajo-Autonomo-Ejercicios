/*Escribe un programa que agregue los números del 1 al 10 a un ArrayList y los imprima.*/

import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
