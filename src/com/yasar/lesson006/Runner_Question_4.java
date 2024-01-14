package com.yasar.lesson006;

public class Runner_Question_4 {
    public static void main(String[] args) {
        /**
         * 1 - kullanıcıların yaş ortalamasını bulan bir method yazalım.
         * 2 - En yaşlı kullanıcının ismini dönen method yazalım.
         */

        String[][] users = {
                {"Mustafa", "35"},
                {"Öznur", "40"},
                {"Serkan", "38"},
                {"Furkan", "26"},
                {"Özge", "25"},
        };
        System.out.println("Kullanıcıların yaş ortalaması .... : " + averageAge(users));
        System.out.println("En yaşlı kullanıcı ............... : " + oldestPerson(users));
    }

    public static double averageAge(String[][] strings) {
        int totalAge = 0;
        int age;
        for (int i = 0; i < strings.length; i++) {
            age = Integer.parseInt(strings[i][1]);
            totalAge += age;
        }
        return totalAge / (double) strings.length;
    }

    public static String oldestPerson(String[][] strings) {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (int i = 0; i < strings.length; i++) {
            int age = Integer.parseInt(strings[i][1]);
            if (age > max) {
                max = age;
                name = strings[i][0];
            }
        }
        return name;
    }
}
