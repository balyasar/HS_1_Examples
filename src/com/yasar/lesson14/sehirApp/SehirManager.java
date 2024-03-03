package com.yasar.lesson14.sehirApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SehirManager {
    static List<Sehir> sehirList = new ArrayList<>(List.of(
            new Sehir(SehirDatabase.sehirler[0], 2_000_000, "01", EBolge.BOLGE_1),
            new Sehir(SehirDatabase.sehirler[14], 60_000, "15", EBolge.BOLGE_2),
            new Sehir(SehirDatabase.sehirler[70], 300_000, "71", EBolge.BOLGE_3),
            new Sehir(SehirDatabase.sehirler[80], 200_000, "81", EBolge.BOLGE_4),
            new Sehir(SehirDatabase.sehirler[31], 1_000_000, "32", EBolge.BOLGE_1),
            new Sehir(SehirDatabase.sehirler[5], 7_500_000, "06", EBolge.BOLGE_3)
    ));

    public static void main(String[] args) {
        System.out.println("-------  ADA GÖRE SIRALAMA  -------");
        Collections.sort(sehirList);
        sehirList.forEach(System.out::println);

        System.out.println("-------  NÜFUSA GÖRE SIRALAMA  -------");
        Comparator nufusaGore = new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return (int) (o1.getNufus() - o2.getNufus());
            }
        };
        Collections.sort(sehirList,nufusaGore);
        sehirList.forEach(System.out::println);

        System.out.println("-------  PLAKAYA GORE SIRALAMA  -------");
        Collections.sort(sehirList, (x,y)-> x.getPlakaNo().compareTo(y.getPlakaNo()));
        sehirList.forEach(System.out::println);

    }
}


