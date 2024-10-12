package ru.ylab;

public class SwitchCaseExample {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        switchCaseExample(dayOfWeek);
    }

    public static void switchCaseExample(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
                //....
            default:
                System.out.println("Unknown day of week");
        }
    }
}
