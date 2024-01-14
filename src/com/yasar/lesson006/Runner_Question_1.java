package com.yasar.lesson006;

public class Runner_Question_1 {
    /**
     * dizi içerisinde 1 ve 4ün adedini bulalım.
     * Eğer 1 sayısı 4 sayısından fazla ise true değil ise false
     */
    public static void main(String[] args) {
        int[] sayilar = {1, 4, 4, 1, 5, 6, 4, 4, 1, 8};
        sayiBul(sayilar);
    }

    public static void sayiBul(int[] sayilar) {
        int s1 = 0, s2 = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == 4) {
                s2++;
            } else if (sayilar[i] == 1) {
                s1++;
            }
        }
        System.out.println(isBig(s1,s2));

    }

    public static boolean isBig(int s1, int s2) {
        if (s1 > s2) {
            return true;
        }
        return false;
    }
}
