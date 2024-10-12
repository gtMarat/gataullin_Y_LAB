package ru.ylab;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);

        colors.add(1, "Yellow");

        System.out.println(colors);

        System.out.println("Size of colors " + colors.size());

        colors.remove("Blue");

        System.out.println(colors);
    }
}
