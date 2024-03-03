package com.yasar.lesson14.setOrnek;

import java.util.HashSet;
import java.util.Set;

public class KullaniciRunner {
    public static void main(String[] args) {
        Set<Kullanici> kullaniciSet = new HashSet<>(Set.of(
                new Kullanici(1, "yasar"),
                new Kullanici(2, "kübra"),
                new Kullanici(3, "toprak")
        ));

        Kullanici kullanici1 = new Kullanici(2, "ahmet");
        Kullanici kullanici2 = new Kullanici(2, "ahmet");
        System.out.println("Kullanýcý 1 -->: " + kullanici1.hashCode());
        System.out.println("Kullanýcý 2 -->: " + kullanici2.hashCode());

        kullaniciSet.add(new Kullanici(2, "ahmet"));
        kullaniciSet.add(new Kullanici(2, "ahmet"));
        kullaniciSet.forEach(System.out::println);
    }
}
