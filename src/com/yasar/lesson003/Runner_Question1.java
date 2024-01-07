package com.yasar.lesson003;

import java.util.Scanner;

public class Runner_Question1 {
    public static void main(String[] args) {
        /**
         *  iki tane sayı değişkeni olsun
         *  daha sonra dışarıdan bu sayılara hangi işlem yaptırmak istiyorsam
         *  ona göre bir işlem seçeceğiz (+,-,*,/,)
         *  dışarıdan istediğimiz işlem yapılacak ve bize sonuç değer yazdırılacak.
         */
        System.out.print("Lütfen 1. sayiyi giriniz .... : ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("Lütfen 2. sayiyi giriniz .... : ");
        int s2 = new Scanner(System.in).nextInt();
        System.out.println("""
                Yapmak istediğiniz işlemiş seçiniz
                ( + ) --> Toplama
                ( - ) --> Çıkarma
                ( * ) --> Çarpma
                ( / ) --> Bölme
                """);
        System.out.print("Seçiminiz .... : ");
        String islem = new Scanner(System.in).nextLine();
        switch (islem) {
            case "+":
                System.out.println(s1 + " + " + s2 + " = " + (s1 + s2));
                break;
            case "-":
                System.out.println(s1 + " - " + s2 + " = " + (s1 - s2));
                break;
            case "*":
                System.out.println(s1 + " * " + s2 + " = " + (s1 * s2));
                break;
            case "/":
                double sonuc = s1 / (double) s2;
                System.out.println(s1 + " / " + s2 + " = " + sonuc);
                break;
            default:
                System.out.println("Hatalı Giriş yaptınız. Lütfen tekrar deneyiniz.");
        }
        System.err.println("PROGRAM BİTTİ !!!");
    }
}

