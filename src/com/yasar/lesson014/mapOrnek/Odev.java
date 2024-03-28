package com.yasar.lesson14.mapOrnek;

import java.util.Map;
import java.util.TreeMap;

public class Odev {

        /*

    dýþarýdan girilen kelimdeli turkce karakteri ingilizce karaktere cevirceðiz

    bunu yaparken arraylerden bir map olusturp o mapi kullanlým

 */

    static char[] turkishWords = {'Ý', 'ý', 'þ', 'Þ', 'ç', 'Ç', 'ð', 'Ð', 'ü', 'Ü', 'ö', 'Ö'};
    static char[] englishWords = {'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

    static Map<Character, Character> characterMap = new TreeMap<>();

    public static void mapOlustur() {
        for (int i = 0; i < turkishWords.length; i++) {
            characterMap.put(turkishWords[i], englishWords[i]);
        }
    }

    public static String harfDegistir(String ifade) {

        for (int i = 0; i < ifade.length(); i++) {
            Character key = ifade.charAt(i);
            if (characterMap.containsKey(key)) {
                Character value = characterMap.get(key);
                ifade = ifade.replace(key, value);
            }
        }
        return ifade;
    }

    public static void main(String[] args) {
        mapOlustur();
        System.out.println(harfDegistir("Çekiþiyor"));
    }
}
