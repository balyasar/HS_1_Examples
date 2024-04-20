package com.yasar.lesson022.interfaceSegration;


public class Intern extends Employee implements IIntern {

    public Intern(String name) {
        super(name, "Intern");
    }

    @Override
    public void setGrossSalary() {
        setSalary(20000);
    }


    @Override
    public void requestBonus() {

    }


    @Override
    public void askMentor() {

    }
}
