package com.yasar.lesson022.dependencyInversion;

public class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("email bildirimi gonderildi");
        System.out.println(message);
    }
}
