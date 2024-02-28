package com.yasar.lesson013.stack;

import java.util.Stack;

public class StackOrnek {
    /**
     * YIGIN
     * LIFO --> Last in Firs Out
     * <p>
     * Bir stack olu�turaca��z
     * ��ine 6,7 de�er ekleyece�iz.
     * <p>
     * 100 TL'den b�y�kleri ba�ka bir stack yap�s�nda toplayaca��z.
     * 100 TL'den k���k de�erlerin ise toplam�n� bulup yazd�ral�m.
     */
    public static void main(String[] args) {
        Stack<Integer> paraStack = new Stack<>();
        Stack<Integer> yuzdenBuyukler = new Stack<>();
        int toplam = 0;
        paraStack.push(150);
        paraStack.push(50);
        paraStack.push(99);
        paraStack.push(654);
        paraStack.push(35);
        paraStack.push(43);
        paraStack.push(990);

        /*for (Integer para : paraStack) {
            if (para > 100) {
                yuzdenBuyukler.push(para);
            } else {
                toplam += para;
            }
        }
        */
        while (!paraStack.isEmpty()) {
            if (paraStack.peek() > 100) {
                yuzdenBuyukler.push(paraStack.pop());
            } else {
                toplam += paraStack.pop();
            }
        }

        System.out.println("100'den k���klerin toplam� ... : " + toplam);
        System.out.println(yuzdenBuyukler);
    }
}
