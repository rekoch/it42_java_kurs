package makler.Ausstattung;

import makler.Wohnung;

public class Frau extends Ausstattung {
    public Frau(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 999999999;
    }
}
