package ru.ylab;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 32);
        ageMap.put("Charlie", 22);

        System.out.println("Bob's age is " + ageMap.get("Bob"));
        System.out.println("Is Carol in ageMap " + ageMap.containsKey("Carol"));

        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Age is " + entry.getValue() + " name is " + entry.getKey());
        }
    }
}
