package ru.ylab;

public class LoopExample {
    public static void main(String[] args) {
        forExample(5);
        whileExample(false);
        doWhileExample(false);
    }

    public static void forExample(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Iteration " + i);
        }
    }

    public static void whileExample(boolean flag) {
        while (flag) {
            System.out.println("Flag is " + flag);
            //...
            flag = false;
        }
    }

    public static void doWhileExample(boolean flag) {
        do {
            System.out.println("Flag is " + flag);
        } while (flag);
    }
}
