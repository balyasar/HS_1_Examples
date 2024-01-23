package com.yasar.lesson007;

public class ReferenceTypeVsPrimitiveType {
    public static void main(String[] args) {
        /**
         * primitive --> byte, short, int, long, char, boolean,...
         * Reference --> String Array, Object, Scanner   Wrapper --> Integer, Double,...
         */

        int a = 3, b = 4;
        System.out.println(a);
        System.out.println(b);
        System.out.println("//////////////");
        a = b;
        b = 12;
        System.out.println(a);
        System.out.println(b);

        String[] cities = {"Ankara", "İstanbul", "İzmir"};
        String[] cities2 = {"Bursa", "Yalova", "Mersin"};
        System.out.println(cities[0]);
        System.out.println(cities2[0]);
        System.out.println("///////////////");
        cities2 = cities;
        System.out.println(cities2[0]);
        cities[0] = "Bolu";
        System.out.println(cities[0]);
        System.out.println(cities2[0]);
        cities2[1]="Edirne";
        System.out.println(cities[1]);
        System.out.println(cities2[1]);
    }
}
