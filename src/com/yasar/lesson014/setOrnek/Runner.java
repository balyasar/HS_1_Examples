package com.yasar.lesson014.setOrnek;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Bir set yap�s� olu�tural�m ve bu setin i�ine bir film kategorileri olu�tural�m.
         *
         * 1 - Kategori ekle diye metot yazal�m.
         * Bu metoda gelen veriyi sete eklemeye �al��al�m.
         * E�er eklendiyse Ba�ar�l� �ekilde eklendi yazs�n.
         * E�er ekleyememi� isek Daha �nceden eklenmi� yazs�n.
         */

        Runner runner = new Runner();
        for (int i = 0; i < 5; i++) {
            runner.kategoriEkle();
        }
        runner.yazdir();


    }

    public void kategoriEkle() {
        System.out.print("L�tfen bir film kategorisi giriniz.... : ");
        String kategori = new Scanner(System.in).nextLine();
        if (filmKategorisi.add(kategori)) {
            System.out.println("Film kategorisi ba�ar�yla eklendi.");
        } else {
            System.out.println("Film kategorisi zaten mevcut.");
        }
    }

    public void yazdir() {
        filmKategorisi.forEach(System.out::println);
    }

    public Set<String> filmKategorisi = new TreeSet<>();
}
