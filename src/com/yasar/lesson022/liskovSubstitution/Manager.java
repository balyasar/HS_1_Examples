package com.yasar.lesson022.liskovSubstitution;


public class Manager extends Employee implements MeetingArrangeable {
    public Manager(String name) {
        super(name, "Manager");
    }

    @Override
    public void setGrossSalary() {
        setSalary(70000);
    }

    @Override
    public void arrangeMeeting() {
        System.out.println("toplantı duzenlendi");
    }
}
