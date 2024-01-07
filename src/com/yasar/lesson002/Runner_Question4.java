package com.yasar.lesson002;

import java.util.Scanner;

public class Runner_Question4 {
    public static void main(String[] args) {
        /**
         * Pizza boyutu seçeceğiz
         * dışarıdan bir seçim alacağız
         * S --> küçük boy seçtiniz
         * M --> orta boy seçtiniz
         * L --> büyük boy seçtiniz
         * XL --> Ekstra büyük boy seçtiniz
         */

        System.out.println("""
                Pizza Boyutları     
                S --> küçük boy
                M --> orta boy
                L --> büyük boy
                XL --> Ekstra büyük boy
               """);
        System.out.print("Lütfen pizzanın boyunu seçiniz ..... : ");
        String pizza = new Scanner(System.in).nextLine();
        switch (pizza) {
            case "S":
                System.out.println("Küçük boy pizza seçtiniz");
                break;
            case "M":
                System.out.println("Orta boy pizza seçtiniz");
                break;
            case "L":
                System.out.println("Büyük boy pizza seçtiniz");
                break;
            case "XL":
                System.out.println("Ekstra boy pizza seçtiniz");
                break;
            default:
                System.out.println("Hatali bir giriş yaptınız !!!");
        }
    }
}
