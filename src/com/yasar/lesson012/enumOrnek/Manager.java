package com.yasar.lesson012.enumOrnek;

import java.util.Scanner;

/**
 * bir uygulama metotu yazalým.
 * () => 1 sepete ürün eklensin ( seçili sepetin ürünler listesine geçtiðimiz ürün eklensin.
 * Önce kullanýcýnýn ürünleri listeleyeceðiz. Daha sonra ürünü seçin listeye ekleyeceðiz.
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
            System.out.print("Lütfen bir seçin yapýnýz ... : ");
            secim = Integer.parseInt(scan.nextLine());
            switch (secim) {
                case 1 -> addUrun();
                case 2 -> remove();
                case 3 -> print();
                case 0 -> System.out.println("ÇIKIÞ YAPILIYOR");
                default -> System.out.println("Hatalý giriþ yaptýnýz. Lütfen tekrar deneyiniz.");
            }
        } while (secim != 0);
    }

    public void menu() {
        System.out.println("1 - Sepete Ürün Ekle");
        System.out.println("2 - Ürün Sil");
        System.out.println("3 - Sepeti Göster");
        System.out.println("0 - <<< C I K I S >>>");
    }


    public void addUrun() {
        urunleriListele();
        System.out.print("Lütfen bir ürün seçiniz ... : ");
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
