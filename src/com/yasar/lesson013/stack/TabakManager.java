package com.yasar.lesson013.stack;

import java.util.Random;
import java.util.Stack;

public class TabakManager {
    private Stack<Tabak> kirliTabakStack;
    private Stack<Tabak> temizTabakStack;

    public TabakManager() {
        this.kirliTabakStack = new Stack<>();
        this.temizTabakStack = new Stack<>();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("tabakManager{");
        sb.append("kirliTabakStack=").append(kirliTabakStack);
        sb.append(", temizTabakStack=").append(temizTabakStack);
        sb.append('}');
        return sb.toString();
    }

    public Stack<Tabak> getKirliTabakStack() {
        return kirliTabakStack;
    }

    public void setKirliTabakStack(Stack<Tabak> kirliTabakStack) {
        this.kirliTabakStack = kirliTabakStack;
    }

    public Stack<Tabak> getTemizTabakStack() {
        return temizTabakStack;
    }

    public void setTemizTabakStack(Stack<Tabak> temizTabakStack) {
        this.temizTabakStack = temizTabakStack;
    }

    public void tabakOlustur() {
        Random random = new Random();
        for (int i = 1; i < 11; i++) {
            Tabak tabak = new Tabak(i, random.nextBoolean());
            if (tabak.isDirty()) {
                kirliTabakStack.push(tabak);
            } else {
                temizTabakStack.push(tabak);
            }
        }
    }

    public void kullan() {
        if (temizTabakStack.isEmpty()) {
            System.out.println("Temiz tabak kalmamýþtýr.");
            temizle();
        }
        Tabak tabak = temizTabakStack.pop();
        System.out.println(tabak.getId() + " id'li tabak kullanýlmýþtýr.");
        tabak.setDirty(true);
        kirliTabakStack.push(tabak);
    }

    public void temizle() {
        if (kirliTabakStack.isEmpty()) {
            System.out.println("Kirli tabak kalmamýþtýr.");
            kullan();
        }
        Tabak tabak = kirliTabakStack.pop();
        System.out.println(tabak.getId() + " id'li tabak temizlenmiþtir..");
        tabak.setDirty(false);
        temizTabakStack.push(tabak);
    }

    public void secimYap(int secim) {
        switch (secim) {
            case 1:
                kullan();
                break;
            case 2:
                temizle();
                break;
            default:
                break;
        }
    }
}
