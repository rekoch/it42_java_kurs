package makler.Ausstattung;

import makler.Wohnung;

public class Bett extends Ausstattung{
    public Bett(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 1500;
    }
}
