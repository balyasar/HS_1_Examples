package com.yasar.lesson005;

import java.util.Scanner;

public class Runner_Question_2_1 {

    public static void main(String[] args) {
        //      int boyut =diziBoyutuBelirle();
        //      int [] dizi=diziOlustur(boyut);
        //      diziDoldurma(dizi);
        //      diziYazdir(dizi);

        diziYazdir(diziDoldurma2(diziOlustur(diziBoyutuBelirle())));

    }

    public static void diziDoldurma(int[] sayilar) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("lütfen " + (i + 1) + ". sayiyi giriniz ");
            int sayi = scanner.nextInt();
            sayilar[i] = sayi;
        }
    }

    public static int[] diziDoldurma2(int[] sayilar) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("lütfen " + (i + 1) + ". sayiyi giriniz ");
            int sayi = scanner.nextInt();
            sayilar[i] = sayi;
        }
        return sayilar;
    }

    public static int[] diziOlustur() {
        int[] dizi = new int[diziBoyutuBelirle()];
        System.out.println(dizi.length + " boyutlu dizi olusturuldu");
        return dizi;
    }

    public static int[] diziOlustur(int boyut) {
        int[] dizi = new int[boyut];
        System.out.println(boyut + " boyutlu dizi olusturuldu");
        return dizi;
    }

    public static int diziBoyutuBelirle() {
        System.out.println("Bir dizi boyutu giriniz");
        int uzunluk = new Scanner(System.in).nextInt();
        return uzunluk;
    }

    public static void diziYazdir(int[] dizi) {
        System.out.println("===Sayılar dizimiz===");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}

