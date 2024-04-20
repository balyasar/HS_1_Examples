package com.yasar.lesson022.liskovSubstitution;

public class Hr extends Employee {
    public Hr(String name) {
        super(name, "Hr");
    }

    @Override
    public void setGrossSalary() {
        setSalary(50000);
    }
}
