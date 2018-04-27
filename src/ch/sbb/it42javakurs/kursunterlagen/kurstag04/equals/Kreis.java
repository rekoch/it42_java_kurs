/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag04.equals;

public class Kreis {
    private double xPosition;
    private double yPosition;
    private double radius;
    // wir nehmen an, dass das folgende Attribut nicht relevant für die Gleichwertigkeit sei:
    private String farbe;

    public Kreis(double xPosition, double yPosition, double radius, String farbe) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
        this.farbe = farbe;
    }


    // Wurde generiert mit Alt+Insert / "equals and hashCode" Shortcut.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Kreis)) {
            return false;
        }

        Kreis kreis = (Kreis) o;

        if (Double.compare(kreis.xPosition, xPosition) != 0) {
            return false;
        }
        if (Double.compare(kreis.yPosition, yPosition) != 0) {
            return false;
        }
        return Double.compare(kreis.radius, radius) == 0;
    }


    // Diese Methode muss immer mit equals mitgeneriert werden!
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(xPosition);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(yPosition);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
