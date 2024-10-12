package ru.ylab;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueWords = new HashSet<>();

        uniqueWords.add("Apple");
        uniqueWords.add("Banana");
        uniqueWords.add("Apple"); //дубликат - добавлен не будет

        System.out.println(uniqueWords);

        System.out.println("Size of words " + uniqueWords.size());

        uniqueWords.remove("Apple");

        System.out.println(uniqueWords);
    }
}
