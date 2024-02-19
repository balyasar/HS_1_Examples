package com.yasar.lesson012.enumOrnek;

public enum EUrun {
    CIPS(25.99D, 17),
    KOLA(23.50D, 51),
    SEKER(140D, 10),
    YAG(1100D, 5),
    UN(169D, 12),
    EKMEK(8D, 100),
    CAY(149D, 20),
    YUMURTA(120D, 15),
    YOGURT(89D, 22),
    SUT(34.90D, 19);

    private double price;
    private int stock;

    EUrun(double price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
