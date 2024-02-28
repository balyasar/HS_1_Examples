package com.yasar.lesson013.stack;

/**
 * Her tabakta bir id bir de kirli olup olmad���n� tutan bir veri
 * 1 - Manager s�n�f�m�z olacak
 *   Manager s�n�f�nda 10 tane tabak �retece�iz. Bunlar�n kirli olup olmad�klar� da rastgele gelecek.
 *   Temizleri bir stackte toplayaca��z. Kirlileri ba�ka bir stackte toplayaca��z.
 *
 *   Kullan metodu yazal�m --> temizlerdeki bir taba�� alacak ve bunu kirletecek.
 */
public class Tabak {
    private int id;
    private boolean isDirty;

    public Tabak(int id) {
        this.id = id;
    }

    public Tabak(int id, boolean isDirty) {
        this.id = id;
        this.isDirty = isDirty;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tabak{");
        sb.append("id=").append(id);
        sb.append(", isDirty=").append(isDirty);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
}
