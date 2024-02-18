package com.yasar.lesson012;

public enum EMonths {
    JANUARY("Winter",31),
    FEBRUARY("Winter",28),
    MARCH("Spring",31),
    APRIL("Spring",30),
    MAY("Spring",31),
    JUNE("Summer",30),
    JULY("Summer",31),
    AUGUST("Summer",31),
    SEPTEMBER("Autumn",30),
    OCTOBER("Autumn",31),
    NOVEMBER("Autumn",30),
    DECEMBER("Winter",31);

    private String season;
    private int dayNumber;

    EMonths(String season, int dayNumber) {
        this.season = season;
        this.dayNumber = dayNumber;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void nameLenght() {
        System.out.println(this.name().length());
    }


}
