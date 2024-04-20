package com.yasar.lesson022.liskovSubstitution;


public class Developer extends Employee implements MeetingArrangeable {

//    // kıdem
//    private String seniority;

    public Developer(String name) {
        super(name, "Developer");
    }


    @Override
    public void setGrossSalary() {
        setSalary(60000);
    }

    @Override
    public void arrangeMeeting() {
        System.out.println("toplantı duzenlendi");
    }
}
