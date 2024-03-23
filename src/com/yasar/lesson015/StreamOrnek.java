package com.yasar.lesson015;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOrnek {
    /*
        COLLECT
          Stream yap�s�ndaki verileri herhangi bir collectionda toplamya yar�yor
          collect metodu toplama collect(Collectors.toList()) ==> bu metod listede toplamaya yarar
          collect metodu toplama collect(Collectors.toSet()) ==> bu metod set de toplamaya yarar

        FOREACH
        foreach metodu herhangi bir deger dondurmez(return degeri yoktur)
        foreach metodu stream ak���n� sonland�r� foreachden sonra herhangi bir stream metodunu kullan�lamaz

        MAP
        map metodu bize bir deger dondurur. ve mutlaka return bekler
        map metodunda sonra ba�ka stream metodlarn� kullanabiliriz
        map metodunu �al�st�rd�mg�z listeden bag�ms�z farkl� veri turlerinde listeler donebilir

        F�LTER
        filter filreleme i�lemleri i�in kullan�l�r
        mutlaka bir ko�ul gerektirir
        bize bir stream yap�s� done biz bunu collection da toplyabilirz
        filter i�inde kullancag�m�z kosullar�n donus tipleri mutlaka true yada false olmal�d�r
        filter sadece uzerinde cal�st�g� collection turunde bir collect�on doner
        filter stream ak�s�n� sonland�rmaz devam�nada stream metodlar� kullanilabilir
      */

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10, 20, 402, 50);
        //Streamler t�ketildikten sonra bir daha kullan�lamaz.
        stream.forEach(System.out::println);
        //stream.forEach(System.out::println);
        System.out.println("------------------------------------");

        List<Integer> sayilar = new ArrayList<>(List.of(25, 32, 45, 87, 95));
        //FOREACH KULLANIMI
        //1 - �ift sayilari yazdiral�m. Stream yapisi kullanarak.
        sayilar.forEach(x -> System.out.println(x + 5));
        System.out.println("------------------------------------");
        sayilar.forEach(x -> {
            if (x % 2 == 0)
                System.out.println(x);
        });
        System.out.println("------------------------------------");

        //2 - Say�lar listesindeki elemanlar� ba�ka bir listede toplayaca��z.
        //Fakat bunu yaparken �ift say�lar�n 5 eksi�ini, tek say�lar�n 11 fazlas�n� toplayal�m.

        List<Integer> sayilar2 = new ArrayList<>();
        sayilar.stream().forEach(x -> {
            if (x % 2 == 0) {
                sayilar2.add(x - 5);
            } else {
                sayilar2.add(x + 11);
            }
        });
        System.out.println(sayilar2);
        System.out.println("------------------------------------");
        List<Integer> sayilar3 = new ArrayList<>();
        sayilar3.stream().forEach(x -> sayilar3.add(x + 10));
        System.out.println(sayilar3);

        // MAP KULLANIMI
        //2 - Say�lar listesindeki elemanlar� ba�ka bir listede toplayaca��z.
        //Fakat bunu yaparken �ift say�lar�n 5 eksi�ini, tek say�lar�n 11 fazlas�n� toplayal�m.

        List<Integer> sayilar5 = sayilar.stream().map(x -> {
            if (x % 2 == 0) {
                return x - 5;
            } else {
                return x + 11;
            }
        }).collect(Collectors.toList());



        System.out.println("Say�lar 5 ... : " + sayilar5);

        sayilar.stream().map(x -> {
            if (x % 2 == 0) {
                return x - 5;
            } else {
                return x + 11;
            }
        }).forEach(System.out::println);


        List<Integer> sayilar6 = sayilar.stream().map(x -> x + 10).toList();
        System.out.println(sayilar6);
        List<String> stringList = sayilar.stream().map(x -> x + "=").collect(Collectors.toList());
        System.out.println(stringList);
        List<Boolean> booleanList = sayilar.stream().map(x -> {
            if (x % 2 == 0)
                return true;
            else
                return false;
        }).collect(Collectors.toList());
        System.out.println(booleanList);

        sayilar.stream().map(x -> x + "abc").forEach(y -> System.out.println(y.toUpperCase().substring(1)));



       /* Set<Integer> sayilar6 = sayilar.stream().map(x -> {
            if (x % 2 == 0) {
                return x - 5;
            } else {
                return x + 11;
            }
        }).collect(Collectors.toSet());*/

        //FILTER

        sayilar.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("------------------------------------");
        List<String> programlar = new ArrayList<>(List.of("Java", "React", "Html", "Css", "Javascript", "JQuery", "NodeJs"));
        // J ile ba�layan programlar� yazd�ral�m.
        programlar.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
        // J ile ba�layan programlar� bir listede toplayal�m.
        List<String> jIleBaslayanlar = programlar.stream().filter(x -> x.startsWith("J")).collect(Collectors.toList());
        System.out.println(jIleBaslayanlar);

        //J ile ba�lamayan programlar� bir listede toplayal�m.
        List<String> digerProgramlar = programlar.stream().filter(x -> {
            if (x.startsWith("J"))
                return false;
            else
                return true;
        }).toList();
        System.out.println(digerProgramlar);

        //J ile ba�layanlar�n uzunluklar�n� bir listede toplayal�m.

        List<Integer> jIleBaslayanlarinUzunlugu = programlar.stream().filter(x -> x.startsWith("J")).map(y -> y.length()).toList();
        System.out.println(jIleBaslayanlarinUzunlugu);

        programlar.stream().filter(x -> x.startsWith("J")).map(y -> y.length()).forEach(System.out::println);

        //J ile ba�layanlar�n uzunluklar�n� 5'ten b�y�kse bu uzunluklar� bir listede toplayal�m.

        List<Integer> uzunluklar = programlar.stream()
                .filter(x -> x.startsWith("J"))
                .map(y -> y.length())
                .filter(z -> z > 5).toList();

        programlar.stream().filter(x -> x.startsWith("J") && x.length() >= 5).map(y -> y.length()).forEach(System.out::println);
        System.out.println(uzunluklar);

        // TENARY KULLANIMI ORNEK
        System.out.println("-------------------------------------");
        sayilar.stream().map(x -> x % 2 == 0 ? x - 5 : x + 11).forEach(System.out::println);


    }
}
