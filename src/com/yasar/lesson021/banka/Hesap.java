package com.yasar.lesson021.banka;


public class Hesap {
    private double bakiye;


    public void paraCek(int miktar) {
        this.bakiye -= miktar;
        System.out.println("�ekildikten sonra Bakiye .... : " + bakiye);
    }

    public void paraYatir(int miktar) {
        this.bakiye += miktar;
        System.out.println("Yat�r�ld�ktan sonra Bakiye .... : " + bakiye);
    }
}
