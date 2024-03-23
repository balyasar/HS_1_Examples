package com.yasar.lesson014.setOrnek;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Bir set yapýsý oluþturalým ve bu setin içine bir film kategorileri oluþturalým.
         *
         * 1 - Kategori ekle diye metot yazalým.
         * Bu metoda gelen veriyi sete eklemeye çalýþalým.
         * Eðer eklendiyse Baþarýlý þekilde eklendi yazsýn.
         * Eðer ekleyememiþ isek Daha önceden eklenmiþ yazsýn.
         */

        Runner runner = new Runner();
        for (int i = 0; i < 5; i++) {
            runner.kategoriEkle();
        }
        runner.yazdir();


    }

    public void kategoriEkle() {
        System.out.print("Lütfen bir film kategorisi giriniz.... : ");
        String kategori = new Scanner(System.in).nextLine();
        if (filmKategorisi.add(kategori)) {
            System.out.println("Film kategorisi baþarýyla eklendi.");
        } else {
            System.out.println("Film kategorisi zaten mevcut.");
        }
    }

    public void yazdir() {
        filmKategorisi.forEach(System.out::println);
    }

    public Set<String> filmKategorisi = new TreeSet<>();
}
