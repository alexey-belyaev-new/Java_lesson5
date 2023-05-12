package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    static void checkRepeat(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String[] name = list.get(i).split(" ");
            map.putIfAbsent(name[0], 0);
            map.put(name[0], map.get(name[0]) + 1);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > 1) System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
