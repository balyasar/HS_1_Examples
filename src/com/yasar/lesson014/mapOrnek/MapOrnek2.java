package com.yasar.lesson14.mapOrnek;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*

    1- isme kar��l�k not gelecek �ekilde map yap�s� kural�m

2- her ogrecniye kars�l�k notlar� gelcek sekilde bir map olustural�m
3- bu map uzerinden her ogrenciin not ortalamas�n� bulal�m( hesaplad�gm�z sat�rda yazd�ral�m )
 */
public class MapOrnek2 {


    public static void main(String[] args) {

        String[] ogrenciler = {"Mustafa", "Serkan", "Ece"};

        int[] notlar = {60, 80, 78};
        int[][] notlar2 = {{60, 60, 60}, {80, 90, 70}, {48, 78, 63}};
        ogrenciMapOlusturTekBoyutluArrayKullanarak(ogrenciler, notlar);
        Map<String, int[]> ogrenciNotMap = ogrenciMapOlusturCiftBoyutluArrayKullanarak(ogrenciler, notlar2);
        ogrenciNotMap.forEach((k, v) -> System.out.println(k + "=" + Arrays.toString(v)));
        mapYapisindanNotortalamasiHesapla(ogrenciNotMap);
        mapYapisindanNotortalamasiHesapla2(ogrenciNotMap);
        mapYapisindanNotortalamasiHesapla3(ogrenciNotMap);


    }

    public static void mapYapisindanNotortalamasiHesapla(Map<String, int[]> ogrenciNotMap) {

        ogrenciNotMap.forEach((k, v) -> {
            int toplam = 0;
            for (int not : v) {
                toplam += not;
            }
            System.out.println(k + " adl� �grencinin ortalamas�===>" + (toplam / v.length));
        });

    }

    public static void mapYapisindanNotortalamasiHesapla2(Map<String, int[]> ogrenciNotMap) {
        Set<String> keySet = ogrenciNotMap.keySet();//[Mustafa,serkan,ece]
        for (String isim : keySet) {
            int[] notlar = ogrenciNotMap.get(isim);
            int toplam = 0;
            for (int not : notlar) {
                toplam += not;
            }
            System.out.println(isim + " adl� �grencinin ortalamas�===>" + (toplam / notlar.length));
        }
    }

    public static void mapYapisindanNotortalamasiHesapla3(Map<String, int[]> ogrenciNotMap) {
        Set<Map.Entry<String, int[]>> entrySet = ogrenciNotMap.entrySet();
        for (Map.Entry<String, int[]> entry : entrySet) {
            int[] notlar = entry.getValue();
            int toplam = 0;
            for (int not : notlar) {
                toplam += not;
            }
            System.out.println(entry.getKey() + " adl� �grencinin ortalamas�===>" + (toplam / notlar.length));
        }
    }

    public static Map<String, int[]> ogrenciMapOlusturCiftBoyutluArrayKullanarak(String[] ogrenciler, int[][] notlar2) {
        Map<String, int[]> ogrenciNotMap = new LinkedHashMap<>();
        for (int i = 0; i < ogrenciler.length; i++) {
            ogrenciNotMap.put(ogrenciler[i], notlar2[i]);
        }
        return ogrenciNotMap;
    }

    public static void ogrenciMapOlusturTekBoyutluArrayKullanarak(String[] ogrenciler, int[] notlar) {
        Map<String, Integer> ogrenciNotMap = new LinkedHashMap<>();

        for (int i = 0; i < ogrenciler.length; i++) {

            ogrenciNotMap.put(ogrenciler[i], notlar[i]);
        }

        ogrenciNotMap.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
