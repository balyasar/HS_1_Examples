package com.yasar.lesson013.stack;

import java.util.Random;

public class TabakRunner {
    public static void main(String[] args) {
        TabakManager tb = new TabakManager();
        tb.tabakOlustur();
        System.out.println(tb.getKirliTabakStack());
        System.out.println(tb.getTemizTabakStack());

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
        int secim = random.nextInt(1,3);
            tb.secimYap(secim);
        }

    }
}
