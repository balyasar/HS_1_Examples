package com.yasar.lesson012.enumOrnek;

public class Test {
    public static void main(String[] args) {
        /**
         * Bir sepetim olsun
         * Sepetimde ürünlerim olacak.
         * Fakat ürünler uygulama ayağa kalktıktan sonra değişmeyecek.
         * Uygulama boyunca yeni ürün ekleme olmaacak ugulamada başta olan ürünleri kullanacağım.
         * Buna göre ürünleri ve sepeti soyunplayıp oluşturalım ( Sepete ürün eklenebilecek, ürünler görüntülenebilecek)
         *
         */

        /**
         *
         *  1 - Ürün Silme --> Ürün ismi ile ilk bulduğu indexteki değeri silebilir.
         *  2 - Sepeti göster dediğinde sepetin toplam fiyatını göstersin. ( Ürünlerimizin başlangıç fiyatları olsun.
         *  Daha sonra sepetimizdeki ürünlerin fiyatlarını toplayıp yazdırın.)
         *  3 - alisverisiTamamla() --> Alışveriş tamamlanacak ve sepet yenilenecek.
         *
         *
         */
        Sepet sepet = new Sepet();
        Manager manager = new Manager(sepet);
        manager.uygulama();
    }
}
