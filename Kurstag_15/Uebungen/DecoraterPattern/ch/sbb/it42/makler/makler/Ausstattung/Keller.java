package makler.Ausstattung;

import makler.Wohnung;

public class Keller extends Ausstattung {
    public Keller(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 50000;
    }
}
