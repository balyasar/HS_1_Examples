package com.yasar.lesson012.enumOrnek;

public class Test {
    public static void main(String[] args) {
        /**
         * Bir sepetim olsun
         * Sepetimde �r�nlerim olacak.
         * Fakat �r�nler uygulama aya�a kalkt�ktan sonra de�i�meyecek.
         * Uygulama boyunca yeni �r�n ekleme olmaacak ugulamada ba�ta olan �r�nleri kullanaca��m.
         * Buna g�re �r�nleri ve sepeti soyunplay�p olu�tural�m ( Sepete �r�n eklenebilecek, �r�nler g�r�nt�lenebilecek)
         *
         */

        /**
         *
         *  1 - �r�n Silme --> �r�n ismi ile ilk buldu�u indexteki de�eri silebilir.
         *  2 - Sepeti g�ster dedi�inde sepetin toplam fiyat�n� g�stersin. ( �r�nlerimizin ba�lang�� fiyatlar� olsun.
         *  Daha sonra sepetimizdeki �r�nlerin fiyatlar�n� toplay�p yazd�r�n.)
         *  3 - alisverisiTamamla() --> Al��veri� tamamlanacak ve sepet yenilenecek.
         *
         *
         */
        Sepet sepet = new Sepet();
        Manager manager = new Manager(sepet);
        manager.uygulama();
    }
}
