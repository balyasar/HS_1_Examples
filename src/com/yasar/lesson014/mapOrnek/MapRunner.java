package com.yasar.lesson14.mapOrnek;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class MapRunner {
    /**
     * "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara", "Antalya"
     * bu �ehirleri plaka kodlar� ile mapleyece�iz.
     * plaka kodu girdi�imiz zaman bana �ehir ismi d�nmesini istiyorum.
     * <p>
     * 1 - 06 plakal� �ehrin ismini yazd�ral�m.
     * 2 - 06 mapimizdce bulunuyor mu?
     * 3 - Ankara mapimizde bulunuyor mu?
     */

    public static void main(String[] args) {
        Map<String, String> sehirMap = new HashMap<>();
        sehirMap.put("01", "Adana");
        sehirMap.put("02", "Ad�yaman");
        sehirMap.put("03", "Afyon");
        sehirMap.put("04", "A�r�");
        sehirMap.put("05", "Amasya");
        sehirMap.put("06", "Ankara");
        sehirMap.put("07", "Antalya");


        System.out.println("06 plakal� �ehir  ... : " + sehirMap.get("06"));
        System.out.println("06 plakal� �ehir var m�? ... : " + sehirMap.containsKey("06"));
        System.out.println("Ankara var m�? ... : " + sehirMap.containsValue("Ankara"));

        // 1. YAZDIRMA YONTEM�
        sehirMap.forEach((k, v) -> System.out.println(k + " - " + v));


        // 2. YAZDIRMA YONTEM�
        System.out.println("-------------------------------------");
        for (Map.Entry<String, String> x : sehirMap.entrySet()) {
            System.out.println(x.getKey() + " - " + x.getValue());
        }

        // 3. YAZDIRMA YONTEM�
        System.out.println("-------------------------------------");
        Set<String> keySet = sehirMap.keySet();
        for (String x : keySet) {
            System.out.println(x + " - " + sehirMap.get(x));
        }
    }
}
