package com.yasar.lesson022.openClosed;

public class Hr extends Employee {
    public Hr(String name) {
        super(name, "Hr");
    }

    @Override
    public void setGrossSalary() {
        setSalary(50000);
    }
}
