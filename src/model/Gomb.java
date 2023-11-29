package model;

public class Gomb extends FaIdom {
    private double sugar;

    @Override
    public String toString() {
        return "Gomb{" + "sugar=" + sugar + '}';
    }

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        double terfogat = (4.0 / 3.0) * Math.PI * (sugar*sugar*sugar);
        return terfogat;
    }
}
