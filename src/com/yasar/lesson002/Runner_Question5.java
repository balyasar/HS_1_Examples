package com.yasar.lesson002;

import java.util.Scanner;

public class Runner_Question5 {
    public static void main(String[] args) {
        /**
         * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz.
         * 0 girildiğidne sayıların toplamını ve ortalamasını yazdıran kod
         */
        int total = 0;
        int s1;
        int counter = 0;
        do {
            System.out.print("Lütfen bir sayı giriniz ........ : ");
            s1 = new Scanner(System.in).nextInt();
            total += s1;
            counter++;
        } while (s1 != 0);
        if (counter == 1) {
            System.out.println("Sadece 0 girildi");
        } else {
            double ortalama = total / (double) (counter - 1);
            System.out.println("Girilen Sayilarin Toplami....... : " + total + "\n" +
                    "Ortalama ....................... : " + ortalama);
        }
    }
}
