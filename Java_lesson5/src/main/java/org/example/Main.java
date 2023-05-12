package org.example;

import java.util.*;

import static org.example.Task1.foundMap;
import static org.example.Task1.printFound;
import static org.example.Task2.checkRepeat;

public class Main {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия";
        String search = "росс";
        printFound(foundMap(str, search));

        String[] str2 = {"Иван Иванов","Светлана Петрова","Кристина Белова","Анна Мусина","Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};
        List<String> list = new ArrayList<>(Arrays.asList(str2));
        checkRepeat(list);
    }
}