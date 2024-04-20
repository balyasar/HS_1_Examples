package com.yasar.lesson022.dependencyInversion;

import com.yasar.lesson022.interfaceSegration.Developer;

public class Test {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        SmsNotification smsNotification = new SmsNotification();
        HrDepartmant hrDepartmant = new HrDepartmant(emailNotification);
        hrDepartmant.processEmployee(new Developer("Mustafa"));


    }
}
