package com.yasar.lesson002;

import java.util.Scanner;

public class Runner_Question3 {
    public static void main(String[] args) {
        /**
         * telefonkod ve mail kod adında değişkenlerimiz olsun (int) başalngıç değerlerini biz atayabiliriz
         * Daha sonra dışarıdan bir telefon kodu alacağız birde mail için kod alacağız
         *
         * eğer telefon kodu hatalı ise telefon kodu hatalı çıktısını verelim
         * eğer mail kodu hatalı ise mail kodu hatalı çıktısını verelim
         *
         * 2--> Eğer kodlar doğru ise kodların doğru olduğunun çıktısını verelim
         */
        int phoneCode = 654;
        int mailCode = 123;
        System.out.print("Lütfen telefon kodunu giriniz ......... : ");
        int telefonKodu = new Scanner(System.in).nextInt();
        System.out.print("Lütfen mail kodunu giriniz ............ : ");
        int mailKodu = new Scanner(System.in).nextInt();

        if (phoneCode != telefonKodu) {
            System.out.println("Telefon kodu hatalıdır!!!!");
        } else {
            System.out.println("Telefon kodu doğrudur.");
        }
        if (mailCode != mailKodu) {
            System.out.println("Mail kodu hatalıdır!!!!");
        } else {
            System.out.println("Mail kodu doğrudur.");
        }
    }
}
