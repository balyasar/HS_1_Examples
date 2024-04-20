package com.yasar.lesson022.openClosed;

public class Developer extends Employee {

//    // kýdem
//    private String seniority;

    public Developer(String name) {
        super(name, "Developer");
    }


    @Override
    public void setGrossSalary() {
        setSalary(60000);
    }
}
