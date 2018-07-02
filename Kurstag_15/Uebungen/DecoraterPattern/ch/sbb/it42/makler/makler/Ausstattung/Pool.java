package makler.Ausstattung;

import makler.Wohnung;

public class Pool extends Ausstattung {
    public Pool(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 10000;
    }
}
