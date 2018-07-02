package makler;

import makler.Wohnung;

public class EinfacheWohnung extends Wohnung {

    @Override
    public double berechneWert() {
        return 100000;
    }
}
