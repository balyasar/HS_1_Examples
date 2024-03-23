package com.yasar.lesson019;

import java.io.*;
import java.util.Optional;

/**
 * 1 - Dosya Olu�ur --> D��ardan dosya ismini alacak. E�er ilk defa olu�turuyorsam fileornekler.txt ba�ar�l� �ekilde olu�tu.
 * E�er daha �nce varsa fileornekler.txt daha �nce olu�turulmu�tur yazsin.
 */
public class FileIslemler {


    public void menu() {
        System.out.println("    1- Dosya yarat\n" + "    2- Dosya Sil\n" + "    3- Dosya ya veri ekle\n" + "    4- Dosya dan veri oku\n" + "    5- Dosya daki bir harfi ba�ka bir harf ile de�i�tir");
    }

    public void uygulama() {
        int secim = 0;
        do {
            menu();
            secim = Utility.intDegerAlma("l�tfen bir i�lem seciniz");
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
     * Hangi dosyay� okumak istiyorsak kullan�c�dan dosya ad�n� alal�m.
     * Bu dosyay� okuyup i�ideki verileri bir String de�ere tutal�m.
     */
    private String dosyayadanVeriOkuma() {
        String fileName = Utility.stringDegerAlma("L�tfen veri okumak istedi�iniz dosya ad�n� uzant�s� ile birlikte giriniz .... : ");
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
                System.out.println("Dosya bulunamad�.");
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
     * Veri yazmak istedi�iniz dosya ismini kullan�c�dan alal�m.
     * Hangi veriyi yazmak istiyorsak onu da kullan�c�dan al�p o dosya i�ine yazd�ral�m.
     */
    private void dosyayaVeriYaz() {
        String fileName = Utility.stringDegerAlma("L�tfen veri yazmak istedi�iniz dosya ad�n� uzant�s� ile birlikte giriniz .... : ");
        File file = new File(FileSabitler.path + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (file.exists()) {
                String yazilacakVeri = Utility.stringDegerAlma("L�tfen yazd�rmak istedi�iniz veriyi giriniz .... : ");
                bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                bufferedWriter.write(yazilacakVeri);
                bufferedWriter.newLine();
            } else {
                System.out.println("Arad���n�z dosya bulunamad�.");
            }
        } catch (IOException e) {
            System.out.println("Bir hata yakaland� .... : " + e.getMessage());
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
     * Silmek istenen dosya ismi kullan�c�dan al�ns�n. (Uzant�s� ile birlikte alal�m.)
     * E�er dosya varsa silme i�lemindn sonra ba�ar�l� bir �ekilde silindi. Dosya yoksa bulunamad� yazs�n.
     */
    private void dosyaSil() {
        String fileName = Utility.stringDegerAlma("L�tfen silmek istedi�iniz dosyan�n ismini ve uzant�s�n� giriniz ... : ");
        File file = new File(FileSabitler.path + fileName);
        if (file.delete()) {
            System.out.println(fileName + " ba�ar�l� �ekilde silindi.");
        } else {
            System.out.println("Dosya ismi bulunamad�.");
        }
    }

    public void dosyaOlustur() {
        String fileName = Utility.stringDegerAlma("L�tfen bir dosya adini ve uzant�s�n� giriniz .... : ");
        File file = new File((FileSabitler.path + fileName));
        try {
            if (file.createNewFile()) {
                System.out.println(file.getAbsolutePath() + " ba�ar�l� �ekilde olu�turulmu�tur.");
            } else {
                System.out.println(fileName + " dosya ismi zaten mevcut");
            }
        } catch (IOException e) {
            System.out.println("Bir hata yakaland� .... : " + e.getMessage());
        }
    }
}
