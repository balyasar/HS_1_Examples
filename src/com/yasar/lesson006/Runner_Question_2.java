package com.yasar.lesson006;

public class Runner_Question_2 {
    public static void main(String[] args) {
        /**
         * Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazsın ve döngü sonlansın yoksa false yazdıralım.
         */
        int[] sayilar = {2, -256, 16, 1258, 25, 2};
        kontrol(sayilar);
    }

    public static void kontrol(int[] ints) {
        boolean isSame = false;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == 2 && ints[i + 1] == 2) {
                isSame = true;
                System.out.println(isSame);
                break;
            }
        }
        System.out.println(isSame);
    }
}
