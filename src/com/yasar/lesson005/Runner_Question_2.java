package com.yasar.lesson005;

import java.util.Scanner;

public class Runner_Question_2 {
    public static void main(String[] args) {
        /**
         * dışardan bir dizi uzunluğu alacağız.
         * Daha sonra diziyi tanımlayıp tek tek kullanıcıdan verileri alarak bu diziyi dolduracağız.
         * En son diziyi yazdıracağız.
         *
         * 1 --> Dizi boyutunu belirleyen bir method
         * 2 --> Diziyi oluşturup dönen bir method
         * 3 --> Diziyi doldurduğumuz bir method
         * 4 --> Diziyi yazdırdığımız bir method
         */
        
        print();
    }

    public static int arrayLenght() {
        System.out.print("Dizinin uzunluğunu giriniz .... : ");
        int lenght = new Scanner(System.in).nextInt();
        return lenght;
    }

    public static int[] array() {
        int[] ints = new int[arrayLenght()];

        return ints;
    }

    public static int[] filltheArray() {
        int[] temp = array();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz .... : ");
            int eleman = scan.nextInt();
            temp[i] = eleman;
        }
        return temp;
    }

    public static void print() {
        int[] ints = filltheArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "  ");
        }
    }


}
