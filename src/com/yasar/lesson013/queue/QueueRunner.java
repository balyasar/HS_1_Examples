package com.yasar.lesson013.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Kuyruk
 * <p>
 * FIFO --> First in first out
 */

public class QueueRunner {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.offer(20);
        integerQueue.add(30);
        integerQueue.add(40);
        integerQueue.add(50);

        while (!integerQueue.isEmpty()) {
            System.out.println(integerQueue.poll());
        }

        Queue<Integer> integerQueue1 = new ArrayBlockingQueue<>(5);
        integerQueue1.offer(60);
        integerQueue1.offer(70);
        integerQueue1.offer(80);
        integerQueue1.offer(90);
        integerQueue1.offer(100);
        integerQueue1.offer(110); // bunu eklemez ancak offer sayesinde hata da fýrlatmaz. Eðer add ile eklenseydi hata alýnmýþ olurdu.
        System.out.println("------------------------------");
        while (!integerQueue1.isEmpty()) {
            System.out.println(integerQueue1.poll());
        }

        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("Yaþar");
        stringQueue.offer("Kübra");
        stringQueue.offer("Toprak");
        stringQueue.offer("Serkan");
        stringQueue.offer("Pýnar");
        stringQueue.offer("Mustafa");
        stringQueue.offer("Ali");
        stringQueue.offer("Ayþe");
        stringQueue.offer("Mehmet");
        System.out.println("------------------------------");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
