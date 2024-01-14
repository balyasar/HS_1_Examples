package com.yasar.lesson005;

import java.util.Arrays;

public class Runner_Array_Test {
    public static void main(String[] args) {
        //Array tanımlama yöntemleri
        int[] sayilar = new int[4]; // {0,0,0,0} default değeri 0'dır !!
        int sayilar2[] = {1, 57, 7, 14, 551, 3};

        sayilar[0] = 5;
        sayilar[1] = 15;
        sayilar[2] = 15154;
        sayilar[3] = 545;

        System.out.println(sayilar[0]);
        System.out.println(sayilar[2]);

        String value = Arrays.toString(sayilar);
        System.out.println(value);
        System.out.println(Arrays.toString(sayilar2));

        String[] strings = new String[3]; // default değeri null!!
        strings[0] = "Yasar";
        strings[1] = "Ankara";
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);

        float[] floats;
        double[] doubles;
        long[] longs;
        char[] chars;
        byte[] bytes;
        short[] shorts;
        boolean[] booleans = new boolean[4]; // default değeri false
        System.out.println(booleans[0]);
        Integer[] integers = new Integer[3]; //Wrapper sınıfları default değeri null !!
        System.out.println(integers[0]);
        Object[] objects = new Object[3]; // Object sınıfları default değeri null!!
        System.out.println(objects[0]);
        Object[] objects1 = {5, "Yasar", false, 3.1, 'c'};
    }
}
