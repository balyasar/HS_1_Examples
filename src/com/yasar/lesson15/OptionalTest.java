package com.yasar.lesson15;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        /**
         * Optional Olu�turma ��lemleri
         */

        Integer sayi = 10;
        Optional<Integer> sayi2 = Optional.of(16);
        Optional<Integer> sayi3 = Optional.of(sayi);
        System.out.println(sayi);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi3.get() + 10);


        /**
         * Optional.of metodunu kullan�yorsak mutlaka ge�erli bir de�er kullanmak zorunday�z.
         * null bir de�er ile �retemeyiz.
         * null bir de�erle �retmek istiyorsak ofNullable kullanabiliriz.
         */
        String deger = null;
        String deger2 = "Yasar";
        Optional<String> optional1 = Optional.of(deger2);
        System.out.println(optional1);
        Optional<String> optional2 = Optional.ofNullable(deger2);
        System.out.println(optional2);
        Optional<String> optional3 = Optional.ofNullable(deger);
        System.out.println(optional3);
        //Optional<String> optional4 = Optional.of(deger);
        //System.out.println(optional1);
        Optional<String> optional5 = Optional.empty();
        System.out.println(optional5);

        String isim = optional2.get();
        System.out.println(isim);
        if (optional5.isEmpty()) {
            System.out.println("Bo� bir de�er.");
        }
        if (optional5.isPresent()) {
            System.out.println("is present");
            System.out.println(optional5.get());
        }

        Optional<String> optional6 = Optional.of("Java");

        optional6.ifPresent(System.out::println);
        optional5.ifPresent(System.out::println);
        optional6.ifPresent((s) -> System.out.println(s.toUpperCase()));

        //E�er veri varsa optional bo� de�ilse o veriyi d�ner yoksa metot i�indeki veriyi d�ner.
        String result = optional6.orElse("bo�");
        String result2 = optional5.orElse("bo�");
        System.out.println("Result1 = " + result);
        System.out.println("Result2 = " + result2);

        System.out.println("------------------------------------");
        optional6.ifPresentOrElse(System.out::println, () -> System.out.println("Bulunamad�."));
        System.out.println("------------------------------------");
        optional5.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("Bulunamad�."));

        System.out.println("------------------------------------");
        System.out.println(optional6.filter(x -> x.length() > 3));
        System.out.println(optional6.filter(x -> x.length() > 4));

        optional6.filter(x -> x.length() > 3).ifPresent(System.out::println);

    }
}
