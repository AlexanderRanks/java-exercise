package com.github.vorago.data_structures;

import java.util.*;

public class Maps {
    /*
    Программа запрашивает у пользователя произвольное количество строк.
    Концом ввода считать пустую строку.
    Программа должна сохранять уникальные строки + подсчитывать сколько раз их ввёл пользователь,
    дубликаты отбрасывать. Для этой цели использовать Map.
    После окончания ввода программа должна отсортировать строки
    (более чаще встречающиеся строки должны быть в начале, а встретившиеся всего один раз в конце) и вывести результат на консоль.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> myMap = new HashMap<>();
        String newString;
        System.out.println("Input strings (ENTER to exit):");
        do {
            newString = scanner.nextLine();
            if (!newString.equals("")) {
                if (myMap.containsKey(newString)) {
                    myMap.replace(newString, myMap.get(newString) + 1);
                } else {
                    myMap.put(newString, 1);
                }
            }
        } while (!newString.equals(""));

        List<String> orderedList = new ArrayList<>();
        for (String st : myMap.keySet()) {
            Maps.addToArrayList(orderedList, st, myMap);
        }
        System.out.println(orderedList);
    }

    private static void addToArrayList(List orderedList, String key, Map order) {
        order.get(key);
        int i = 0;
        boolean added = false;
        do {
            if (i==orderedList.size()){
                orderedList.add(key);
                added = true;
            } else{
                int newOrder = (Integer) order.get(key);
                int currentOrder = (Integer) order.get(orderedList.get(i));
                if (newOrder>=currentOrder) {
                    orderedList.add(i, key);
                    added = true;
                }
            }
            i++;
        } while (!added);
    }
}
