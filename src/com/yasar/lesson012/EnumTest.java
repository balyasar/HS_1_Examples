package com.yasar.lesson012;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(EMonths.OCTOBER);

        EMonths month1 = EMonths.JANUARY;
        EMonths month2 = EMonths.FEBRUARY;

        //Stringe �evirme metotlar�
        String month = EMonths.JANUARY.name();
        String month3 = EMonths.JANUARY.toString();

        System.out.println(month1);
        System.out.println(month.toLowerCase());
        System.out.println(month3);

        // 2 - S�ralamas�n� Bulan Metot
        System.out.println(EMonths.JANUARY.ordinal());
        System.out.println(EMonths.FEBRUARY.ordinal());
        System.out.println(EMonths.OCTOBER.ordinal());

        // 3 - Enumlar� Diziye Aktarma Metodu
        EMonths[] months = EMonths.values();
        //Enum[] months2 = EMonths.values();

        // Mevsimi yaz olanlar� yazd�ral�m.
        for (EMonths ay : months) {
            if (ay.getSeason().equals("Summer")) {
                System.out.println((ay.ordinal() + 1) + " - " + ay.name());
            }
        }

        EMonths.JANUARY.nameLenght();

        System.out.println(EMonths.JUNE.getSeason());
        System.out.println(EMonths.OCTOBER.getSeason());
        System.out.println(EMonths.OCTOBER.getDayNumber());

        System.out.print("L�tfen bir ay adi giriniz ... : ");
        String name = new Scanner(System.in).nextLine().toUpperCase();
        EMonths month4 = EMonths.valueOf(name);
        System.out.println(month4);

    }
}

