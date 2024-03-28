package com.yasar.lesson14.mapOrnek;

import java.util.Map;
import java.util.TreeMap;

public class Odev {

        /*

    d��ar�dan girilen kelimdeli turkce karakteri ingilizce karaktere cevirce�iz

    bunu yaparken arraylerden bir map olusturp o mapi kullanl�m

 */

    static char[] turkishWords = {'�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
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
        System.out.println(harfDegistir("�eki�iyor"));
    }
}
