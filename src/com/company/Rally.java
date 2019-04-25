package com.company;

public class Rally {
    protected static int km = 900000;
    private static int prize = 10;
     private String name = "Ukraine";
    private int quantity = 30;
    private String quality = "great";

    /*
                Конструктор по дефолту
                 */
    public Rally() {
        System.out.println("Name of Country is " + name);
        System.out.println("Quantity of cars per minute is " + getQuantity());
        System.out.println("Quality of auto rally  " + getQuality());

    }
    //Конструктор з 4 параметрами
    public Rally(int prize, String name, String quality, int quantity) {
        this.prize = prize;
        this.name = name;
        this.quality = quality;
        this.quantity = quantity;
        System.out.println(prize + name + quantity + quality);
    }

    //Конструктор з всіма параметрами
    public Rally(int prize, String name, int weightLim, int km, String quality, int quantity) {
        this.prize = prize;
        this.name = name;

        this.km = km;
        this.quality = quality;
        this.quantity = quantity;
        System.out.println(prize + name + weightLim + km + quantity + quality);
    }

    public static int getPrize() {
        return prize;
    }

    public static void setPrize(int prize) {
        Rally.prize = prize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public String getQuality() {
        return quality;
    }


    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rally{" +
        
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", quality='" + quality + '\'' +
                '}'; 
    }
}
