/*Escribe un programa que cuente la frecuencia de cada palabra en una cadena usando un HashMap.*/

import java.util.HashMap;

public class ejercicio1 {
    public static void main(String[] args){
        String str = "Hola mundo hola";
        HashMap<String, Integer> wordCount = countWords(str);
        System.out.println(wordCount);
    }

    private static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
