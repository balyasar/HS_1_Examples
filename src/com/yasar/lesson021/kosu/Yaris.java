package com.yasar.lesson021.kosu;

public class Yaris {
    public static void main(String[] args) {
        Kosucu kosucu1 = new Kosucu("Yasar",100);
        Kosucu kosucu2 = new Kosucu("Deniz",100);
        Kosucu kosucu3 = new Kosucu("Yiðit",100);
        Kosucu kosucu4 = new Kosucu("Toprak",100);
        Kosucu kosucu5 = new Kosucu("Ahmet",100);

        new Thread(kosucu1).start();
        new Thread(kosucu2).start();
        new Thread(kosucu3).start();
        new Thread(kosucu4).start();
        new Thread(kosucu5).start();
    }
}
