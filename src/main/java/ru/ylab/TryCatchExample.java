package ru.ylab;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryCatchExample {
    public static void main(String[] args) {
        tryCatch();
        tryWithResources();
    }

    public static void tryCatch() {
        try {
            throw new RuntimeException("Message");
            //..
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //код обработки ошибки
        } finally {
            //код выполняющийся всегда
        }
    }

    public static void tryWithResources() {
        byte[] bytes = "string".getBytes(StandardCharsets.UTF_8);
        try (BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new ByteArrayInputStream(bytes))) {
            System.out.println(bytes);
        } catch (IOException e) {

        }
    }
}
