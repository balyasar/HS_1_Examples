package com.yasar.lesson003;

import java.util.Scanner;

public class Runner_Question2 {
    public static void main(String[] args) {
        /**
         * Dışarıdan bir kelime gireceğiz ve harfi başına index nuamrası gelecek şekilde yazdıracağız.
         * Java
         * 0 - J
         * 1 - a
         * 2 - v
         * 3 - a
         *
         */
        System.out.print("Lütfen bir kelime giriniz .... : ");
        String kelime = new Scanner(System.in).nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(i + " - " + kelime.charAt(i));
        }
    }
}
