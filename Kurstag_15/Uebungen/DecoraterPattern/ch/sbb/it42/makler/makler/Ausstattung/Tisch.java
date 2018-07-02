package makler.Ausstattung;

import makler.Wohnung;

public class Tisch extends Ausstattung {
    public Tisch(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 100;
    }
}