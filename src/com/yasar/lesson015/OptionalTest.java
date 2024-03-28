package com.yasar.lesson15;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        /**
         * Optional Oluþturma Ýþlemleri
         */

        Integer sayi = 10;
        Optional<Integer> sayi2 = Optional.of(16);
        Optional<Integer> sayi3 = Optional.of(sayi);
        System.out.println(sayi);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi3.get() + 10);


        /**
         * Optional.of metodunu kullanýyorsak mutlaka geçerli bir deðer kullanmak zorundayýz.
         * null bir deðer ile üretemeyiz.
         * null bir deðerle üretmek istiyorsak ofNullable kullanabiliriz.
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
            System.out.println("Boþ bir deðer.");
        }
        if (optional5.isPresent()) {
            System.out.println("is present");
            System.out.println(optional5.get());
        }

        Optional<String> optional6 = Optional.of("Java");

        optional6.ifPresent(System.out::println);
        optional5.ifPresent(System.out::println);
        optional6.ifPresent((s) -> System.out.println(s.toUpperCase()));

        //Eðer veri varsa optional boþ deðilse o veriyi döner yoksa metot içindeki veriyi döner.
        String result = optional6.orElse("boþ");
        String result2 = optional5.orElse("boþ");
        System.out.println("Result1 = " + result);
        System.out.println("Result2 = " + result2);

        System.out.println("------------------------------------");
        optional6.ifPresentOrElse(System.out::println, () -> System.out.println("Bulunamadý."));
        System.out.println("------------------------------------");
        optional5.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("Bulunamadý."));

        System.out.println("------------------------------------");
        System.out.println(optional6.filter(x -> x.length() > 3));
        System.out.println(optional6.filter(x -> x.length() > 4));

        optional6.filter(x -> x.length() > 3).ifPresent(System.out::println);

    }
}
