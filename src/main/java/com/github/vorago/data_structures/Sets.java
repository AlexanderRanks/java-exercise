package com.github.vorago.data_structures;

import java.util.*;

public class Sets {
/*
Программа запрашивает у пользователя произвольное количество строк.
Концом ввода считать пустую строку.
Программа должна сохранять только уникальные строки, дубликаты просто отбрасывать. Для этой цели использовать Set.
После окончания ввода программа должна отсортировать строки в алфавитном порядке и вывести их на консоль в отсортированном порядке
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> myStrings = new HashSet<>();
        String newString;

        System.out.println("Input strings (ENTER to exit):");
        do {
            newString = scanner.nextLine();
            if (!newString.equals("")) {
                myStrings.add(newString);
            }
        } while (!newString.equals(""));

        List<String> orderedList = new ArrayList<>();
        orderedList.addAll(myStrings);
        orderedList.sort(null);

        System.out.println(orderedList);
        scanner.close();
    }

}
