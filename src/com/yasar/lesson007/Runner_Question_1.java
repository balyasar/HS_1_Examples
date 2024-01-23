package com.yasar.lesson007;

import java.util.Arrays;

public class Runner_Question_1 {
    public static void main(String[] args) {
        /**
         Bir tane Sınav sınıfı olusturalım
         ve özellik ve metot ekleyelim

         */
        Sinav matSinavi = new Sinav();
        matSinavi.sinavAdi = "Matematik";
        matSinavi.tarih = "Pazar";
        matSinavi.ogrenciSayisi = 10;
        matSinavi.tur = "Test";
        matSinavi.sinavSorumlusu = "Mustafa";
        matSinavi.gecmeNotu = 80;
        matSinavi.gecmeNotuAta(65);
        matSinavi.sinavTarihiBelirle("Pazartesi");
        System.out.println(matSinavi.gecmeNotu);
        System.out.println(matSinavi.sinavSorumlusu);
        System.out.println(matSinavi.tarih);
        System.out.println(Arrays.toString(matSinavi.sorular));
        matSinavi.soruOlustur();
        System.out.println(Arrays.toString(matSinavi.sorular));

    }
}
