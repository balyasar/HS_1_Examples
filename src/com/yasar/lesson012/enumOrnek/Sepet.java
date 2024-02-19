package com.yasar.lesson012.enumOrnek;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Sepet {
    private String id;
    private List<EUrun> urunler;
    private double total = 0;
    private int urunSayisi = 0;


    public Sepet() {
        this.id = UUID.randomUUID().toString();
        this.urunler = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sepet{");
        sb.append("id='").append(id).append('\'');
        sb.append(", urunler=").append(urunler);
        sb.append(", total=").append(total);
        sb.append(", urunSayisi=").append(urunSayisi);
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EUrun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<EUrun> urunler) {
        this.urunler = urunler;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }
}

