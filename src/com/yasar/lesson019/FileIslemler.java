package com.yasar.lesson019;

import java.io.*;
import java.util.Optional;

/**
 * 1 - Dosya Oluþur --> Dýþardan dosya ismini alacak. Eðer ilk defa oluþturuyorsam fileornekler.txt baþarýlý þekilde oluþtu.
 * Eðer daha önce varsa fileornekler.txt daha önce oluþturulmuþtur yazsin.
 */
public class FileIslemler {


    public void menu() {
        System.out.println("    1- Dosya yarat\n" + "    2- Dosya Sil\n" + "    3- Dosya ya veri ekle\n" + "    4- Dosya dan veri oku\n" + "    5- Dosya daki bir harfi baþka bir harf ile deðiþtir");
    }

    public void uygulama() {
        int secim = 0;
        do {
            menu();
            secim = Utility.intDegerAlma("lütfen bir iþlem seciniz");
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
                    break;
//                case 5:
//                    harfDegistir();
//                    break;
                case 0:
                    break;
            }
        } while (secim != 0);


    }

    /**
     * Hangi dosyayý okumak istiyorsak kullanýcýdan dosya adýný alalým.
     * Bu dosyayý okuyup içideki verileri bir String deðere tutalým.
     */
    private String dosyayadanVeriOkuma() {
        String fileName = Utility.stringDegerAlma("Lütfen veri okumak istediðiniz dosya adýný uzantýsý ile birlikte giriniz .... : ");
        File file = new File(FileSabitler.path + fileName);
        BufferedReader bufferedReader = null;
        String tumMetin = "";
        try {
            if (file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                String metin = "";
                while ((metin = bufferedReader.readLine()) != null) {
                    tumMetin += metin+"\n";
                }
            } else {
                System.out.println("Dosya bulunamadý.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tumMetin.substring(0,tumMetin.length()-1);
    }

    /**
     * Veri yazmak istediðiniz dosya ismini kullanýcýdan alalým.
     * Hangi veriyi yazmak istiyorsak onu da kullanýcýdan alýp o dosya içine yazdýralým.
     */
    private void dosyayaVeriYaz() {
        String fileName = Utility.stringDegerAlma("Lütfen veri yazmak istediðiniz dosya adýný uzantýsý ile birlikte giriniz .... : ");
        File file = new File(FileSabitler.path + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (file.exists()) {
                String yazilacakVeri = Utility.stringDegerAlma("Lütfen yazdýrmak istediðiniz veriyi giriniz .... : ");
                bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                bufferedWriter.write(yazilacakVeri);
                bufferedWriter.newLine();
            } else {
                System.out.println("Aradýðýnýz dosya bulunamadý.");
            }
        } catch (IOException e) {
            System.out.println("Bir hata yakalandý .... : " + e.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
        }
    }

    /**
     * Silmek istenen dosya ismi kullanýcýdan alýnsýn. (Uzantýsý ile birlikte alalým.)
     * Eðer dosya varsa silme iþlemindn sonra baþarýlý bir þekilde silindi. Dosya yoksa bulunamadý yazsýn.
     */
    private void dosyaSil() {
        String fileName = Utility.stringDegerAlma("Lütfen silmek istediðiniz dosyanýn ismini ve uzantýsýný giriniz ... : ");
        File file = new File(FileSabitler.path + fileName);
        if (file.delete()) {
            System.out.println(fileName + " baþarýlý þekilde silindi.");
        } else {
            System.out.println("Dosya ismi bulunamadý.");
        }
    }

    public void dosyaOlustur() {
        String fileName = Utility.stringDegerAlma("Lütfen bir dosya adini ve uzantýsýný giriniz .... : ");
        File file = new File((FileSabitler.path + fileName));
        try {
            if (file.createNewFile()) {
                System.out.println(file.getAbsolutePath() + " baþarýlý þekilde oluþturulmuþtur.");
            } else {
                System.out.println(fileName + " dosya ismi zaten mevcut");
            }
        } catch (IOException e) {
            System.out.println("Bir hata yakalandý .... : " + e.getMessage());
        }
    }
}
