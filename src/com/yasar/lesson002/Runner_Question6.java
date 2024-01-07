package com.yasar.lesson002;

import java.util.Scanner;

public class Runner_Question6 {
    public static void main(String[] args) {
        /**
         * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz.
         * 0 girildiğidne sayıların toplamını ve ortalamasını yazdıran kod
         */

        int total = 0;
        int s1;
        int counter = 0;
        while (true) { // boolean kontrol = true;
            System.out.print("Lütfen bir sayı giriniz ........ : ");
            s1 = new Scanner(System.in).nextInt();
            if (s1 == 0) break; // kontrol = false;
            else {
                total += s1;
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Sadece 0 girildi");
        } else {
            double ortalama = total / (double) (counter);
            System.out.println("Girilen Sayilarin Toplami....... : " + total + "\n" +
                    "Ortalama ....................... : " + ortalama);
        }
    }
}
