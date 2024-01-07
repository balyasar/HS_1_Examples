package com.yasar.lesson002;

import java.util.Scanner;

public class Runner_Question1 {
    public static void main(String[] args) {
        /**
         * dışarıdan bir taban değeri ve üs değeri alalım. sonucu bulup ekrana yazdıran program
         */
        int sonuc = 1;
        System.out.print("Bir taban değeri giriniz ..... : ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("Bir üs değeri giriniz ........ : ");
        int s2 = new Scanner(System.in).nextInt();
        for (int i = 1; i <= s2; i++) {
            sonuc *= s1;
        }
        System.out.println("Çarpım sonucu ................ : " + sonuc);

    }
}
