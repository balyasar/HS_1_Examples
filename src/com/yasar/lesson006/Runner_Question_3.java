package com.yasar.lesson006;

public class Runner_Question_3 {

    public static void main(String[] args) {
        /**
         * Adana adlı şehrin plaka kodu : 01
         * Adıyaman adlı şehrin plaka kodu : 02
         */

        String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

        sehirPlakalari(sehirler);



    }

    public static void sehirPlakalari(String string) {
        String[] sehirler = string.split(";");
        String sehirIsmi = "";
        String plakaNo = "";

        for (int i = 0; i < sehirler.length; i++) {
        int index = sehirler[i].indexOf("-");
            sehirIsmi = sehirler[i].substring(index+1);
            plakaNo = sehirler[i].substring(0,index);
            System.out.println(sehirIsmi + " adlı şehrin plaka kodu : " + plakaNo);
        }
    }

}

