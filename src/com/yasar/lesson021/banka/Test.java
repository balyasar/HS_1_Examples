package com.yasar.lesson021.banka;

/**
 * 2 adet thread olu�turup �al��t�ral�m
 * 1. thread 1000 kere �al��s�n her defas�nda ayn� miktar paray� hesaba yat�rs�n. (100)
 * 2. thread 1000 kere �al��s�n her defas�nda ayn� miktar paray� hesaptan �eksin. (100)
 * en sonunda hesapt� miktar� g�r�nt�leelim.
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
