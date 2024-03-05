package com.yasar.lesson15;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * distinct()
 * reduce()
 * limit()
 * skip()
 * max()
 * min()
 * count()
 * sorted()
 * toMap()
 * groupingBy()
 * doubleAverage()
 * mapToInt(), mapToDouble()
 */

public class StreamOrnek2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(50, 80, 75, 24, 93, 102));
        //bu deðerlerin toplamýný bulalým.

        Optional<Integer> toplam1 = list.stream().reduce((x, y) -> x + y);
        System.out.println(toplam1);
        Integer toplam2 = list.stream().reduce(5, (x, y) -> x + y);
        System.out.println(toplam2);
        System.out.println("----------------------------------------------");
        list.stream().reduce((x, y) -> x - y).ifPresent(System.out::println);
        System.out.println(list.stream().reduce(450, (x, y) -> x - y));
        System.out.println("----------------------------------------------");
        // IntStream'ýn sum metodunu kullanarak toplama iþlemi yapýyoruz.
        Integer toplam3 = list.stream().mapToInt(x -> x).sum();
        System.out.println(toplam3);
        // Ortalama
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
        System.out.println(list.stream().mapToDouble(Integer::doubleValue).average());
        Double ortalama =  list.stream().collect(Collectors.averagingDouble((x -> x)));
        System.out.println(ortalama);
        //Listenin istatistiklerini görme
        IntSummaryStatistics statistics = list.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println("statistics");
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getSum());



    }


}
