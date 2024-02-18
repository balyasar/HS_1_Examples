package com.yasar.lesson012.enumOrnek;

import java.util.Scanner;

/**
 * bir uygulama metotu yazal�m.
 * () => 1 sepete �r�n eklensin ( se�ili sepetin �r�nler listesine ge�ti�imiz �r�n eklensin.
 * �nce kullan�c�n�n �r�nleri listeleyece�iz. Daha sonra �r�n� se�in listeye ekleyece�iz.
 */
public class Manager {
    Scanner scan = new Scanner(System.in);
    private Sepet sepet;

    public Manager(Sepet sepet) {
        this.sepet = new Sepet();
    }

    public void uygulama() {
        int secim;
        do {
            menu();
            System.out.print("L�tfen bir se�in yap�n�z ... : ");
            secim = Integer.parseInt(scan.nextLine());
            switch (secim) {
                case 1 -> addUrun();
                case 2 -> remove();
                case 3 -> print();
                case 0 -> System.out.println("�IKI� YAPILIYOR");
                default -> System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz.");
            }
        } while (secim != 0);
    }

    public void menu() {
        System.out.println("1 - Sepete �r�n Ekle");
        System.out.println("2 - �r�n Sil");
        System.out.println("3 - Sepeti G�ster");
        System.out.println("0 - <<< C I K I S >>>");
    }


    public void addUrun() {
        urunleriListele();
        System.out.print("L�tfen bir �r�n se�iniz ... : ");
        int index = Integer.parseInt(scan.nextLine());
        EUrun[] urunler = EUrun.values();
        EUrun urun = urunler[index - 1];
        sepet.getUrunler().add(urun);

    }

    public void urunleriListele() {
        /**
         *  1 - Cola
         *  2 - Cips
         *  ...
         */
        EUrun[] urunler = EUrun.values();
        for (EUrun urun : urunler) {
            System.out.println((urun.ordinal() + 1) + " - " + urun.name());
        }
    }

    public void remove() {
    }

    public void print() {
        sepet.getUrunler().forEach(System.out::println);
    }
}
