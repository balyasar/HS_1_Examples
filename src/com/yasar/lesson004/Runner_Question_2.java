package com.yasar.lesson004;

public class Runner_Question_2 {
    public static void main(String[] args) {
        /**
         * value değişkenini karakterlerinin sayısal değerleri toplamını bulunuz.
         */
        String value = "1234";
        char newValue;
        int total = 0, total2 = 0;

        for (int i = 0; i < value.length(); i++) {
            newValue = value.charAt(i);
            String value2 = String.valueOf(newValue);
            int sayi = Integer.parseInt(value2);
            total += sayi;
            //2. çözüm
            int sayi2 = Character.getNumericValue(newValue);
            total2 += sayi2;
        }
        System.out.println("Sayiların toplamı ....... : " + total);
        System.out.println("Sayiların(2) toplamı ....... : " + total2);

        /**
         * String değerinin karakterleri rakam ise toplayalım ve toplam 3'e ekleyelim.
         * Değilse bir string değerde toplayalım program sonunda bu ikisini yazdıralım.
         */

        int toplam3 = 0;
        int toplam4 = 0;
        value = "123xyz451";
        String karakterler = "";
        String karakterler2 = "";

        for (int i = 0; i < value.length(); i++) {
            char karakter = value.charAt(i);
            if (karakter >= 48 && karakter <= 57) {
                int sayi = Character.getNumericValue(karakter);
                toplam3 += sayi;
            } else {
                karakterler += karakter;
            }
        }

        //2.çözüm
        for (int i = 0; i < value.length(); i++) {
            char karakter = value.charAt(i);
            if (Character.isDigit(karakter)) {
                int sayi = Character.getNumericValue(karakter);
                toplam4 += sayi;
            } else {
                karakterler2 += karakter;
            }
        }

        System.out.println("Value içindeki rakamlar toplamı .... : " + toplam3);
        System.out.println("Value içindeki harfler ............. : " + karakterler);
        System.out.println("Value içindeki rakamlar toplamı .... : " + toplam4);
        System.out.println("Value içindeki harfler ............. : " + karakterler2);
    }
}
