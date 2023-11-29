package model;

public abstract class FaIdom {

    private static final double fajsuly = 0.8;

    public abstract double terfogat();

    public double suly() {
        return terfogat() * fajsuly;
    }
}
