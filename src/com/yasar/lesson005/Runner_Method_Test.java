package com.yasar.lesson005;

public class Runner_Method_Test {
    public static void main(String[] args) {
        method1();
        method2("Yasar", 1991);
        System.out.println("Sonuc ......... : " + method3());
        System.out.println(method4("Yasar", 1991));
    }//main sonu

    // void Geri Dönüşü Olmayan Methodlar
    // Geri Dönüşsüz ve Parametresiz Methodlar
    public static void method1() {
        System.out.println("Method1 çalıştı...");
        int s1 = 15, s2 = 6;
        int result = s1 - s2;
        System.out.println("Sonuc ...... : " + result);
    }

    // Geri Dönüşsüz ve Parametreli Methodlar
    public static void method2(String name, int dogumYili) {
        System.out.println("Method2 çalıştı...");
        System.out.println(name + " adlı kullanıcının yaşı ==> " + (2024 - dogumYili));
    }

    //Return type Methodlar
    //Return type ve parametresiz
    public static int method3() {
        System.out.println("Method3 çalıştı...");
        int s1 = 15, s2 = 6;
        int result = s1 - s2;
        return result;
    }

    //Return type ve parametreli
    public static String method4(String name, int dogumYili) {
        System.out.println("Method4 çalıştı...");
        return name + " adlı kullanıcının yaşı ==> " + (2024 - dogumYili);
    }

}//class sonu
