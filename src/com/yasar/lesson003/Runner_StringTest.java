package com.yasar.lesson003;

public class Runner_StringTest {
    public static void main(String[] args) {
        String value1 = "Merhaba Dünya";
        String value2 = " Merhaba Dünya ";
        String value3 = "Merhaba Dünya";
        String value4 = new String("Merhaba Dünya");
        String value5 = " ";
        String value6 = "";

        System.out.println(value1.concat(value2)); // 2 String ifadeyi birleştirir.
        System.out.println(value2);
        System.out.println(value2.trim()); // Stringte bulunan baştaki ve sondaki boşluğu kaldırır.
        System.out.println(value1.contains("M")); // metin içerisindeki bir değerin geçip geçmediğini kontrol eder.
        System.out.println(value1.contains("m"));
        System.out.println(value1.contains("Dü"));
        System.out.println(value1.charAt(3));
        System.out.println(value1.charAt(0));
        char deger = value1.charAt(2);
        System.out.println(deger);
        System.out.println(value1.indexOf("a")); // Girilen karakterin string değerinde ilk kaçıncı indekste geçtiğini bulur.
        System.out.println(value1.lastIndexOf("a")); // Girilen karakterin string değerinde en son kaçıncı indekste geçtiğini bulur.
        System.out.println(value1.lastIndexOf("x"));
        System.out.println(value1.startsWith("Mer"));
        System.out.println(value1.startsWith("M"));
        System.out.println(value1.startsWith("Merr"));
        System.out.println(value1.endsWith("nya"));
        System.out.println(value1.length());
        System.out.println(value1.replace("a", "A"));
        System.out.println(value1);
        System.out.println(value1.substring(0, 5));
        System.out.println(value1.substring(5, 7));
        System.out.println(value1.substring(3));
        System.out.println(value1.toLowerCase());
        System.out.println(value1.toUpperCase());
        System.out.println(value5.isEmpty());
        System.out.println(value6.isEmpty());
        System.out.println(value5.isBlank());
        System.out.println(value6.isBlank());
        String[] dizi = value1.split(" ");
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        String[] dizi2 = value1.split("a");
        System.out.println(dizi2[0]);
        System.out.println(dizi2[1]);
        System.out.println(dizi2[2]);
        System.out.println("----------------------------------------------------------");
        // Donusumler
        int sayi = 9;
        String value9 = String.valueOf(sayi);
        System.out.println(value9.equalsIgnoreCase("9"));
        //Bir stringi sayıya çevirme
        int sayi2 = Integer.parseInt(value9);
        System.out.println("sayi2 ... : " + sayi2);
        boolean karar = false;
        String value10 = String.valueOf(karar);
        System.out.println(value10.toUpperCase());

    }
}
