package com.yasar.lesson003;

import java.util.Scanner;

public class Runner_Question3 {
    public static void main(String[] args) {
        /**
         * dışarıdan bir kelime ve harf alacağız.
         * dışarıdan aldığımız harf bu kelimenin içinde kaç defa geçiyor. Onu bulalım.
         */
        System.out.print("Bir kelime giriniz .... : ");
        String kelime = new Scanner(System.in).nextLine();
        System.out.print("Aramak istediğiniz harfi giriniz .... : ");
        String harf = new Scanner(System.in).nextLine();
        int count = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == harf.charAt(0)) {
                count++;
            }
        }
        System.out.println(harf + " harfi" + kelime + " içinde " + count + " kere geçmektedir.");
    }
}
