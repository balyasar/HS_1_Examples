package com.yasar.lesson14.mapOrnek;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class MapRunner {
    /**
     * "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya"
     * bu þehirleri plaka kodlarý ile mapleyeceðiz.
     * plaka kodu girdiðimiz zaman bana þehir ismi dönmesini istiyorum.
     * <p>
     * 1 - 06 plakalý þehrin ismini yazdýralým.
     * 2 - 06 mapimizdce bulunuyor mu?
     * 3 - Ankara mapimizde bulunuyor mu?
     */

    public static void main(String[] args) {
        Map<String, String> sehirMap = new HashMap<>();
        sehirMap.put("01", "Adana");
        sehirMap.put("02", "Adýyaman");
        sehirMap.put("03", "Afyon");
        sehirMap.put("04", "Aðrý");
        sehirMap.put("05", "Amasya");
        sehirMap.put("06", "Ankara");
        sehirMap.put("07", "Antalya");


        System.out.println("06 plakalý þehir  ... : " + sehirMap.get("06"));
        System.out.println("06 plakalý þehir var mý? ... : " + sehirMap.containsKey("06"));
        System.out.println("Ankara var mý? ... : " + sehirMap.containsValue("Ankara"));

        // 1. YAZDIRMA YONTEMÝ
        sehirMap.forEach((k, v) -> System.out.println(k + " - " + v));


        // 2. YAZDIRMA YONTEMÝ
        System.out.println("-------------------------------------");
        for (Map.Entry<String, String> x : sehirMap.entrySet()) {
            System.out.println(x.getKey() + " - " + x.getValue());
        }

        // 3. YAZDIRMA YONTEMÝ
        System.out.println("-------------------------------------");
        Set<String> keySet = sehirMap.keySet();
        for (String x : keySet) {
            System.out.println(x + " - " + sehirMap.get(x));
        }
    }
}
