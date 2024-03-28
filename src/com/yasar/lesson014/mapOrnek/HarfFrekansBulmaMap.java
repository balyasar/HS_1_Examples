package com.yasar.lesson014.mapOrnek;

import java.util.HashMap;
import java.util.Map;

public class HarfFrekansBulmaMap {
    /**
     * Dýþarýdan bir kelime alacaðýz.
     * Her bir harfin frekansýný (Yani kelime içinde kaç defa geçtiðini) bulacaðýz.
     * ve bunu bir map içerisinde tutacaðýz.
     */

    public static void main(String[] args) {
        characterMap("Merhaba");
        characterMap2("Merhabaaa");
    }

    public static void characterMap(String ifade) {
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < ifade.length(); i++) {
            if (!characterMap.containsKey(ifade.charAt(i))) {
                characterMap.put(ifade.charAt(i), 1);
            } else {
                int sayac = characterMap.get(ifade.charAt(i));
                characterMap.put(ifade.charAt(i), sayac + 1);
            }
        }
        System.out.println(characterMap);
    }

    public static void characterMap2(String ifade) {
        Map<Character, Integer> characterMap = new HashMap<>();

        for (int i = 0; i < ifade.length(); i++) {
            characterMap.computeIfAbsent(ifade.charAt(i), k -> 0);
            characterMap.computeIfPresent(ifade.charAt(i), (k, v) -> v + 1);
        }
        System.out.println(characterMap);

    }
}
