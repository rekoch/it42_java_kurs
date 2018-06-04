package ch.sbb.it42.adresskartei.suchkriterien;

import ch.sbb.it42.adresskartei.Adresse;
import ch.sbb.it42.adresskartei.SuchKriterium;

/**
 * Eine weitere konkrete Strategy. Hier wird intern auf andere Strategien delegiert.
 */
public class KombiniertesSuchKriterium implements SuchKriterium {

    private final SuchKriterium suchKriterium1;
    private final SuchKriterium suchKriterium2;

    public KombiniertesSuchKriterium(SuchKriterium suchKriterium1, SuchKriterium suchKriterium2) {
        this.suchKriterium1 = suchKriterium1;
        this.suchKriterium2 = suchKriterium2;
    }

    @Override
    public boolean istGesucht(Adresse adresse) {
        return suchKriterium1.istGesucht(adresse) && suchKriterium2.istGesucht(adresse);
    }
}
