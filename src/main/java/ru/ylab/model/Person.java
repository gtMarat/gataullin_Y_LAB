package ru.ylab.model;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Привет, меня зовут " + name + " и мне " + age + " лет");
    }
}
