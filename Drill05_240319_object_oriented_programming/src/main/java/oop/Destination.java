package oop;

public class Destination {

    private String desName;
    private double distance;
    private int spendTime;
    private String[] trans;

    public Destination(){

    }

    public Destination(String desName, double distance, int spendTime, String[] trans) {
        this.desName = desName;
        this.distance = distance;
        this.spendTime = spendTime;
        this.trans = trans;
    }
}
