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
                case 4 -> alisverisiTamamla();
                case 0 -> System.out.println("�IKI� YAPILIYOR");
                default -> System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz.");
            }
        } while (secim != 0);
    }

    public void menu() {
        System.out.println("""
                *****************************
                *********   MENU   **********
                *****************************
                """);
        System.out.println("1 - Sepete �r�n Ekle");
        System.out.println("2 - �r�n Sil");
        System.out.println("3 - Sepeti G�ster");
        System.out.println("4 - Al��verisi Tamamla");
        System.out.println("0 - <<< C I K I S >>>");
    }

    public void addUrun() {
        System.out.println("""
                                
                *****************************
                ******   URUN EKLEME   ******
                *****************************
                """);
        urunleriListele();
        System.out.print("L�tfen bir �r�n se�iniz ... : ");
        int index = Integer.parseInt(scan.nextLine());
        EUrun[] urunler = EUrun.values();
        EUrun urun = urunler[index - 1];
        if (urun.getStock() != 0) {
            sepet.getUrunler().add(urun);
            urun.setStock(urun.getStock() - 1);
            sepet.setUrunSayisi(sepet.getUrunSayisi() + 1);
            sepet.setTotal(sepet.getTotal() + urun.getPrice());
        } else {
            System.out.println("�r�n�n Sto�u Bitmi�tir.");
        }
    }

    public void urunleriListele() {
        /**
         *  1 - Cola
         *  2 - Cips
         *  ...
         */
        EUrun[] urunler = EUrun.values();
        for (EUrun urun : urunler) {
            System.out.println((urun.ordinal() + 1) + " - �r�n Ad� : " + urun.name() + " - �r�n Fiyat� : " + urun.getPrice() + " TRY - Kalan Stok : " + urun.getStock());
        }
    }

    public void remove() {
        int count = 0;
        print();
        System.out.println("""
                                
                *****************************
                ******   URUN SILME   *******
                *****************************
                """);
        System.out.print("Silmek istedi�iniz �r�n�n ad�n� yaz�n�z ... : ");
        String name = scan.nextLine().toUpperCase();
        EUrun urun = EUrun.valueOf(name);
        for (int i = 0; i < sepet.getUrunSayisi(); i++) {
            if (sepet.getUrunler().remove(urun)) {
                count++;
            }
        }
        sepet.setUrunSayisi(sepet.getUrunSayisi() - count);
        sepet.setTotal(sepet.getTotal() - (urun.getPrice() * count));
        urun.setStock(urun.getStock() + count);
    }

    public void print() {
        System.out.println("---------------------------------");
        for (int i = 0; i < sepet.getUrunSayisi(); i++) {
            System.out.println((i + 1) + " - " + sepet.getUrunler().get(i));
        }
        System.out.println("TOPLAM TUTAR ..... : " + sepet.getTotal() + " TRY");
        System.out.println("---------------------------------");

    }

    public void alisverisiTamamla() {
        System.out.println(sepet.getTotal() + " TRY DE�ER�NDE �DEMEN�Z TAMAMLANMI�TIR.");
        System.out.println("B�Z� TERC�H ETT���N�Z ���N TE�EKK�RLER.");
        System.out.println("�Y� G�NLER D�LER�Z.");
        sepet = new Sepet();
    }
}
