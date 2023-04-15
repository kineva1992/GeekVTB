package com.GeekVtb.Lesson5;

import java.util.*;

public class LessonMain5 {
    /**
     *  Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
     * вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     * Посчитать, сколько раз встречается каждое слово.
     *
     * 2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
     * телефонных номеров. В этот телефонный справочник с помощью метода add() можно
     * добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
     * учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
     * тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
     * лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
     * через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
     * справочника.
     * @autor Kuzin Alexandr
     * @param args
     */
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "pet", "lock", "mock", "lock", "fork", "mock", "golf", "lock"};

        Map<String,Integer> map = new HashMap<>();
        for(String word : words) {
            map.put(word, map.getOrDefault(word,0) + 1);
        }

        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        PhoneBook pb = new PhoneBook();
        pb.add("Ivanov", "123");
        pb.add("Petrov","456");
        pb.add("Sidarov","789");
        pb.add("Petrov","012");

        System.out.println(pb.get("Petrov"));



    }
}
