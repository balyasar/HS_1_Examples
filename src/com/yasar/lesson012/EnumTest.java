package com.yasar.lesson012;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(EMonths.OCTOBER);

        EMonths month1 = EMonths.JANUARY;
        EMonths month2 = EMonths.FEBRUARY;

        //Stringe çevirme metotlarý
        String month = EMonths.JANUARY.name();
        String month3 = EMonths.JANUARY.toString();

        System.out.println(month1);
        System.out.println(month.toLowerCase());
        System.out.println(month3);

        // 2 - Sýralamasýný Bulan Metot
        System.out.println(EMonths.JANUARY.ordinal());
        System.out.println(EMonths.FEBRUARY.ordinal());
        System.out.println(EMonths.OCTOBER.ordinal());

        // 3 - Enumlarý Diziye Aktarma Metodu
        EMonths[] months = EMonths.values();
        //Enum[] months2 = EMonths.values();

        // Mevsimi yaz olanlarý yazdýralým.
        for (EMonths ay : months) {
            if (ay.getSeason().equals("Summer")) {
                System.out.println((ay.ordinal() + 1) + " - " + ay.name());
            }
        }

        EMonths.JANUARY.nameLenght();

        System.out.println(EMonths.JUNE.getSeason());
        System.out.println(EMonths.OCTOBER.getSeason());
        System.out.println(EMonths.OCTOBER.getDayNumber());

        System.out.print("Lütfen bir ay adi giriniz ... : ");
        String name = new Scanner(System.in).nextLine().toUpperCase();
        EMonths month4 = EMonths.valueOf(name);
        System.out.println(month4);

    }
}

