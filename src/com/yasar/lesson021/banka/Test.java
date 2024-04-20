package com.yasar.lesson021.banka;

/**
 * 2 adet thread oluþturup çalýþtýralým
 * 1. thread 1000 kere çalýþsýn her defasýnda ayný miktar parayý hesaba yatýrsýn. (100)
 * 2. thread 1000 kere çalýþsýn her defasýnda ayný miktar parayý hesaptan çeksin. (100)
 * en sonunda hesaptý miktarý görüntüleelim.
 */
public class Test {
    public static void main(String[] args) {
        Hesap hesap = new Hesap();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hesap.paraCek(100);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hesap.paraYatir(100);
            }
        }).start();
    }
}
