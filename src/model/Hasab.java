package model;

public class Hasab extends FaIdom {
    private int magassag;
    private int a, b;

    @Override
    public String toString() {
        return "Hasab{"  + "a=" + a + ", b=" + b + ", magassag=" + magassag+'}';
    }

    public Hasab(int a, int b, int magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
        double terfogat = magassag * a * b;
        return terfogat;
    }
}
