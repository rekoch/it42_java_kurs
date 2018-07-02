package makler.Ausstattung;

import makler.Wohnung;

public class Stuhl extends Ausstattung{
    public Stuhl(Wohnung wohnung) {
        super(wohnung);
    }

    @Override
    public double berechneWert() {
        return getWohnung().berechneWert() + 50;
    }
}
