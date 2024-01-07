package com.yasar.lesson004;

public class Runner_Question_1 {
    public static void main(String[] args) {
        /**
         * kelimeyi virgüllerden ayırıp her değer alt alta yazdıralım. (Split metodu kullanmadan)
         */
        String kelime="Java,React,Css,Html";
/// 1. Çözüm
        for (int i = 0; i <kelime.length() ; i++) {
            int index=kelime.indexOf(",");
            if (index!=-1){
                System.out.println(kelime.substring(0,index));
                kelime=kelime.substring(index+1);
            }else {
                System.out.println(kelime);
            }
        }
////2.çözüm
        System.out.println("====2.çözüm========");
        kelime="Java,React,Css,Html";
        int index=0;
        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)==','){
                System.out.println(kelime.substring(index,i));
                index=i+1;
            }
        }
        System.out.println(kelime.substring(index));
/// 3.çözüm
        System.out.println("=====3.çözüm=====");
        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)==','){
                System.out.println();
            }else {
                System.out.print(kelime.charAt(i));
            }
        }
///4.çözüm
        System.out.println();
        System.out.println("=====4.çözüm=====");
        System.out.println(kelime.replace(",","\n"));
    }
}
