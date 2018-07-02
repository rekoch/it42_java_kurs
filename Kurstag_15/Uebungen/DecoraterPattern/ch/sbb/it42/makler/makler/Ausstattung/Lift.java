package makler.Ausstattung;

import makler.Wohnung;

public class Lift extends Ausstattung {
    public Lift(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 100000;
    }
}
