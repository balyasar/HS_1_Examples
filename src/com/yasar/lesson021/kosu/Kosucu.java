package com.yasar.lesson021.kosu;

/**
 * Koþucularýmýz var --> Ýsmi kat edeceði mesafe süre ve baþlangýç zamaný olsun
 * Adým uzunluðu -> bu hepsi için 1 metre
 * <p>
 * Koþucu sýnýfýmýz thread gibi çalýþacak koþucularýn kaç metre koþacaklarý yarýþ sýnýfýnda belirlenecek (100 metre)
 * Her defasýnda adým uzunluðu kadar yol kat edecek
 * Her 10 metrede bir çýktý verelim Mustafa -> 10 metrede, Mustafa -> 20 metrede, ....... Mustafa -> 100. metrede
 * Çýktýlarýný verelim. yarýþ sonundada Mustafa adlý koþucu 100 metreyi 2000 ms'de koþtu diye çýktý verelim.
 * <p>
 * Daha sonra yarýþ sýnýfýnda 5 tane koþucu oluþturup bu threadleri baþlatýp yarýþ sonucunu gözlemleyelim.
 */
public class Kosucu implements Runnable {
    private Long id;
    private String name;
    private int distance;
    private Long raceTime;
    private Long startTime;
    private Long endTime;
    private int stepLenght;

    public Kosucu(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kosucu{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", distance=").append(distance);
        sb.append(", raceTime=").append(raceTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", stepLenght=").append(stepLenght);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Long getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(Long time) {
        this.raceTime = time;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public int getStepLenght() {
        return stepLenght;
    }

    public void setStepLenght(int stepLenght) {
        this.stepLenght = stepLenght;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public void run() {
        int startLenght = 0;
        this.startTime = System.nanoTime();
        for (int i = 1; i <= distance; i++) {
            startLenght++;
            if (startLenght % 10 == 0) {
                System.out.println(this.name + " " + startLenght + ". metrede");
            }
        }
        this.endTime = System.nanoTime();
        this.raceTime = this.endTime - this.startTime;
        System.out.println(this.name + " " + distance + " metreyi " + this.raceTime + " nano saniyede tamamladý.");
    }
}
