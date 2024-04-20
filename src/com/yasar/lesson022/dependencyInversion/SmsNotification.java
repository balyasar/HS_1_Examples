package com.yasar.lesson022.dependencyInversion;

public class SmsNotification implements INotification {

    public void sendNotification(String message) {
        System.out.println("sms bildirimi gonderildi");
        System.out.println(message);
    }
}
