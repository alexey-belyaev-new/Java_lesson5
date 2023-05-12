package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    static Map<String, Integer> foundMap(String str, String search) {
        Map<String, Integer> map = new HashMap<>(); //создаем возвращаемую мапу
        String[] words = str.toLowerCase().split("[^а-яА-Я]");  //преобразуем строку в массив
        int size = words.length;
        for (int i = 0; i < size; i++) { //проходим по массиву слов
            if (words[i].indexOf(search.toLowerCase()) != -1) { //если нашли вхождение части слова
                map.putIfAbsent(words[i], 0);
                map.put(words[i], map.get(words[i]) + 1); //добавляем в мапу
            }
        }
        return map;
    }

    static public void printFound(Map<String, Integer> foundMap) {
        for (Map.Entry<String, Integer> pair : foundMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
