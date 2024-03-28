package com.yasar.lesson019;

import java.io.*;

/*
 1- dosya olustur==> dÄ±sarÄ±dan dosya ismini alacak  eger ilk defa olsuturyorsam  fileornekler.txt basrÄ±lÄ± sekilde olustu
  eger daha once varsa   fileornekler.txt daha once olusturulmustur.
 */
public class FileIslemler {


    public void menu() {
        System.out.println(" " +
                "    1- Dosya yarat\n" +
                "    2- Dosya Sil\n" +
                "    3- Dosya ya veri ekle\n" +
                "    4- Dosya dan veri oku\n" +
                "    5- Dosya daki bir harfi baÅŸka bir harf ile deÄŸiÅŸtir");
    }

    public void uygulama() {
        int secim = 0;
        do {
            menu();
            secim = Utility.intDegerAlma("lÃ¼tfen bir iÅŸlem seciniz");
            switch (secim) {
                case 1:
                    dosyaOlustur();
                    break;
                case 2:
                    dosyaSil();
                    break;
                case 3:
                    dosyayaVeriYaz();
                    break;
                case 4:
                    System.out.println(dosyayadanVeriOkuma());
                    // System.out.println(dosyayadanVeriOkuma().length());
                    ;
                    break;
                case 5:
                    //   harfDegistir();
                    break;
                case 0:
                    break;
            }
        } while (secim != 0);


    }

    /*
        hangi dosyayÄ± okumak istiyorsa kullanÄ±cdan dosya ismini alalÄ±m
        bu dosyayÄ± okuyup iÃ§indeki verileri bir String degerde tutalÄ±m

     */

    public String dosyayadanVeriOkuma() {
        String fileName = Utility.stringDegerAlma("LÃ¼tfen Dosya AdÄ±nÄ± dosya uzantÄ±sÄ± ile beraber giriniz");
        File dosya = new File(FileSabitler.path + fileName);
        String tumMetin = "";

        BufferedReader bufferedReader = null;
        try {
            if (dosya.exists()) {
                System.out.println("Dosya Bulundu");
                bufferedReader = new BufferedReader(new FileReader(dosya));
                String metin = "";
                while ((metin = bufferedReader.readLine()) != null) {
                    tumMetin += metin + "\n";
                }
            } else {
                System.out.println("Dosya BulunamadÄ±");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return tumMetin.substring(0, tumMetin.length() - 1);
    }


    /*
        veri yazmak istediÄŸimiz dosya ismini kullanÄ±cadan alalÄ±m daha sonra
        hangi veriyi yazmak istiyortsak onuda kullanÄ±cadan alÄ±p o dosya iÃ§ine yazdÄ±ralÄ±m
     */

    public void dosyayaVeriYaz() {
        String fileName = Utility.stringDegerAlma("LÃ¼tfen Dosya AdÄ±nÄ± dosya uzantÄ±sÄ± ile beraber giriniz");
        File dosya = new File(FileSabitler.path + fileName);
        BufferedWriter writer = null;
        try {
            if (dosya.exists()) {
                System.out.println("Dosya bulundur");
                String metin = Utility.stringDegerAlma("Yazmak istediÄŸiniz metni giriniz.");
                writer = new BufferedWriter(new FileWriter(dosya, true));
                writer.write(metin);
                writer.newLine();
            } else
                System.out.println("AradÄ±ÄŸÄ±nÄ±z dosya bulunamamÄ±ÅŸtÄ±r.");
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluÅŸtu.");

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    /*
     silmek istenen dosya ismi kullanÄ±cÄ±dan alÄ±nsÄ±n (uzantÄ±sÄ± ile beraber alalÄ±m   filedeneme1.txt)
     eger dosya varsa  silme iÅŸleminden sonra basarÄ±lÄ± bir ÅŸekilde silindi cÄ±kstÄ±Ä±nÄ± verelim
     dosya yoksa dosya bulunamadÄ± ()
     */
    public void dosyaSil() {
        String fileName = Utility.stringDegerAlma("Lutfen silmek istediginiz dosya adinÄ± uzantÄ±sÄ± ile beraber giriniz!");
        File dosya = new File(FileSabitler.path + fileName);
        if (dosya.delete()) {
            System.out.println("DOSYA BASARILI SEKILDE SILINDI");
        } else {
            System.out.println("DOSYA BULUNAMADI");
        }
    }

    public void dosyaOlustur() {
        String fileName = Utility.stringDegerAlma("Lutfen bir dosya adinÄ± uzantÄ±sÄ± ile beraber giriniz!");
        File dosya = new File(FileSabitler.path + fileName);
        try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getAbsolutePath() + " adlÄ± Dosya basarili bir sekilde olusturuldu!");
            } else {
                System.out.println(dosya.getAbsolutePath() + " adlÄ± Dosya daha onceden olusturulmustur!");

            }
        } catch (IOException e) {
            System.out.println("bir hata meydana geldi:" + e.getMessage());
        }

    }
}
