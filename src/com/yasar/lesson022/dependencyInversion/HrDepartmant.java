package com.yasar.lesson022.dependencyInversion;

import com.yasar.lesson022.interfaceSegration.Employee;

public class HrDepartmant {

    private INotification notification;


    public HrDepartmant(INotification notification) {
        this.notification = notification;
    }

    public void processEmployee(Employee employee) {
        String message = "Hoşgeldiniz " + employee.getName();
        notification.sendNotification(message);

    }
}
