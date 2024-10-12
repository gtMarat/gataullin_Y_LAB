package ru.ylab;

public class InstanceofExample {
    public static void main(String[] args) {
        Object object = "string";

        if (object instanceof String string) {
            System.out.println(string);
        }
    }
}
