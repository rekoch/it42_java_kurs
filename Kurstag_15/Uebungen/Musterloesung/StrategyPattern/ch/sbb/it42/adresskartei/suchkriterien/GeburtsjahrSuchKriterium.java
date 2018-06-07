package ch.sbb.it42.adresskartei.suchkriterien;

import ch.sbb.it42.adresskartei.Adresse;
import ch.sbb.it42.adresskartei.SuchKriterium;

/**
 * Eine konkrete Strategy.
 */
public class GeburtsjahrSuchKriterium implements SuchKriterium {
    private final int gesuchtesGeburtsjahr;

    public GeburtsjahrSuchKriterium(int gesuchtesGeburtsjahr) {
        this.gesuchtesGeburtsjahr = gesuchtesGeburtsjahr;
    }

    @Override
    public boolean istGesucht(Adresse adresse) {
        return gesuchtesGeburtsjahr == adresse.getGeburtsjahr();
    }
}
