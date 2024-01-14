package com.yasar.lesson005;

import java.util.Scanner;

public class Runner_Question_1 {
    public static void main(String[] args) {
        /**
         *Kullanıcıdan bir ülke ismi alalım
         * Daha sonra bu ülke ismi eğer array'de var ise girdğiniz ülke bulundu.
         * Yoksa girdiğiniz ülke bulunamadı.
         */
        String[] strings = {"Türkiye", "Japonya", "Danimarka", "Fransa"};
        System.out.println(countryControl(strings));
    }

    public static String countryControl(String[] countries) {
        String country = insertCountryName();
        boolean isCountry = false;
        for (int i = 0; i < countries.length; i++) {
            if (country.equalsIgnoreCase(countries[i])) {
                isCountry = true;
                break;
            }
        }
        if (isCountry) {
            return "Girdiğiniz ülke bulundu.";
        } else {
            return "Girdiğiniz ülke bulunamadı!!!";
        }
    }

    public static String insertCountryName() {
        System.out.print("Lütfen bir ülke giriniz .... : ");
        String countryName = new Scanner(System.in).nextLine();
        return countryName;
    }
}
