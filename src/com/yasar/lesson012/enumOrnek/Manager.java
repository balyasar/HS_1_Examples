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
                case 4 -> alisverisiTamamla();
                case 0 -> System.out.println("ÇIKIÞ YAPILIYOR");
                default -> System.out.println("Hatalý giriþ yaptýnýz. Lütfen tekrar deneyiniz.");
            }
        } while (secim != 0);
    }

    public void menu() {
        System.out.println("""
                *****************************
                *********   MENU   **********
                *****************************
                """);
        System.out.println("1 - Sepete Ürün Ekle");
        System.out.println("2 - Ürün Sil");
        System.out.println("3 - Sepeti Göster");
        System.out.println("4 - Alýþverisi Tamamla");
        System.out.println("0 - <<< C I K I S >>>");
    }

    public void addUrun() {
        System.out.println("""
                                
                *****************************
                ******   URUN EKLEME   ******
                *****************************
                """);
        urunleriListele();
        System.out.print("Lütfen bir ürün seçiniz ... : ");
        int index = Integer.parseInt(scan.nextLine());
        EUrun[] urunler = EUrun.values();
        EUrun urun = urunler[index - 1];
        if (urun.getStock() != 0) {
            sepet.getUrunler().add(urun);
            urun.setStock(urun.getStock() - 1);
            sepet.setUrunSayisi(sepet.getUrunSayisi() + 1);
            sepet.setTotal(sepet.getTotal() + urun.getPrice());
        } else {
            System.out.println("Ürünün Stoðu Bitmiþtir.");
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
            System.out.println((urun.ordinal() + 1) + " - Ürün Adý : " + urun.name() + " - Ürün Fiyatý : " + urun.getPrice() + " TRY - Kalan Stok : " + urun.getStock());
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
        System.out.print("Silmek istediðiniz ürünün adýný yazýnýz ... : ");
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
        System.out.println(sepet.getTotal() + " TRY DEÐERÝNDE ÖDEMENÝZ TAMAMLANMIÞTIR.");
        System.out.println("BÝZÝ TERCÝH ETTÝÐÝNÝZ ÝÇÝN TEÞEKKÜRLER.");
        System.out.println("ÝYÝ GÜNLER DÝLERÝZ.");
        sepet = new Sepet();
    }
}
