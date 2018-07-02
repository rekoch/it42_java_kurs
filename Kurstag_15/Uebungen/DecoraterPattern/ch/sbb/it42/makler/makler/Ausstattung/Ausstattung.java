package makler.Ausstattung;

import makler.Wohnung;

public abstract class Ausstattung extends Wohnung {
    private Wohnung wohnung;

    public Ausstattung(Wohnung wohnung) {
        this.wohnung = wohnung;
    }

    public Wohnung getWohnung() {
        return wohnung;
    }

    public void setWohnung(Wohnung wohnung) {
        this.wohnung = wohnung;
    }
}
