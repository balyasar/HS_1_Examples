package com.yasar.lesson013.arrayListOrnek;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek {
    public static void main(String[] args) {
        /**
         * Ankara
         * Bursa
         * Antalya
         * Artvin
         * Erzurum
         * Karaman
         *
         * bu �ehirlerle bir liste olu�tural�m
         *1 - An ile ba�layan �ehirleri listeden silmenizi istiyorum. Bir metod yazal�m.
         */

        List<String> sehirList = new ArrayList<>(List.of("Ankara", "Bursa", "Antalya", "Artvin", "Erzurum", "Karaman"));
        sehirList.forEach(System.out::println);
        System.out.println("---------------------------------------");
        anIleBaslayanSehirleriGuncelle(sehirList);
        System.out.println(anIleBaslayanSehirleriSil(sehirList));
        System.out.println("---------------------------------------");
        sehirList.forEach(System.out::println);

    }

    public static List<String> anIleBaslayanSehirleriSil(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).startsWith("An")) {
                stringList.remove(i);
                i--;
            }
        }
        return stringList;
    }

    // foreach asenkron �al��t��� i�in silme ve ekleme i�lemleri foreach �zerinden yap�lamaz.

    /*public static List<String> anIleBaslayanSehirleriSil(List<String> stringList) {
        for (String sehir : stringList) {
            if (sehir.startsWith("An")) {
                stringList.remove(sehir);
            }
        }
        return stringList;
    }*/

    public static void anIleBaslayanSehirleriGuncelle(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).startsWith("An")) {
                stringList.set(i, "xxx");
            }
        }
    }

}
