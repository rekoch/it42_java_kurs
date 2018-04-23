package gluecksspiel;

import java.util.Random;

public class Automat extends GluecksSpiel {

    public Automat(double geld) {
        super(geld);
    }

    @Override
    public double spiele() {
        double zufallsZahl = new Random().nextDouble();

        if (zufallsZahl < 0.9){
            return getGeld()*2;
        }
        return 0;
    }
}
